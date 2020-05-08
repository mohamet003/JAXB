/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaxb1;

import generated.ActeursType;
import generated.DureeType;
import generated.ExploitationType;
import generated.FilmType;
import generated.Films;
import generated.GenreType;
import generated.PaysType;
import java.io.File;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author mohametkone
 */
public class Jaxb1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
                try {
        JAXBContext cont = JAXBContext.newInstance(Films.class);
        Unmarshaller u = cont.createUnmarshaller();
        Films films = (Films) u.unmarshal(new File("films.xml"));
        
                     // Liste des films
                    for (FilmType film : films.getFilm()) {
                        System.out.println("############################# "+film.getNom()+" #########################");
                        System.out.println("* Liste des acteurs");
                        for (String acteur : film.getActeurs().getActeur()) {
                            System.out.println(acteur);
                        }
                    }
                    
                    // Ajout film
                    
                    FilmType nouveauFilm = new FilmType();
                  
                    ExploitationType exploitationType = new ExploitationType();
                    PaysType pays = new PaysType();
                    ActeursType acteurs = new ActeursType();
                    DureeType duree = new DureeType();
                    //XMLGregorianCalendar datesortie ;
                   
                    /*datesortie = DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar());
                    datesortie.setDay(18);
                    datesortie.setMonth(4);
                    datesortie.setYear(2001);*/
                    
                    pays.getNom().add("SENEGAL");
                    pays.getNom().add("MALI");
                    pays.getNom().add("GAMBIA");
                    
                    exploitationType.setNbrEntrees("892");
                    exploitationType.setNbrSalles("89");
                    exploitationType.setPays(pays);
                    exploitationType.setSortieEnSalle("1392");
                    
                    acteurs.getActeur().add("Sotigui Kouyate");
                    acteurs.getActeur().add("Sharon Hope");
                    acteurs.getActeur().add("Roschdy Zem");
                    
                    duree.setHeures("1");
                    duree.setMinutes("38");
                    
                    
                    nouveauFilm.setNom("LITTLE SENEGAL");
                    nouveauFilm.setActeurs(acteurs);
                    nouveauFilm.setDuree(duree);
                    nouveauFilm.setExploitation(exploitationType);
                    nouveauFilm.setGenre(GenreType.AVENTURE);
                    nouveauFilm.setNationalite("SENEGALAISE");
                    nouveauFilm.setRealisateur("Rachid Bouchareb");  
                    nouveauFilm.setVisa("87654");
                    nouveauFilm.setScenario("Passionné par l'histoire de son peuple, Alloune, un vieux guide du musée"
                            + " africain \"La Maison des Esclaves\" à Gorée, part en pèlerinage pour retrouver les descendants "
                            + "de ses ancêtres aux Etats-Unis. Cet émouvant voyage va le mener des côtes de "
                            + "Caroline du Sud au quartier de Harlem où vit la communauté africaine, Little Senegal.");
                    //nouveauFilm.setSortie(sortie.getTime());
                   
                    films.getFilm().add(nouveauFilm);
                    
                    
                    Marshaller marshaller = cont.createMarshaller();
                    marshaller.marshal(films, new File("newliste.xml"));
                    
                    
                    
        }
        catch (Exception e) {
        System.out.println(e.getMessage());
        }
        
    }
    
}
