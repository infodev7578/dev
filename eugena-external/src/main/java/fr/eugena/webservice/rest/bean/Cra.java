/*
 * Created on 20 févr. 2017 ( Time 04:19:19 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package fr.eugena.webservice.rest.bean;

import java.io.Serializable;

import java.util.Date;

/**
 * Java bean for 'Cra' entity
 * 
 * @author Telosys Tools
 *
 */
public class Cra implements Serializable {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    // DB : id_cra INT 
    private Integer idCra;

    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    // DB : fk_id_collaborateur INT 
    private Integer fkIdCollaborateur;

    // DB : periode DATETIME 
    private Date periode;

    // DB : date_creation DATETIME 
    private Date dateCreation;

    // DB : date_validation DATETIME 
    private Date dateValidation;

    // DB : check_modif BIT 
    private Boolean checkModif;



    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setIdCra( Integer idCra ) {
        this.idCra = idCra ;
    }

    public Integer getIdCra() {
        return this.idCra;
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

    public void setPeriode( Date periode ) {
        this.periode = periode;
    }
    public Date getPeriode() {
        return this.periode;
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

    public void setCheckModif( Boolean checkModif ) {
        this.checkModif = checkModif;
    }
    public Boolean getCheckModif() {
        return this.checkModif;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append(idCra);
        sb.append("|");
        sb.append(fkIdCollaborateur);
        sb.append("|");
        sb.append(periode);
        sb.append("|");
        sb.append(dateCreation);
        sb.append("|");
        sb.append(dateValidation);
        sb.append("|");
        sb.append(checkModif);
        return sb.toString(); 
    } 


}