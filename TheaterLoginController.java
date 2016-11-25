package MESS;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class TheaterLoginController implements Initializable{

    @FXML
    TextField theaterID;

    @FXML
    PasswordField passField;

    @FXML
    Label loginStatus;

    @FXML
    private void signInButtonAction(ActionEvent event) throws IOException{
            // grab fields from login and set DBConnector
            Session.getInstance().setDBConnector(theaterID.getText(), Session.getInstance().getDbAdmin(), passField.getText());

            // try to connect
            if(Session.getInstance().getDBConnector().setConnection()){
                try{

                    Session.getInstance().setDbID(theaterID.getText());
                    Session.getInstance().setDbPass(passField.getText());

                    // Change Scene
                    Parent employeeLogin = FXMLLoader.load(getClass().getResource("EmployeeLogin.fxml"));
                    Scene employeeLogin_scene = new Scene(employeeLogin);
                    Stage main_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    main_stage.setScene(employeeLogin_scene);
                    main_stage.setFullScreen(true);

                    main_stage.show();
                } catch (Exception e){
                    System.out.println("Failed");
                }
            }
            else{
                loginStatus.setText("ERROR: Theater ID or Password Not Recognized. Please Try Again.");
            }
    }

    @FXML
    private void resetButtonAction(ActionEvent event){
        theaterID.clear();
        passField.clear();
        loginStatus.setText("");
    }


    @Override
    public void initialize(URL url, ResourceBundle rb){

    }



}
