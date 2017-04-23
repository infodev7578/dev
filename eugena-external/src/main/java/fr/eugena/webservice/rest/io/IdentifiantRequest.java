package fr.eugena.webservice.rest.io;

/**
 * Classe représentant l'objet JSON de la requête du WS Rest
 * 
 * Exemple de mapping JSON - Java : 
 * 
 * { "login":"Gilles", "password":"Eugena23*" }·
 * 
 * -->
 * 
 * new IdentifiantRequest("Gilles", "Eugena23$")
 * 
 * @author g1986_informatique
 *
 */
public class IdentifiantRequest {

	private String login;

	private String password;

	public IdentifiantRequest() {
		super();
	}

	public IdentifiantRequest(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}

	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param login
	 *            the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Surcharge de la méthode toString de Object
	 * pour afficher les attributs de la classe
	 */
	public String toString() {
		return "Login = " + this.login 
				+ "; Password = " + this.getPassword();
	}
	
}
