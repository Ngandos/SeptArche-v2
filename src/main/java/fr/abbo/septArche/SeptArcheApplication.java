package fr.abbo.septArche;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories(enableDefaultTransactions = false)

@SpringBootApplication
public class SeptArcheApplication {
	public static void main(String[] args) {

		System.setProperty("server.port", "8080");
		System.setProperty("server.servlet.context-path", "/demo");
		System.setProperty("spring.datasource.url", "jdbc:mysql://localhost:8889/7eArcheDB?createDatabaseIfNotExist=true");
		System.setProperty("spring.jpa.show-sql", "true");
		System.setProperty("spring.jpa.hibernate.ddl-auto", "update");
		System.setProperty("spring.datasource.username", "root");
		System.setProperty("spring.datasource.password", "root");
		System.setProperty("spring.jpa.properties.hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		System.setProperty("logging.level.root", "INFO");
		System.setProperty("spring.jpa.defer-datasource-initialization", "true");
		System.setProperty("logging.level.fr.abbo.septArche", "DEBUG");
		System.setProperty("management.endpoints.web.exposure.include", "*");


		SpringApplication.run(SeptArcheApplication.class, args);

	}

}


