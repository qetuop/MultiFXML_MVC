/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multifxml_mvc;

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
public class FirstNameController implements Initializable {
    
    // reference to the View's input field
    @FXML private TextField firstNameTextField;
    
    // reference to the View's nave value
    @FXML private Label firstNameValue;
    
    // the Model to modify
    private FirstNameModel fnModel = new FirstNameModel();
    
    @FXML
    private void firstNameTextFieldAction(ActionEvent event) {      
        fnModel.setFirstName(firstNameTextField.getText());
        System.out.println(fnModel.getFirstName());
    }   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        firstNameValue.textProperty().bindBidirectional(fnModel.firstNameProperty());
    }    
    
}
