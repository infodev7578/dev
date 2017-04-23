package fr.eugena.webservice.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Classe de configuration Spring via l'annotation @Configuration Cette classe
 * récupère les propriétés du fichier jdbc.properties contenu dans le classpath
 * (ici src/main/resources), via l'annotation @PropertySource.
 * 
 * Ces propriétés sont ici les paramètres de connexion à la BDD (MySQL, Oracle,
 * DB2, etc...)
 * 
 * @author g1986_informatique
 *
 */
@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertiesConfiguration {

	@Value("${datasource.driver}")
	private String datasourceDriver;

	@Value("${datasource.url}")
	private String datasourceUrl;

	@Value("${datasource.user}")
	private String datasourceUser;

	@Value("${datasource.password}")
	private String datasourcePassword;

	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}

	/**
	 * @return the datasourceUrl
	 */
	public String getDatasourceUrl() {
		return datasourceUrl;
	}

	/**
	 * @return the datasourceUser
	 */
	public String getDatasourceUser() {
		return datasourceUser;
	}

	/**
	 * @return the datasourcePassword
	 */
	public String getDatasourcePassword() {
		return datasourcePassword;
	}

	/**
	 * @param datasourceUrl
	 *            the datasourceUrl to set
	 */
	public void setDatasourceUrl(String datasourceUrl) {
		this.datasourceUrl = datasourceUrl;
	}

	/**
	 * @param datasourceUser
	 *            the datasourceUser to set
	 */
	public void setDatasourceUser(String datasourceUser) {
		this.datasourceUser = datasourceUser;
	}

	/**
	 * @param datasourcePassword
	 *            the datasourcePassword to set
	 */
	public void setDatasourcePassword(String datasourcePassword) {
		this.datasourcePassword = datasourcePassword;
	}

	/**
	 * @return the datasourceDriver
	 */
	public String getDatasourceDriver() {
		return datasourceDriver;
	}

	/**
	 * @param datasourceDriver
	 *            the datasourceDriver to set
	 */
	public void setDatasourceDriver(String datasourceDriver) {
		this.datasourceDriver = datasourceDriver;
	}

}
