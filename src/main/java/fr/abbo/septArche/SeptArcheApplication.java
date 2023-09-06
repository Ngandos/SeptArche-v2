package fr.abbo.septArche;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@EnableJpaRepositories(enableDefaultTransactions = false)

public class SeptArcheApplication {
	public static void main(String[] args) {
		SpringApplication.run(SeptArcheApplication.class, args);
	}
@Bean
PasswordEncoder passwordEncoder(){
		return  new BCryptPasswordEncoder();
	}

	@Bean
	CommandLineRunner commandLineRunner(JdbcUserDetailsManager jdbcUserDetailsManager) {

		PasswordEncoder passwordEncoder = passwordEncoder();
		return arg -> {
			//UserDetails u1 = jdbcUserDetailsManager.loadUserByUsername("user1");
			//verifie si l'utilisateur n'existe pas en bdd
			//if(u1==null)
				// methode de jdbcUserDetail pour la  creation d'un user
				jdbcUserDetailsManager.createUser(
						User.withUsername("user1")
								.password(passwordEncoder.encode("1234"))
								.roles("USER")
								.build()
				);
			/*UserDetails u2 = jdbcUserDetailsManager.loadUserByUsername("user2");
			if(u2==null)
				jdbcUserDetailsManager.createUser(
						User.withUsername("user2")
								.password(passwordEncoder.encode("3456"))
								.roles("USER")
								.build()
				);
			UserDetails u3 = jdbcUserDetailsManager.loadUserByUsername("user3");
			if(u3==null)
				jdbcUserDetailsManager.createUser(
						User.withUsername("user3")
								.password(passwordEncoder.encode("1234"))
								.roles("USER","ADMIN")
								.build()
				);*/
		};

	}
}


