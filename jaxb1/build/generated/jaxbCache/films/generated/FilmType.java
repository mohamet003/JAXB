//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.04.27 à 12:28:36 PM CEST 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour filmType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="filmType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nationalite" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="realisateur" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="genre" type="{}genreType"/>
 *         &lt;element name="exploitation" type="{}exploitationType"/>
 *         &lt;element name="acteurs" type="{}acteursType"/>
 *         &lt;element name="duree" type="{}dureeType"/>
 *         &lt;element name="scenario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="sortie" type="{http://www.w3.org/2001/XMLSchema}gYear" />
 *       &lt;attribute name="visa" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "filmType", propOrder = {
    "nom",
    "nationalite",
    "realisateur",
    "genre",
    "exploitation",
    "acteurs",
    "duree",
    "scenario"
})
public class FilmType {

    @XmlElement(required = true)
    protected String nom;
    @XmlElement(required = true)
    protected String nationalite;
    @XmlElement(required = true)
    protected String realisateur;
    @XmlElement(required = true)
    protected GenreType genre;
    @XmlElement(required = true)
    protected ExploitationType exploitation;
    @XmlElement(required = true)
    protected ActeursType acteurs;
    @XmlElement(required = true)
    protected DureeType duree;
    @XmlElement(required = true)
    protected String scenario;
    @XmlAttribute(name = "sortie")
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar sortie;
    @XmlAttribute(name = "visa")
    protected String visa;

    /**
     * Obtient la valeur de la propriété nom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNom() {
        return nom;
    }

    /**
     * Définit la valeur de la propriété nom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNom(String value) {
        this.nom = value;
    }

    /**
     * Obtient la valeur de la propriété nationalite.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalite() {
        return nationalite;
    }

    /**
     * Définit la valeur de la propriété nationalite.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalite(String value) {
        this.nationalite = value;
    }

    /**
     * Obtient la valeur de la propriété realisateur.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRealisateur() {
        return realisateur;
    }

    /**
     * Définit la valeur de la propriété realisateur.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRealisateur(String value) {
        this.realisateur = value;
    }

    /**
     * Obtient la valeur de la propriété genre.
     * 
     * @return
     *     possible object is
     *     {@link GenreType }
     *     
     */
    public GenreType getGenre() {
        return genre;
    }

    /**
     * Définit la valeur de la propriété genre.
     * 
     * @param value
     *     allowed object is
     *     {@link GenreType }
     *     
     */
    public void setGenre(GenreType value) {
        this.genre = value;
    }

    /**
     * Obtient la valeur de la propriété exploitation.
     * 
     * @return
     *     possible object is
     *     {@link ExploitationType }
     *     
     */
    public ExploitationType getExploitation() {
        return exploitation;
    }

    /**
     * Définit la valeur de la propriété exploitation.
     * 
     * @param value
     *     allowed object is
     *     {@link ExploitationType }
     *     
     */
    public void setExploitation(ExploitationType value) {
        this.exploitation = value;
    }

    /**
     * Obtient la valeur de la propriété acteurs.
     * 
     * @return
     *     possible object is
     *     {@link ActeursType }
     *     
     */
    public ActeursType getActeurs() {
        return acteurs;
    }

    /**
     * Définit la valeur de la propriété acteurs.
     * 
     * @param value
     *     allowed object is
     *     {@link ActeursType }
     *     
     */
    public void setActeurs(ActeursType value) {
        this.acteurs = value;
    }

    /**
     * Obtient la valeur de la propriété duree.
     * 
     * @return
     *     possible object is
     *     {@link DureeType }
     *     
     */
    public DureeType getDuree() {
        return duree;
    }

    /**
     * Définit la valeur de la propriété duree.
     * 
     * @param value
     *     allowed object is
     *     {@link DureeType }
     *     
     */
    public void setDuree(DureeType value) {
        this.duree = value;
    }

    /**
     * Obtient la valeur de la propriété scenario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScenario() {
        return scenario;
    }

    /**
     * Définit la valeur de la propriété scenario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScenario(String value) {
        this.scenario = value;
    }

    /**
     * Obtient la valeur de la propriété sortie.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSortie() {
        return sortie;
    }

    /**
     * Définit la valeur de la propriété sortie.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSortie(XMLGregorianCalendar value) {
        this.sortie = value;
    }

    /**
     * Obtient la valeur de la propriété visa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisa() {
        return visa;
    }

    /**
     * Définit la valeur de la propriété visa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisa(String value) {
        this.visa = value;
    }

}
