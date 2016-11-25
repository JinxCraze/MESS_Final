package MESS;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends Application {

    Timer clock;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("TheaterLogin.fxml"));
        primaryStage.setTitle("MESS: Movie Theater Entertainment System");
        primaryStage.setScene(new Scene(root, 1440, 900));
        primaryStage.setFullScreen(true);
        primaryStage.show();

        // start time-out timer
        MouseTimer timer = new MouseTimer();
        timer.timer.start();

        clock = new Timer(21000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Session.getInstance().timeOut && Session.getInstance().currentScene == 3) {

                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            try {
                                Parent employeeLogin = FXMLLoader.load(getClass().getResource("EmployeeLogin.fxml"));
                                Scene employeeLogin_scene = new Scene(employeeLogin);
                                primaryStage.setScene(employeeLogin_scene);
                                primaryStage.setFullScreen(true);
                                primaryStage.show();

                                Session.getInstance().currentScene = 2;
                            } catch (Exception e) {

                            }
                        }

                    });
                }
            }
        });
        clock.start();
    }
}
