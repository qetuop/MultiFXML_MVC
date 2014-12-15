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
public class LastNameModel {
    
    private final StringProperty lastName;

    public LastNameModel() {
        this.lastName = new SimpleStringProperty(this, "lastName", "");
    }
    public final String getLastName() { return lastName.get(); }
    public final void setLastName(String value) { lastName.set(value); }
    public final StringProperty lastNameProperty() { return lastName; }
}
