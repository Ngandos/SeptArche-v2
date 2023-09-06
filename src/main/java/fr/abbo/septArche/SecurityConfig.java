package fr.abbo.septArche;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;
@Configuration
@EnableWebSecurity
public class SecurityConfig {

    // on explique à Spring qu'on accède aux utilisateurs avec JDBC.....................................................
    @Bean
    public UserDetailsService userDetailsService(DataSource datasource) {
        return new JdbcUserDetailsManager(datasource);
    }

    /*@Bean
    public InMemoryUserDetailsManager userDetailsService(PasswordEncoder passwordEncoder) {
        UserDetails user = User.withUsername("user")
            .password(passwordEncoder.encode("password"))
            .roles("USER")
            .build();

        UserDetails admin = User.withUsername("admin")
            .password(passwordEncoder.encode("admin"))
            .roles("USER", "ADMIN")
            .build();

        return new InMemoryUserDetailsManager(user, admin);
    }*/

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

    // csrf : cross site request forgery : système d'attaque quand on est authentifié et que
    // l'authentification est conservée
    // par défaut Spring met en place des tockens csrf
    // je retire la protection pour faire fonctionner mes essais avec postman, mais à remettre ensuite !

        http.csrf().disable();

    // Spring security by default protects every endpoint.
    // However, this would cause CORS errors since a browser’s OPTIONS preflight requests would be blocked.
    // To make Spring Security bypass preflight requests we need to add http.cors()

        http.cors();

    //http.csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse());
    /* version avec basic auth */

        http
            .authorizeHttpRequests(
                (authorize) -> authorize
                    .requestMatchers("/articles/**").permitAll() //On permet a tout utilisateur de consulter la liste des articles
                    .requestMatchers(HttpMethod.POST,"/login").hasRole("USER") //Seuls les utilisatueurs enregistrés peuvent se connecter
                    .requestMatchers(HttpMethod.POST,"/commandes/**").hasRole("USER") // Seuls les utilisateur authentifiés peuvent commander
                    .anyRequest().denyAll()
            )
            .httpBasic(Customizer.withDefaults());
        return http.build();

    }

    @Bean
    public PasswordEncoder bcryptEncoder() {
        return new BCryptPasswordEncoder(BCryptPasswordEncoder.BCryptVersion.$2Y, 12);
    }
}

