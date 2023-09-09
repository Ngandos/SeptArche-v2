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

import static org.springframework.boot.autoconfigure.security.servlet.PathRequest.toH2Console;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    private PasswordEncoder passwordEncoder;

    /**Indique a Spring la Source des données*/
    @Bean
    public UserDetailsService userDetailsService(DataSource datasource) {
        return new JdbcUserDetailsManager(datasource);
    }

    /**
     * Configure l'encryption du password.
     */
    @Bean
    PasswordEncoder passwordEncoder() {
        return  new BCryptPasswordEncoder();
    }

    /**
     * Configure l'encryption du password en définissant le niveau d'Encryption.
     */
    /*@Bean
    public PasswordEncoder bcryptEncoder() {
        return new BCryptPasswordEncoder(BCryptPasswordEncoder.BCryptVersion.$2Y, 12);
    }*/

    /**
     * Définit les requetes authorisées et les niveaux d'accés utilisateurs
     */
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
            .authorizeHttpRequests((requests) -> requests

            /**Indique que toutes les requêtes sont regies par différents niveaux d'accès et donne l'accés a la console H2*/
                .requestMatchers(toH2Console()).permitAll() // <-
                .requestMatchers("/articles/**").permitAll()
                .requestMatchers(HttpMethod.POST,"/login").hasRole("USER")
                .requestMatchers(HttpMethod.POST,"/commandes/**").hasRole("USER")

            /**Indique que toutes les autres requêtes sont soumises a l'Authetification*/
                .anyRequest().authenticated()
            )

            /**Authorise l'accès a La base de sonnées en memoire*/
                .httpBasic(Customizer.withDefaults())
                .csrf((protection) -> protection
                .ignoringRequestMatchers(toH2Console()) // <-
            )
            .headers((header) -> header
                    .frameOptions().sameOrigin()
            );

        return httpSecurity.build();

    }


    /*@Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

    // csrf : cross site request forgery : système d'attaque quand on est authentifié et que
    // l'authentification est conservée
    // par défaut Spring met en place des tockens csrf
    // je retire la protection pour faire fonctionner mes essais avec postman, mais à remettre ensuite !

        http.csrf((protection) -> protection
          .ignoringRequestMatchers(toH2Console()));

    // Spring security by default protects every endpoint.
    // However, this would cause CORS errors since a browser’s OPTIONS preflight requests would be blocked.
    // To make Spring Security bypass preflight requests we need to add http.cors()

        http.cors();

    //http.csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse());
    *//* version avec basic auth *//*
        }
   */
}

