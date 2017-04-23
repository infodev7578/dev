package fr.eugena.webservice.rest.io;

/**
 * Classe de compteurs de congés (acquis, en attente, etc...)
 * 
 * @author g1986_informatique
 *
 */
public class CompteurConge {

	private String code;

	private int nombre;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getNombre() {
		return nombre;
	}

	public void setNombre(int nombre) {
		this.nombre = nombre;
	}

}
