/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaxb2;

import java.io.File;
import java.util.Date;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 *
 * @author mohametkone
 */
public class Jaxb2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws JAXBException {
        // TODO code application logic here
        
        JAXBContext cont = JAXBContext.newInstance(Photos.class);
        Marshaller m = cont.createMarshaller();
        
        Photos photos = new Photos();
        
        Photo photo = new Photo();
        
        photo.setDate(new Date());
        photo.setNom("Ma photo 1");
        photo.setQualite(4);
        
        Photo photo1 = new Photo();
        
        photo1.setDate(new Date());
        photo1.setNom("Ma photo 1");
        photo1.setQualite(2);
        
        photos.getPhoto().add(photo);
        photos.getPhoto().add(photo1);
        
        
        m.marshal(photos, new File("photos.xml"));

    }
    
}
