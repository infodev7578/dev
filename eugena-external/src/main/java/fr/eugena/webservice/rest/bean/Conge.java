/*
 * Created on 20 févr. 2017 ( Time 04:19:20 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package fr.eugena.webservice.rest.bean;

import java.io.Serializable;

import java.util.Date;

/**
 * Java bean for 'Conge' entity
 * 
 * @author Telosys Tools
 *
 */
public class Conge implements Serializable {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    // DB : id_conge INT 
    private Integer idConge;

    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    // DB : fk_id_collaborateur INT 
    private Integer fkIdCollaborateur;

    // DB : fk_id_type_conge INT 
    private Integer fkIdTypeConge;

    // DB : date_debut DATETIME 
    private Date dateDebut;

    // DB : date_fin DATETIME 
    private Date dateFin;

    // DB : date_creation DATETIME 
    private Date dateCreation;

    // DB : date_validation DATETIME 
    private Date dateValidation;



    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setIdConge( Integer idConge ) {
        this.idConge = idConge ;
    }

    public Integer getIdConge() {
        return this.idConge;
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

    public void setDateDebut( Date dateDebut ) {
        this.dateDebut = dateDebut;
    }
    public Date getDateDebut() {
        return this.dateDebut;
    }

    public void setDateFin( Date dateFin ) {
        this.dateFin = dateFin;
    }
    public Date getDateFin() {
        return this.dateFin;
    }

    public void setDateCreation( Date dateCreation ) {
        this.dateCreation = dateCreation;
    }
    public Date getDateCreation() {
        return this.dateCreation;
    }

    public void setDateValidation( Date dateValidation ) {
        this.dateValidation = dateValidation;
    }
    public Date getDateValidation() {
        return this.dateValidation;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append(idConge);
        sb.append("|");
        sb.append(fkIdCollaborateur);
        sb.append("|");
        sb.append(fkIdTypeConge);
        sb.append("|");
        sb.append(dateDebut);
        sb.append("|");
        sb.append(dateFin);
        sb.append("|");
        sb.append(dateCreation);
        sb.append("|");
        sb.append(dateValidation);
        return sb.toString(); 
    } 


}