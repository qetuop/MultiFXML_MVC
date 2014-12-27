/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multifxml_mvc;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import static multifxml_mvc.FirstNameModel.FIRST_NAME;

/**
 *
 * @author Brian
 */
public class LastNameModel {    
    private final StringProperty lastName;
    
    public static final String LAST_NAME = "last_name";
    private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);

    public LastNameModel() {
        this.lastName = new SimpleStringProperty(this, "lastName", "<last name>");
    }
    
    public final String getLastName() { 
        return lastName.get(); 
    }
    
    public final void setLastName(String value) { 
        String oldLastName = lastName.get();   
        
        lastName.set(value);

        PropertyChangeEvent evt = new PropertyChangeEvent(this, LAST_NAME, oldLastName, lastName.get());
        pcs.firePropertyChange(evt);
    }
    
    public final StringProperty lastNameProperty() { 
        return lastName; 
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        pcs.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        this.pcs.removePropertyChangeListener(listener);
    }
}
