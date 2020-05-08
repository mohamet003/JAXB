//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.04.28 à 03:27:38 PM CEST 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour dureeType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="dureeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="heures" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="minutes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dureeType", propOrder = {
    "heures",
    "minutes"
})
public class DureeType {

    @XmlElement(required = true)
    protected String heures;
    @XmlElement(required = true)
    protected String minutes;

    /**
     * Obtient la valeur de la propriété heures.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeures() {
        return heures;
    }

    /**
     * Définit la valeur de la propriété heures.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeures(String value) {
        this.heures = value;
    }

    /**
     * Obtient la valeur de la propriété minutes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinutes() {
        return minutes;
    }

    /**
     * Définit la valeur de la propriété minutes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinutes(String value) {
        this.minutes = value;
    }

}
