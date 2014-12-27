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

/**
 *
 * @author Brian
 */
public class FirstNameModel {
    private final StringProperty firstName;
    
    public static final String FIRST_NAME = "first_name";
    private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);

    public FirstNameModel() {
        this.firstName = new SimpleStringProperty(this, "firstName", "<first name>");
    }

    public final String getFirstName() {
        return firstName.get();
    }

    public final void setFirstName(String value) {
        String oldFirstName = firstName.get();    
        
        firstName.set(value);

        PropertyChangeEvent evt = new PropertyChangeEvent(this, FIRST_NAME, oldFirstName, firstName.get());
        pcs.firePropertyChange(evt);
    }

    public final StringProperty firstNameProperty() {
        return firstName;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        pcs.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        this.pcs.removePropertyChangeListener(listener);
    }
}
