/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaxb2;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author mohametkone
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nomphoto","dateDebut","qualitephoto"
})
@XmlRootElement(name = "photo")
public class Photo {
    
    @XmlElement(name = "nom",required = true)
    protected String nomphoto;
    
    @XmlElement(name = "date",required = true)
    @XmlSchemaType(name = "date")
    protected Date dateDebut;
    
    @XmlAttribute(name = "qualite")
    protected int qualitephoto;

    
    
    
    public String getNom() {
        return nomphoto;
    }

    public void setNom(String value) {
        this.nomphoto = value;
    }

     /**
     * Obtient la valeur de la propriété date.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getDate() {
        return this.dateDebut;
    }

    public void setDate(Date value) {
        this.dateDebut = value;
    }

    public int getQualite() {
        return qualitephoto;
    }

    public void setQualite(int value) {
        this.qualitephoto = value;
    }

 


    
    
    
    
}
