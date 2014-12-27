/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multifxml_mvc;

import java.beans.PropertyChangeListener;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Brian
 */
public class LastNameController implements Initializable {
    
    // reference to the View's input field
    @FXML private TextField lastNameTextField;
    
    // reference to the View's nave value
    @FXML private Label lastNameValue;
    
    // the Model to modify
    private LastNameModel lnModel = new LastNameModel();
    
    @FXML
    private void lastNameTextFieldAction(ActionEvent event) {      
        lnModel.setLastName(lastNameTextField.getText());
        System.out.println(lnModel.getLastName());
    }   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lastNameValue.textProperty().bind(lnModel.lastNameProperty());
    }    
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
      lnModel.addPropertyChangeListener(listener);
   }
    
}
