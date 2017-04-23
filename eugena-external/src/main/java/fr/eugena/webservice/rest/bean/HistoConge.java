/*
 * Created on 20 févr. 2017 ( Time 04:19:20 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package fr.eugena.webservice.rest.bean;

import java.io.Serializable;

import java.util.Date;

/**
 * Java bean for 'HistoConge' entity
 * 
 * @author Telosys Tools
 *
 */
public class HistoConge implements Serializable {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    // DB : id_histo_conge INT 
    private Integer idHistoConge;

    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    // DB : fk_id_collaborateur INT 
    private Integer fkIdCollaborateur;

    // DB : fk_id_type_conge INT 
    private Integer fkIdTypeConge;

    // DB : nb_jours INT 
    private Integer nbJours;

    // DB : date_creation DATETIME 
    private Date dateCreation;



    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setIdHistoConge( Integer idHistoConge ) {
        this.idHistoConge = idHistoConge ;
    }

    public Integer getIdHistoConge() {
        return this.idHistoConge;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    public void setFkIdCollaborateur( Integer fkIdCollaborateur ) {
        this.fkIdCollaborateur = fkIdCollaborateur;
    }
    public Integer getFkIdCollaborateur() {
        return this.fkIdCollaborateur;
    }

    public void setFkIdTypeConge( Integer fkIdTypeConge ) {
        this.fkIdTypeConge = fkIdTypeConge;
    }
    public Integer getFkIdTypeConge() {
        return this.fkIdTypeConge;
    }

    public void setNbJours( Integer nbJours ) {
        this.nbJours = nbJours;
    }
    public Integer getNbJours() {
        return this.nbJours;
    }

    public void setDateCreation( Date dateCreation ) {
        this.dateCreation = dateCreation;
    }
    public Date getDateCreation() {
        return this.dateCreation;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append(idHistoConge);
        sb.append("|");
        sb.append(fkIdCollaborateur);
        sb.append("|");
        sb.append(fkIdTypeConge);
        sb.append("|");
        sb.append(nbJours);
        sb.append("|");
        sb.append(dateCreation);
        return sb.toString(); 
    } 


}