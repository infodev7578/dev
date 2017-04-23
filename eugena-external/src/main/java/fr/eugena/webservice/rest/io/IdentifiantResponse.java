package fr.eugena.webservice.rest.io;

import java.util.List;

import fr.eugena.webservice.rest.bean.Cra;

public class IdentifiantResponse {

	private ResponseStatut responseStatut;

	private List<Cra> listeCra;

	private List<CompteurConge> listeCompteurCongeUsed;

	private List<CompteurConge> listeCompteurCongeSolde;

	public ResponseStatut getResponseStatut() {
		return responseStatut;
	}

	public void setResponseStatut(ResponseStatut responseStatut) {
		this.responseStatut = responseStatut;
	}

	public List<Cra> getListeCra() {
		return listeCra;
	}

	public void setListeCra(List<Cra> listeCra) {
		this.listeCra = listeCra;
	}

	public List<CompteurConge> getListeCompteurCongeUsed() {
		return listeCompteurCongeUsed;
	}

	public void setListeCompteurCongeUsed(
			List<CompteurConge> listeCompteurCongeUsed) {
		this.listeCompteurCongeUsed = listeCompteurCongeUsed;
	}

	public List<CompteurConge> getListeCompteurCongeSolde() {
		return listeCompteurCongeSolde;
	}

	public void setListeCompteurCongeSolde(
			List<CompteurConge> listeCompteurCongeSolde) {
		this.listeCompteurCongeSolde = listeCompteurCongeSolde;
	}

}