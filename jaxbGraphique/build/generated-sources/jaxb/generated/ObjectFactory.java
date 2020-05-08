//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.04.28 à 03:27:38 PM CEST 
//


package generated;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Films }
     * 
     */
    public Films createFilms() {
        return new Films();
    }

    /**
     * Create an instance of {@link FilmType }
     * 
     */
    public FilmType createFilmType() {
        return new FilmType();
    }

    /**
     * Create an instance of {@link ExploitationType }
     * 
     */
    public ExploitationType createExploitationType() {
        return new ExploitationType();
    }

    /**
     * Create an instance of {@link PaysType }
     * 
     */
    public PaysType createPaysType() {
        return new PaysType();
    }

    /**
     * Create an instance of {@link DureeType }
     * 
     */
    public DureeType createDureeType() {
        return new DureeType();
    }

    /**
     * Create an instance of {@link ActeursType }
     * 
     */
    public ActeursType createActeursType() {
        return new ActeursType();
    }

}
