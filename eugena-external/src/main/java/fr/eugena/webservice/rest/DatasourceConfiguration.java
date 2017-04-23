package fr.eugena.webservice.rest;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

/**
 * Classe de configuration Spring (@Configuration) du Datasource utilisé par
 * Spring-JDBC.
 * 
 * 
 * @author g1986_informatique
 *
 */
@Configuration
public class DatasourceConfiguration {

	/**
	 * Injection du bean Spring propertiesConfiguration
	 */
	@Autowired
	private PropertiesConfiguration propertiesConfiguration;

	/**
	 * Création du bean de nom = dataSource qui correspond à un objet de type
	 * (de classe) BasicDataSource de la librairie Apache Commons DBCP
	 * (implémente javax.sql.DataSource)
	 * 
	 * @return
	 */
	@Bean
	public DataSource dataSource() {
		final BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName(propertiesConfiguration.getDatasourceDriver());
		ds.setUrl(propertiesConfiguration.getDatasourceUrl());
		ds.setUsername(propertiesConfiguration.getDatasourceUser());
		ds.setPassword(propertiesConfiguration.getDatasourcePassword());

		return ds;
	}

	/**
	 * Création du bean de nom = jdbcTemplate utilisé par Spring JDBC
	 * 
	 * @return
	 */
	@Bean
	public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(dataSource());
	}

	/**
	 * Création du bean de nom = transactionManager pour permettre aux API
	 * Spring JDBC de travailler en mode transactionnel lors de l'exécution des
	 * requêtes SQL (ouverture d'une transaction BDD, fermeture de la
	 * transaction par un commit (pas d'exception) ou rollback (exception levée)
	 * 
	 * @return
	 */
	@Bean
	public PlatformTransactionManager transactionManager() {
		return new DataSourceTransactionManager(dataSource());
	}

}
