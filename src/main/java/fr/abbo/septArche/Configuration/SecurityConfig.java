package fr.abbo.septArche.Configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import fr.abbo.septArche.Configuration.CustomUserDetailsService;

import static org.springframework.boot.autoconfigure.security.servlet.PathRequest.toH2Console;
import static org.springframework.boot.autoconfigure.security.servlet.PathRequest.toStaticResources;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Autowired
    private CustomUserDetailsService customUserDetailsService;

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.cors();
        return http.authorizeHttpRequests(auth -> {

        //Admins Rights.........................................................

            auth.requestMatchers("/admin").hasRole("ADMIN");
            auth.requestMatchers("/client").permitAll();

        //Users Rights..........................................................

            auth.requestMatchers("/user").permitAll();

        //All Access.............................................................

            auth.requestMatchers("/articles").permitAll();
            auth.requestMatchers("/livres").permitAll();
            auth.requestMatchers("/login").permitAll();
            auth.requestMatchers("/categorie").permitAll();
            auth.requestMatchers("/commande").permitAll();
            auth.requestMatchers(HttpMethod.POST,"/commande").permitAll();
            auth.requestMatchers(HttpMethod.POST,"/user").permitAll();

            auth.requestMatchers(toH2Console());
            auth.anyRequest().permitAll();
        }).formLogin(Customizer.withDefaults()).build();
    }

    @Bean
    public UserDetailsService users() {

        UserDetails user = User.builder()
            .username("user")
            .password(passwordEncoder().encode("user"))
            .roles("USER").build();
        UserDetails admin = User.builder()

            .username("admin")
            .password(passwordEncoder().encode("admin"))
            .roles("USER", "ADMIN").build();

        return new InMemoryUserDetailsManager(user, admin);
    }

    @Bean
    public AuthenticationManager authenticationManager(HttpSecurity http, BCryptPasswordEncoder bCryptPasswordEncoder)
        throws Exception {
            AuthenticationManagerBuilder authenticationManagerBuilder =
                http.getSharedObject(AuthenticationManagerBuilder.class);
            authenticationManagerBuilder.userDetailsService(customUserDetailsService)
                .passwordEncoder(bCryptPasswordEncoder);
            return authenticationManagerBuilder.build();
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}

