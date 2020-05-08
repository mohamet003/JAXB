/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaxb2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author mohametkone
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "photo"
})
@XmlRootElement(name = "photos")
public class Photos {
    
    protected List<Photo> photo;
    
    
    
    public List<Photo> getPhoto() {
        if (photo == null) {
            photo = new ArrayList<Photo>();
        }
        return this.photo;
    }
    
}
