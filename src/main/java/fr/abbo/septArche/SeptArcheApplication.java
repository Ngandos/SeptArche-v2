package fr.abbo.septArche;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		//CONFIGURATION SWAGGER API
		info = @Info(
				title = "7 Eme Arche",
				version = "1.0.0",
				description = "L'application 7ème Arche est une librairie dédiée à la vente d'articles sur le cinéma." +
						" Elle offre une plateforme permettant aux utilisateurs de découvrir, " +
						"explorer et acheter des produits liés au monde du cinéma, tels que des livres, des affiches de films," +
						" des souvenirs et d'autres articles de collection. L'application propose une large gamme de produits," +
						" couvrant divers genres de films, réalisateurs, acteurs et périodes cinématographiques. " +
						"Elle vise à fournir une expérience immersive aux passionnés de cinéma, en leur offrant " +
						"un accès pratique à une sélection de produits liés à leur passion pour le septième art.",
				termsOfService = "Demos",
				contact = @Contact(
						name = "DHIF MOHAMED",
						email = "octo.technology@gmail.fr"

				),

				license = @License(
						name = "licence"

				)
		)
)

public class SeptArcheApplication {
	public static void main(String[] args) {
		SpringApplication.run(SeptArcheApplication.class, args);
	}
}
