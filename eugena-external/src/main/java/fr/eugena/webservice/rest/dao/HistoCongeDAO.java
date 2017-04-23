/*
 * Created on 20 févr. 2017 ( Time 04:16:10 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package fr.eugena.webservice.rest.dao;

import java.util.List;

import fr.eugena.webservice.rest.bean.Collaborateur;
import fr.eugena.webservice.rest.bean.HistoConge;
import fr.eugena.webservice.rest.io.CompteurConge;


/**
 * HistoConge DAO interface
 * 
 * @author Telosys Tools
 */
public interface HistoCongeDAO {

	//----------------------------------------------------------------------
	/**
	 * Finds a bean by its primary key 
	 * @param idHistoConge
	 * @return the bean found or null if not found 
	 */
	public HistoConge find( Integer idHistoConge ) ;

	//----------------------------------------------------------------------
	/**
	 * Loads the given bean, it is supposed to contains the primary key value(s) in its attribute(s)<br>
	 * If found, the given instance is populated with the values retrieved from the database<br>
	 * If not found, the given instance remains unchanged
	 * @param histoConge
	 * @return true if found, false if not found
	 */
	public boolean load( HistoConge histoConge ) ;
	
    //----------------------------------------------------------------------
	/**
	 * Inserts the given bean in the database 
	 * @param histoConge
	 */
	public void insert(HistoConge histoConge) ;

    //----------------------------------------------------------------------
	/**
	 * Updates the given bean in the database 
	 * @param histoConge
	 * @return
	 */
	public int update(HistoConge histoConge) ;

    //----------------------------------------------------------------------
	/**
	 * Deletes the record in the database using the given primary key value(s) 
	 * @param idHistoConge
	 * @return
	 */
	public int delete( Integer idHistoConge ) ;

    //----------------------------------------------------------------------
	/**
	 * Deletes the given bean in the database 
	 * @param histoConge
	 * @return
	 */
	public int delete( HistoConge histoConge ) ;

    //----------------------------------------------------------------------
	/**
	 * Checks the existence of a record in the database using the given primary key value(s)
	 * @param idHistoConge
	 * @return
	 */
	public boolean exists( Integer idHistoConge ) ;

	//----------------------------------------------------------------------
	/**
	 * Checks the existence of the given bean in the database 
	 * @param histoConge
	 * @return
	 */
	public boolean exists( HistoConge histoConge ) ;

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
	public List<CompteurConge> findByTypeConge(Collaborateur collaborateur);

}
