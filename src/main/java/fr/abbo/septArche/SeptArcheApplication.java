package fr.abbo.septArche;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories(enableDefaultTransactions = false)

@SpringBootApplication
public class SeptArcheApplication {
	public static void main(String[] args) {

		SpringApplication.run(SeptArcheApplication.class, args);

	}

}


