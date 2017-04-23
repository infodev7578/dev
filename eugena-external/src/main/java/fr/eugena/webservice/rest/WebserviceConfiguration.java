package fr.eugena.webservice.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Classe de lancement de l'application via l'annotation @SpringBootApplication
 * Ajout de l'extension vers SpringBootServletInitializer pour le déployement
 * sur un serveur d'application (Tomcat, JBoss, Websphere, etc...)
 * 
 * @author g1986_informatique
 *
 */
@SpringBootApplication
public class WebserviceConfiguration extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(WebserviceConfiguration.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(WebserviceConfiguration.class, args);
	}
}
