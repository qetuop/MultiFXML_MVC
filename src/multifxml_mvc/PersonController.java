/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multifxml_mvc;

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

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        Parent fnRoot;
        Parent lnRoot;
        try {

            fnRoot = FXMLLoader.load(getClass().getResource("FirstNameView.fxml"));
            Stage stage = new Stage();
            stage.setTitle("First Name");
            stage.setScene(new Scene(fnRoot, 450, 150));
            stage.show();
            
            lnRoot = FXMLLoader.load(getClass().getResource("LastNameView.fxml"));
            Stage stage2 = new Stage();
            stage2.setTitle("Last Name");
            stage2.setScene(new Scene(lnRoot, 450, 150));
            stage2.show();

            //hide this current window (if this is whant you want
           // ((Node)(event.getSource())).getScene().getWindow().hide();
            
//            
//            FXMLLoader fxmlLoader = new FXMLLoader();
//            fxmlLoader.setLocation(getClass().getResource("FirstNameView.fxml"));
//            AnchorPane frame = fxmlLoader.load();
//            FirstNameController fnc = (FirstNameController) fxmlLoader.getController();
//
//            Stage dialogStage = new Stage();
            //dialogStage.setTitle("First Name");
            //dialogStage.initModality(Modality.WINDOW_MODAL);

            //Stage stageTheLabelBelongs = (Stage) budgetTableView.getScene().getWindow();
            //dialogStage.initOwner(stageTheLabelBelongs);
            //Scene scene = new Scene(frame);

            //dialogStage.setScene(scene);
            // Show the dialog and wait until the user closes it
            //dialogStage.showAndWait();
            
            
//            
//        Parent root2 = FXMLLoader.load(getClass().getResource("LastNameView.fxml"));        
//        Scene scene2 = new Scene(root2);        
//        Stage stage2 = new Stage();
//        stage2.setScene(scene2);
//        stage2.show();

        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
    }

}
