package fr.eugena.webservice.rest.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import fr.eugena.webservice.rest.bean.Collaborateur;
import fr.eugena.webservice.rest.bean.Cra;
import fr.eugena.webservice.rest.dao.CollaborateurDAO;
import fr.eugena.webservice.rest.dao.CongeDAO;
import fr.eugena.webservice.rest.dao.CraDAO;
import fr.eugena.webservice.rest.dao.HistoCongeDAO;
import fr.eugena.webservice.rest.io.CompteurConge;
import fr.eugena.webservice.rest.io.IdentifiantRequest;
import fr.eugena.webservice.rest.io.IdentifiantResponse;
import fr.eugena.webservice.rest.io.ResponseStatut;

/**
 * Classe représentant un bean Spring de type Controller (@Controller).
 * 
 * Ce bean est associé à une URL via l'annotation @RequestMapping
 * 
 * @author g1986_informatique
 *
 */
@Controller
@RequestMapping("/Login_User")
public class WebserviceController {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(WebserviceController.class);

	/**
	 * Injection du bean Spring identifiantDAO
	 */
	@Autowired
	private CollaborateurDAO collaborateurDAO;

	/**
	 * Injection du bean Spring craDAO
	 */
	@Autowired
	private CraDAO craDAO;

	/**
	 * Injection du bean Spring congeDAO
	 */
	@Autowired
	private CongeDAO congeDAO;

	/**
	 * Injection du bean Spring histoDAO
	 */
	@Autowired
	private HistoCongeDAO histoCongeDAO;

	@RequestMapping(method = RequestMethod.POST)
	@Transactional
	public @ResponseBody IdentifiantResponse getIdentifiant(
			@RequestBody IdentifiantRequest request) {

		LOGGER.info("Requête du WS : " + request);

		String type = null;
		String detail = null;

		String login = request.getLogin();
		String password = request.getPassword();

		// recuperation de l'identifiant en fonction du login et password
		Collaborateur collaborateurTrouve = collaborateurDAO
				.findByLoginAndPassword(login, password);

		// Création de l'objet identifantReponse
		IdentifiantResponse response = new IdentifiantResponse();

		// Création des sous objets responseStatut et loggedUser de l'objet
		// identifantReponse
		ResponseStatut responseStatut = new ResponseStatut();

		if (collaborateurTrouve != null) {
			type = "0";
			detail = "L'utilisateur de login '" + login
					+ "' est bien enregistré";

			List<Cra> listeCra = craDAO
					.findByCollaborateur(collaborateurTrouve);

			List<CompteurConge> listeCongeUsed = congeDAO
					.findByTypeConge(collaborateurTrouve);

			List<CompteurConge> listeCongeSolde = histoCongeDAO
					.findByTypeConge(collaborateurTrouve);
			
			// mise à jour de la réponse avec les listes récupérés depuis la BDD
			response.setListeCra(listeCra);
			response.setListeCompteurCongeUsed(listeCongeUsed);
			response.setListeCompteurCongeSolde(listeCongeSolde);
			
		} else {
			type = "1";
			detail = "L'utilisateur de login '" + login
					+ "' n'est pas enregistré";
		}

		responseStatut.setType(type);
		responseStatut.setDetail(detail);

		// mise à jour de la réponse avec l'objet responseStatut
		response.setResponseStatut(responseStatut);

		LOGGER.info("Réponse du WS : " + response);

		return response;
	}
}
