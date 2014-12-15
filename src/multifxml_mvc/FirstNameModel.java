/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multifxml_mvc;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Brian
 */
public class FirstNameModel {
    
    private final StringProperty firstName;

    public FirstNameModel() {
        this.firstName = new SimpleStringProperty(this, "firstName", "");
    }
    public final String getFirstName() { return firstName.get(); }
    public final void setFirstName(String value) { firstName.set(value); }
    public final StringProperty firstNameProperty() { return firstName; }
}
