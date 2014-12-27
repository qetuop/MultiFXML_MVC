/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multifxml_mvc;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author Brian
 */
public class PersonController implements Initializable {

    @FXML
    private Label firstNameValue;

    @FXML
    private Label lastNameValue;

    // the Model to modify
    private PersonModel pModel = new PersonModel();

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        Parent fnRoot;
        Parent lnRoot;
        Parent pRoot;
        
        try {
            // can't do here?
            //FXMLLoader pLoader = new FXMLLoader(getClass().getResource("PersonView.fxml"));
            //pRoot = pLoader.load();
           
            
            FXMLLoader fnLoader = new FXMLLoader(getClass().getResource("FirstNameView.fxml"));
            //fnRoot = FXMLLoader.load(getClass().getResource("FirstNameView.fxml"));
            fnRoot = fnLoader.load();
            Stage stage = new Stage();
            stage.setTitle("First Name");
            stage.setScene(new Scene(fnRoot, 450, 150));
            stage.setX(50);
            stage.setY(50);
            stage.show();
            
            // connect the two models
            FirstNameController fnController = fnLoader.getController();
            fnController.addPropertyChangeListener((PropertyChangeEvent pce) -> {
                if (FirstNameModel.FIRST_NAME.equals(pce.getPropertyName())) {
                    pModel.setFirstName((String) pce.getNewValue());
                }
            });

            // bind the model and view value
            firstNameValue.textProperty().bind(pModel.firstNameProperty());

            FXMLLoader lnLoader = new FXMLLoader(getClass().getResource("LastNameView.fxml"));
            //lnRoot = FXMLLoader.load(getClass().getResource("LastNameView.fxml"));
            lnRoot = lnLoader.load();
            Stage stage2 = new Stage();
            stage2.setTitle("Last Name");
            stage2.setScene(new Scene(lnRoot, 450, 150));
            stage2.setX(50);
            stage2.setY(250);
            //stage2.setX(pRoot.getScene().getX()+50);
            //stage2.setY(pRoot.getScene().getY()+50);
            stage2.show();
            
            // connect the two models
            LastNameController lnController = lnLoader.getController();
            lnController.addPropertyChangeListener((PropertyChangeEvent pce) -> {
                if (LastNameModel.LAST_NAME.equals(pce.getPropertyName())) {
                    pModel.setLastName((String) pce.getNewValue());
                }
            });

            // bind the model and view value
            lastNameValue.textProperty().bind(pModel.lastNameProperty());

        } catch (IOException e) {
            e.printStackTrace();
            return;
        }        
    }
        
}
