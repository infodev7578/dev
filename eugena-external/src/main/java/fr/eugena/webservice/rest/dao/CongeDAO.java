/*
 * Created on 20 févr. 2017 ( Time 04:16:10 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package fr.eugena.webservice.rest.dao;

import java.util.List;

import fr.eugena.webservice.rest.bean.Collaborateur;
import fr.eugena.webservice.rest.bean.Conge;
import fr.eugena.webservice.rest.io.CompteurConge;


/**
 * Conge DAO interface
 * 
 * @author Telosys Tools
 */
public interface CongeDAO {

	//----------------------------------------------------------------------
	/**
	 * Finds a bean by its primary key 
	 * @param idConge
	 * @return the bean found or null if not found 
	 */
	public Conge find( Integer idConge ) ;

	//----------------------------------------------------------------------
	/**
	 * Loads the given bean, it is supposed to contains the primary key value(s) in its attribute(s)<br>
	 * If found, the given instance is populated with the values retrieved from the database<br>
	 * If not found, the given instance remains unchanged
	 * @param conge
	 * @return true if found, false if not found
	 */
	public boolean load( Conge conge ) ;
	
    //----------------------------------------------------------------------
	/**
	 * Inserts the given bean in the database 
	 * @param conge
	 */
	public void insert(Conge conge) ;

    //----------------------------------------------------------------------
	/**
	 * Updates the given bean in the database 
	 * @param conge
	 * @return
	 */
	public int update(Conge conge) ;

    //----------------------------------------------------------------------
	/**
	 * Deletes the record in the database using the given primary key value(s) 
	 * @param idConge
	 * @return
	 */
	public int delete( Integer idConge ) ;

    //----------------------------------------------------------------------
	/**
	 * Deletes the given bean in the database 
	 * @param conge
	 * @return
	 */
	public int delete( Conge conge ) ;

    //----------------------------------------------------------------------
	/**
	 * Checks the existence of a record in the database using the given primary key value(s)
	 * @param idConge
	 * @return
	 */
	public boolean exists( Integer idConge ) ;

	//----------------------------------------------------------------------
	/**
	 * Checks the existence of the given bean in the database 
	 * @param conge
	 * @return
	 */
	public boolean exists( Conge conge ) ;

    //----------------------------------------------------------------------
	/**
	 * Counts all the records present in the database table
	 * @return
	 */
	public long count() ;

	/**
	 * Récupère une liste de CompteurConge par type de congés (CP, RTT, etc...)
	 * @param collaborateur
	 * @return
	 */
	List<CompteurConge> findByTypeConge(Collaborateur collaborateur);

}
