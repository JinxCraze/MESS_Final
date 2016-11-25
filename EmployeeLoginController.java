package MESS;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

public class EmployeeLoginController implements Initializable{

    @FXML
    Label theaterID;

    @FXML
    TextField empTextField;

    @FXML
    Label statusLabel;

    @FXML
    Label currentDate;

    @FXML
    private void handleButton_1(ActionEvent event){
        empTextField.appendText("1");
    }

    @FXML
    private void handleButton_2(ActionEvent event){
        empTextField.appendText("2");
    }

    @FXML
    private void handleButton_3(ActionEvent event){
        empTextField.appendText("3");
    }

    @FXML
    private void handleButton_4(ActionEvent event){
        empTextField.appendText("4");
    }

    @FXML
    private void handleButton_5(ActionEvent event){
        empTextField.appendText("5");
    }

    @FXML
    private void handleButton_6(ActionEvent event){
        empTextField.appendText("6");
    }

    @FXML
    private void handleButton_7(ActionEvent event){
        empTextField.appendText("7");
    }

    @FXML
    private void handleButton_8(ActionEvent event){
        empTextField.appendText("8");
    }

    @FXML
    private void handleButton_9(ActionEvent event){
        empTextField.appendText("9");
    }

    @FXML
    private void handleButton_0(ActionEvent event){
        empTextField.appendText("0");
    }

    @FXML
    private void handleResetButton(ActionEvent event){
        empTextField.clear();
    }

    @FXML
    private void handleSignInButton(ActionEvent event){
        // if employee id is valid
        if(Session.getInstance().getDBConnector().checkEmployee(empTextField.getText())){
            Session.getInstance().setEmployeeID(empTextField.getText());
            try {
                Parent employeeLogin = FXMLLoader.load(getClass().getResource("MainVendor.fxml"));
                Scene employeeLogin_scene = new Scene(employeeLogin);
                Stage main_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                main_stage.setScene(employeeLogin_scene);
                main_stage.setFullScreen(true);

                main_stage.show();
            }
            catch(Exception e){

            }
        }
        else{
            statusLabel.setText("Employee ID Not Found.");
        }
    }

    @FXML
    public void handleLogOutButton(ActionEvent event){
        try{
            Parent theaterLogin = FXMLLoader.load(getClass().getResource("TheaterLogin.fxml"));
            Scene theaterLogin_scene = new Scene(theaterLogin);
            Stage main_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            main_stage.setScene(theaterLogin_scene);
            main_stage.setFullScreen(true);
            main_stage.show();
        }
        catch(Exception e){

        }
    }


    @Override
    public void initialize(URL url, ResourceBundle rb){
        theaterID.setText(Session.getInstance().getDbID());

        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        Date dateobj = new Date();
        currentDate.setText(df.format(dateobj));
    }
}
