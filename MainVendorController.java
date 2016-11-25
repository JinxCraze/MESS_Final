package MESS;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

public class MainVendorController implements Initializable{

    Ticket currentTicket = new Ticket();
    Transaction currentTransaction = new Transaction();

    int transactionCount = 1;

    // CURRENT TRANSACTION TOTAL
    double currentTransactionTotal = 0.00;

    double currentRegisterTotal = 0.00;

    Timer clock;

    // flag to disable adding tickets
    boolean canAddTickets = true;

    @FXML
    Label currentRegisterValue;

    @FXML
    Label theaterID;
    @FXML
    Label empID;
    @FXML
    Label currentDate;


    @FXML
    Button btn_movie1;
    @FXML
    Button btn_movie2;
    @FXML
    Button btn_movie3;
    @FXML
    Button btn_movie4;
    @FXML
    Button btn_movie5;
    @FXML
    Button btn_movie6;


    @FXML
    Label movieTitle;
    @FXML
    Label movieRating;
    @FXML
    Label movieStarring;
    @FXML
    Label movieDirector;
    @FXML
    Label movieRuntime;
    @FXML
    Label movieSynopsis;


    @FXML
    Button btn_showtime1;
    @FXML
    Button btn_showtime2;
    @FXML
    Button btn_showtime3;
    @FXML
    Button btn_showtime4;
    @FXML
    Button btn_showtime5;


    @FXML
    VBox transactionWindow;


    @FXML
    Label currentTotal;

    @FXML
    Label showtime_info;

    @FXML
    HBox showtime_info_hbox;

    @FXML
    Button btn_processTransaction;

    // bar under Total and << Register entry
    // tells cashier change due
    @FXML
    Label registerStatus;

    @FXML
    public void handleLogOut(ActionEvent event){
        try{
            Session.getInstance().setEmployeeID("0");
            Parent employeeLogin = FXMLLoader.load(getClass().getResource("EmployeeLogin.fxml"));
            Scene employeeLogin_scene = new Scene(employeeLogin);
            Stage main_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            main_stage.setScene(employeeLogin_scene);
            main_stage.show();
        } catch (Exception e){
            System.out.println("Failed");
        }
    }

    @FXML
    public void handlebtn_Movie1(ActionEvent event){
        // sets all information in Info area about movie1
        movieTitle.setText(Session.getInstance().getTheater().getMovie1().getTitle());
        movieRating.setText(Session.getInstance().getTheater().getMovie1().getRating());
        movieStarring.setText(Session.getInstance().getTheater().getMovie1().getStarring());
        movieDirector.setText(Session.getInstance().getTheater().getMovie1().getDirector());
        movieRuntime.setText(Session.getInstance().getTheater().getMovie1().getRuntime());
        movieSynopsis.setText(Session.getInstance().getTheater().getMovie1().getSynopsis());

        // set all showtime buttons
        btn_showtime1.setText(Session.getInstance().getTheater().getMovie1().getShowtime1().getShowtime());
        btn_showtime2.setText(Session.getInstance().getTheater().getMovie1().getShowtime2().getShowtime());
        btn_showtime3.setText(Session.getInstance().getTheater().getMovie1().getShowtime3().getShowtime());
        btn_showtime4.setText(Session.getInstance().getTheater().getMovie1().getShowtime4().getShowtime());
        btn_showtime5.setText(Session.getInstance().getTheater().getMovie1().getShowtime5().getShowtime());

        // set currentTicket's movie_id to movie1's movie_id
        currentTicket.setMovie_id("1");
        btn_showtime1.fire();

        registerStatus.setText("");
        currentRegisterValue.setText("");
    }

    @FXML
    public void handlebtn_Movie2(ActionEvent event){
        // sets all information in Info area about movie2
        movieTitle.setText(Session.getInstance().getTheater().getMovie2().getTitle());
        movieRating.setText(Session.getInstance().getTheater().getMovie2().getRating());
        movieStarring.setText(Session.getInstance().getTheater().getMovie2().getStarring());
        movieDirector.setText(Session.getInstance().getTheater().getMovie2().getDirector());
        movieRuntime.setText(Session.getInstance().getTheater().getMovie2().getRuntime());
        movieSynopsis.setText(Session.getInstance().getTheater().getMovie2().getSynopsis());

        // set all showtime buttons
        btn_showtime1.setText(Session.getInstance().getTheater().getMovie2().getShowtime1().getShowtime());
        btn_showtime2.setText(Session.getInstance().getTheater().getMovie2().getShowtime2().getShowtime());
        btn_showtime3.setText(Session.getInstance().getTheater().getMovie2().getShowtime3().getShowtime());
        btn_showtime4.setText(Session.getInstance().getTheater().getMovie2().getShowtime4().getShowtime());
        btn_showtime5.setText(Session.getInstance().getTheater().getMovie2().getShowtime5().getShowtime());

        // set currentTicket's movie_id to movie2's movie_id
        currentTicket.setMovie_id("2");
        btn_showtime1.fire();


        registerStatus.setText("");
        currentRegisterValue.setText("");
    }

    @FXML
    public void handlebtn_Movie3(ActionEvent event){
        // sets all information in Info area about movie3
        movieTitle.setText(Session.getInstance().getTheater().getMovie3().getTitle());
        movieRating.setText(Session.getInstance().getTheater().getMovie3().getRating());
        movieStarring.setText(Session.getInstance().getTheater().getMovie3().getStarring());
        movieDirector.setText(Session.getInstance().getTheater().getMovie3().getDirector());
        movieRuntime.setText(Session.getInstance().getTheater().getMovie3().getRuntime());
        movieSynopsis.setText(Session.getInstance().getTheater().getMovie3().getSynopsis());


        // set all showtime buttons
        btn_showtime1.setText(Session.getInstance().getTheater().getMovie3().getShowtime1().getShowtime());
        btn_showtime2.setText(Session.getInstance().getTheater().getMovie3().getShowtime2().getShowtime());
        btn_showtime3.setText(Session.getInstance().getTheater().getMovie3().getShowtime3().getShowtime());
        btn_showtime4.setText(Session.getInstance().getTheater().getMovie3().getShowtime4().getShowtime());
        btn_showtime5.setText(Session.getInstance().getTheater().getMovie3().getShowtime5().getShowtime());

        // set currentTicket's movie_id to movie3's movie_id
        currentTicket.setMovie_id("3");

        btn_showtime1.fire();


        registerStatus.setText("");
        currentRegisterValue.setText("");
    }

    @FXML
    public void handlebtn_Movie4(ActionEvent event){
        // sets all information in Info area about movie4
        movieTitle.setText(Session.getInstance().getTheater().getMovie4().getTitle());
        movieRating.setText(Session.getInstance().getTheater().getMovie4().getRating());
        movieStarring.setText(Session.getInstance().getTheater().getMovie4().getStarring());
        movieDirector.setText(Session.getInstance().getTheater().getMovie4().getDirector());
        movieRuntime.setText(Session.getInstance().getTheater().getMovie4().getRuntime());
        movieSynopsis.setText(Session.getInstance().getTheater().getMovie4().getSynopsis());


        // set all showtime buttons
        btn_showtime1.setText(Session.getInstance().getTheater().getMovie4().getShowtime1().getShowtime());
        btn_showtime2.setText(Session.getInstance().getTheater().getMovie4().getShowtime2().getShowtime());
        btn_showtime3.setText(Session.getInstance().getTheater().getMovie4().getShowtime3().getShowtime());
        btn_showtime4.setText(Session.getInstance().getTheater().getMovie4().getShowtime4().getShowtime());
        btn_showtime5.setText(Session.getInstance().getTheater().getMovie4().getShowtime5().getShowtime());

        // set currentTicket's movie_id to movie4's movie_id
        currentTicket.setMovie_id("4");

        btn_showtime1.fire();


        registerStatus.setText("");
        currentRegisterValue.setText("");
    }

    @FXML
    public void handlebtn_Movie5(ActionEvent event){
        // sets all information in Info area about movie5
        movieTitle.setText(Session.getInstance().getTheater().getMovie5().getTitle());
        movieRating.setText(Session.getInstance().getTheater().getMovie5().getRating());
        movieStarring.setText(Session.getInstance().getTheater().getMovie5().getStarring());
        movieDirector.setText(Session.getInstance().getTheater().getMovie5().getDirector());
        movieRuntime.setText(Session.getInstance().getTheater().getMovie5().getRuntime());
        movieSynopsis.setText(Session.getInstance().getTheater().getMovie5().getSynopsis());

        // set all showtime buttons
        btn_showtime1.setText(Session.getInstance().getTheater().getMovie5().getShowtime1().getShowtime());
        btn_showtime2.setText(Session.getInstance().getTheater().getMovie5().getShowtime2().getShowtime());
        btn_showtime3.setText(Session.getInstance().getTheater().getMovie5().getShowtime3().getShowtime());
        btn_showtime4.setText(Session.getInstance().getTheater().getMovie5().getShowtime4().getShowtime());
        btn_showtime5.setText(Session.getInstance().getTheater().getMovie5().getShowtime5().getShowtime());

        // set currentTicket's movie_id to movie5's movie_id
        currentTicket.setMovie_id("5");

        btn_showtime1.fire();


        registerStatus.setText("");
        currentRegisterValue.setText("");
    }

    @FXML
    public void handlebtn_Movie6(ActionEvent event){
        // sets all information in Info area about movie6
        movieTitle.setText(Session.getInstance().getTheater().getMovie6().getTitle());
        movieRating.setText(Session.getInstance().getTheater().getMovie6().getRating());
        movieStarring.setText(Session.getInstance().getTheater().getMovie6().getStarring());
        movieDirector.setText(Session.getInstance().getTheater().getMovie6().getDirector());
        movieRuntime.setText(Session.getInstance().getTheater().getMovie6().getRuntime());
        movieSynopsis.setText(Session.getInstance().getTheater().getMovie6().getSynopsis());


        // set all showtime buttons
        btn_showtime1.setText(Session.getInstance().getTheater().getMovie6().getShowtime1().getShowtime());
        btn_showtime2.setText(Session.getInstance().getTheater().getMovie6().getShowtime2().getShowtime());
        btn_showtime3.setText(Session.getInstance().getTheater().getMovie6().getShowtime3().getShowtime());
        btn_showtime4.setText(Session.getInstance().getTheater().getMovie6().getShowtime4().getShowtime());
        btn_showtime5.setText(Session.getInstance().getTheater().getMovie6().getShowtime5().getShowtime());

        // set currentTicket's movie_id to movie6's movie_id
        currentTicket.setMovie_id("6");

        btn_showtime1.fire();

        registerStatus.setText("");
        currentRegisterValue.setText("");
    }

    //SHOWTIME BUTTON HANDLERS

    @FXML
    public void handle_showtimeBtn1(ActionEvent event){
        currentTicket.setShowtime_id("1");
       setShowTimeInfo();


        registerStatus.setText("");
        currentRegisterValue.setText("");

    }


    ///////////////
    @FXML
    public void handle_showtimeBtn2(ActionEvent event){
        currentTicket.setShowtime_id("2");
        setShowTimeInfo();


        registerStatus.setText("");
        currentRegisterValue.setText("");
    }
    @FXML
    public void handle_showtimeBtn3(ActionEvent event){
        currentTicket.setShowtime_id("3");
        setShowTimeInfo();


        registerStatus.setText("");
        currentRegisterValue.setText("");
    }
    @FXML
    public void handle_showtimeBtn4(ActionEvent event){
        currentTicket.setShowtime_id("4");
        setShowTimeInfo();


        registerStatus.setText("");
        currentRegisterValue.setText("");
    }
    @FXML
    public void handle_showtimeBtn5(ActionEvent event){
        currentTicket.setShowtime_id("5");
        setShowTimeInfo();


        registerStatus.setText("");
        currentRegisterValue.setText("");
    }

    public void setShowTimeInfo(){

        // for movie_id == 1
        if (currentTicket.getMovie_id().equals("1") && currentTicket.getShowtime_id().equals("1")){
            showtime_info.setText(Session.getInstance().getTheater().getMovie1().getTitle() + ": " +
                    Session.getInstance().getTheater().getMovie1().getShowtime1().getShowtime() +
                    " " + Integer.toString(Session.getInstance().getTheater().getMovie1().getShowtime1().getTickets())
                    + " tickets left");

            setShowtimeBackground(Session.getInstance().getTheater().getMovie1().getShowtime1().getTickets());
        }
        if (currentTicket.getMovie_id().equals("1") && currentTicket.getShowtime_id().equals("2")){
            showtime_info.setText(Session.getInstance().getTheater().getMovie1().getTitle() + ": " +
                    Session.getInstance().getTheater().getMovie1().getShowtime2().getShowtime() +
                    " " + Integer.toString(Session.getInstance().getTheater().getMovie1().getShowtime2().getTickets())
                    + " tickets left");

            setShowtimeBackground(Session.getInstance().getTheater().getMovie1().getShowtime2().getTickets());

        }
        if (currentTicket.getMovie_id().equals("1") && currentTicket.getShowtime_id().equals("3")){
            showtime_info.setText(Session.getInstance().getTheater().getMovie1().getTitle() + ": " +
                    Session.getInstance().getTheater().getMovie1().getShowtime3().getShowtime() +
                    " " + Integer.toString(Session.getInstance().getTheater().getMovie1().getShowtime3().getTickets())
                    + " tickets left");

            setShowtimeBackground(Session.getInstance().getTheater().getMovie1().getShowtime3().getTickets());

        }
        if (currentTicket.getMovie_id().equals("1") && currentTicket.getShowtime_id().equals("4")){
            showtime_info.setText(Session.getInstance().getTheater().getMovie1().getTitle() + ": " +
                    Session.getInstance().getTheater().getMovie1().getShowtime4().getShowtime() +
                    " " + Integer.toString(Session.getInstance().getTheater().getMovie1().getShowtime4().getTickets())
                    + " tickets left");

            setShowtimeBackground(Session.getInstance().getTheater().getMovie1().getShowtime4().getTickets());

        }
        if (currentTicket.getMovie_id().equals("1") && currentTicket.getShowtime_id().equals("5")){
            showtime_info.setText(Session.getInstance().getTheater().getMovie1().getTitle() + ": " +
                    Session.getInstance().getTheater().getMovie1().getShowtime5().getShowtime() +
                    " " + Integer.toString(Session.getInstance().getTheater().getMovie1().getShowtime5().getTickets())
                    + " tickets left");

            setShowtimeBackground(Session.getInstance().getTheater().getMovie1().getShowtime5().getTickets());

        }

        // movie_id = 2

        if (currentTicket.getMovie_id().equals("2") && currentTicket.getShowtime_id().equals("1")){
            showtime_info.setText(Session.getInstance().getTheater().getMovie2().getTitle() + ": " +
                    Session.getInstance().getTheater().getMovie2().getShowtime1().getShowtime() +
                    " " + Integer.toString(Session.getInstance().getTheater().getMovie2().getShowtime1().getTickets())
                    + " tickets left");

            setShowtimeBackground(Session.getInstance().getTheater().getMovie2().getShowtime1().getTickets());
        }
        if (currentTicket.getMovie_id().equals("2") && currentTicket.getShowtime_id().equals("2")){
            showtime_info.setText(Session.getInstance().getTheater().getMovie2().getTitle() + ": " +
                    Session.getInstance().getTheater().getMovie2().getShowtime2().getShowtime() +
                    " " + Integer.toString(Session.getInstance().getTheater().getMovie2().getShowtime2().getTickets())
                    + " tickets left");

            setShowtimeBackground(Session.getInstance().getTheater().getMovie2().getShowtime2().getTickets());

        }
        if (currentTicket.getMovie_id().equals("2") && currentTicket.getShowtime_id().equals("3")){
            showtime_info.setText(Session.getInstance().getTheater().getMovie2().getTitle() + ": " +
                    Session.getInstance().getTheater().getMovie2().getShowtime3().getShowtime() +
                    " " + Integer.toString(Session.getInstance().getTheater().getMovie2().getShowtime3().getTickets())
                    + " tickets left");

            setShowtimeBackground(Session.getInstance().getTheater().getMovie2().getShowtime3().getTickets());

        }
        if (currentTicket.getMovie_id().equals("2") && currentTicket.getShowtime_id().equals("4")){
            showtime_info.setText(Session.getInstance().getTheater().getMovie2().getTitle() + ": " +
                    Session.getInstance().getTheater().getMovie2().getShowtime4().getShowtime() +
                    " " + Integer.toString(Session.getInstance().getTheater().getMovie2().getShowtime4().getTickets())
                    + " tickets left");

            setShowtimeBackground(Session.getInstance().getTheater().getMovie2().getShowtime4().getTickets());

        }
        if (currentTicket.getMovie_id().equals("2") && currentTicket.getShowtime_id().equals("5")){
            showtime_info.setText(Session.getInstance().getTheater().getMovie2().getTitle() + ": " +
                    Session.getInstance().getTheater().getMovie2().getShowtime5().getShowtime() +
                    " " + Integer.toString(Session.getInstance().getTheater().getMovie2().getShowtime5().getTickets())
                    + " tickets left");

            setShowtimeBackground(Session.getInstance().getTheater().getMovie2().getShowtime5().getTickets());

        }

        // movie 3
        if (currentTicket.getMovie_id().equals("3") && currentTicket.getShowtime_id().equals("1")){
            showtime_info.setText(Session.getInstance().getTheater().getMovie3().getTitle() + ": " +
                    Session.getInstance().getTheater().getMovie3().getShowtime1().getShowtime() +
                    " " + Integer.toString(Session.getInstance().getTheater().getMovie3().getShowtime1().getTickets())
                    + " tickets left");

            setShowtimeBackground(Session.getInstance().getTheater().getMovie3().getShowtime1().getTickets());
        }
        if (currentTicket.getMovie_id().equals("3") && currentTicket.getShowtime_id().equals("2")){
            showtime_info.setText(Session.getInstance().getTheater().getMovie3().getTitle() + ": " +
                    Session.getInstance().getTheater().getMovie3().getShowtime2().getShowtime() +
                    " " + Integer.toString(Session.getInstance().getTheater().getMovie3().getShowtime2().getTickets())
                    + " tickets left");

            setShowtimeBackground(Session.getInstance().getTheater().getMovie3().getShowtime2().getTickets());

        }
        if (currentTicket.getMovie_id().equals("3") && currentTicket.getShowtime_id().equals("3")){
            showtime_info.setText(Session.getInstance().getTheater().getMovie3().getTitle() + ": " +
                    Session.getInstance().getTheater().getMovie3().getShowtime3().getShowtime() +
                    " " + Integer.toString(Session.getInstance().getTheater().getMovie3().getShowtime3().getTickets())
                    + " tickets left");

            setShowtimeBackground(Session.getInstance().getTheater().getMovie3().getShowtime3().getTickets());

        }
        if (currentTicket.getMovie_id().equals("3") && currentTicket.getShowtime_id().equals("4")){
            showtime_info.setText(Session.getInstance().getTheater().getMovie3().getTitle() + ": " +
                    Session.getInstance().getTheater().getMovie3().getShowtime4().getShowtime() +
                    " " + Integer.toString(Session.getInstance().getTheater().getMovie3().getShowtime4().getTickets())
                    + " tickets left");

            setShowtimeBackground(Session.getInstance().getTheater().getMovie3().getShowtime4().getTickets());

        }
        if (currentTicket.getMovie_id().equals("3") && currentTicket.getShowtime_id().equals("5")){
            showtime_info.setText(Session.getInstance().getTheater().getMovie3().getTitle() + ": " +
                    Session.getInstance().getTheater().getMovie3().getShowtime5().getShowtime() +
                    " " + Integer.toString(Session.getInstance().getTheater().getMovie3().getShowtime5().getTickets())
                    + " tickets left");

            setShowtimeBackground(Session.getInstance().getTheater().getMovie3().getShowtime5().getTickets());

        }

        // movie 4
        if (currentTicket.getMovie_id().equals("4") && currentTicket.getShowtime_id().equals("1")){
            showtime_info.setText(Session.getInstance().getTheater().getMovie4().getTitle() + ": " +
                    Session.getInstance().getTheater().getMovie4().getShowtime1().getShowtime() +
                    " " + Integer.toString(Session.getInstance().getTheater().getMovie4().getShowtime1().getTickets())
                    + " tickets left");

            setShowtimeBackground(Session.getInstance().getTheater().getMovie4().getShowtime1().getTickets());
        }
        if (currentTicket.getMovie_id().equals("4") && currentTicket.getShowtime_id().equals("2")){
            showtime_info.setText(Session.getInstance().getTheater().getMovie4().getTitle() + ": " +
                    Session.getInstance().getTheater().getMovie4().getShowtime2().getShowtime() +
                    " " + Integer.toString(Session.getInstance().getTheater().getMovie4().getShowtime2().getTickets())
                    + " tickets left");

            setShowtimeBackground(Session.getInstance().getTheater().getMovie4().getShowtime2().getTickets());

        }
        if (currentTicket.getMovie_id().equals("4") && currentTicket.getShowtime_id().equals("3")){
            showtime_info.setText(Session.getInstance().getTheater().getMovie4().getTitle() + ": " +
                    Session.getInstance().getTheater().getMovie4().getShowtime3().getShowtime() +
                    " " + Integer.toString(Session.getInstance().getTheater().getMovie4().getShowtime3().getTickets())
                    + " tickets left");

            setShowtimeBackground(Session.getInstance().getTheater().getMovie4().getShowtime3().getTickets());

        }
        if (currentTicket.getMovie_id().equals("4") && currentTicket.getShowtime_id().equals("4")){
            showtime_info.setText(Session.getInstance().getTheater().getMovie4().getTitle() + ": " +
                    Session.getInstance().getTheater().getMovie4().getShowtime4().getShowtime() +
                    " " + Integer.toString(Session.getInstance().getTheater().getMovie4().getShowtime4().getTickets())
                    + " tickets left");

            setShowtimeBackground(Session.getInstance().getTheater().getMovie4().getShowtime4().getTickets());

        }
        if (currentTicket.getMovie_id().equals("4") && currentTicket.getShowtime_id().equals("5")){
            showtime_info.setText(Session.getInstance().getTheater().getMovie4().getTitle() + ": " +
                    Session.getInstance().getTheater().getMovie4().getShowtime5().getShowtime() +
                    " " + Integer.toString(Session.getInstance().getTheater().getMovie4().getShowtime5().getTickets())
                    + " tickets left");

            setShowtimeBackground(Session.getInstance().getTheater().getMovie4().getShowtime5().getTickets());

        }

        // movie 5
        if (currentTicket.getMovie_id().equals("5") && currentTicket.getShowtime_id().equals("1")){
            showtime_info.setText(Session.getInstance().getTheater().getMovie5().getTitle() + ": " +
                    Session.getInstance().getTheater().getMovie5().getShowtime1().getShowtime() +
                    " " + Integer.toString(Session.getInstance().getTheater().getMovie5().getShowtime1().getTickets())
                    + " tickets left");

            setShowtimeBackground(Session.getInstance().getTheater().getMovie5().getShowtime1().getTickets());
        }
        if (currentTicket.getMovie_id().equals("5") && currentTicket.getShowtime_id().equals("2")){
            showtime_info.setText(Session.getInstance().getTheater().getMovie5().getTitle() + ": " +
                    Session.getInstance().getTheater().getMovie5().getShowtime2().getShowtime() +
                    " " + Integer.toString(Session.getInstance().getTheater().getMovie5().getShowtime2().getTickets())
                    + " tickets left");

            setShowtimeBackground(Session.getInstance().getTheater().getMovie5().getShowtime2().getTickets());

        }
        if (currentTicket.getMovie_id().equals("5") && currentTicket.getShowtime_id().equals("3")){
            showtime_info.setText(Session.getInstance().getTheater().getMovie5().getTitle() + ": " +
                    Session.getInstance().getTheater().getMovie5().getShowtime3().getShowtime() +
                    " " + Integer.toString(Session.getInstance().getTheater().getMovie5().getShowtime3().getTickets())
                    + " tickets left");

            setShowtimeBackground(Session.getInstance().getTheater().getMovie5().getShowtime3().getTickets());

        }
        if (currentTicket.getMovie_id().equals("5") && currentTicket.getShowtime_id().equals("4")){
            showtime_info.setText(Session.getInstance().getTheater().getMovie5().getTitle() + ": " +
                    Session.getInstance().getTheater().getMovie5().getShowtime4().getShowtime() +
                    " " + Integer.toString(Session.getInstance().getTheater().getMovie5().getShowtime4().getTickets())
                    + " tickets left");

            setShowtimeBackground(Session.getInstance().getTheater().getMovie5().getShowtime4().getTickets());

        }
        if (currentTicket.getMovie_id().equals("5") && currentTicket.getShowtime_id().equals("5")){
            showtime_info.setText(Session.getInstance().getTheater().getMovie5().getTitle() + ": " +
                    Session.getInstance().getTheater().getMovie5().getShowtime5().getShowtime() +
                    " " + Integer.toString(Session.getInstance().getTheater().getMovie5().getShowtime5().getTickets())
                    + " tickets left");

            setShowtimeBackground(Session.getInstance().getTheater().getMovie5().getShowtime5().getTickets());

        }

        // movie 6
        if (currentTicket.getMovie_id().equals("6") && currentTicket.getShowtime_id().equals("1")){
            showtime_info.setText(Session.getInstance().getTheater().getMovie6().getTitle() + ": " +
                    Session.getInstance().getTheater().getMovie6().getShowtime1().getShowtime() +
                    " " + Integer.toString(Session.getInstance().getTheater().getMovie6().getShowtime1().getTickets())
                    + " tickets left");

            setShowtimeBackground(Session.getInstance().getTheater().getMovie6().getShowtime1().getTickets());
        }
        if (currentTicket.getMovie_id().equals("6") && currentTicket.getShowtime_id().equals("2")){
            showtime_info.setText(Session.getInstance().getTheater().getMovie6().getTitle() + ": " +
                    Session.getInstance().getTheater().getMovie6().getShowtime2().getShowtime() +
                    " " + Integer.toString(Session.getInstance().getTheater().getMovie6().getShowtime2().getTickets())
                    + " tickets left");

            setShowtimeBackground(Session.getInstance().getTheater().getMovie6().getShowtime2().getTickets());

        }
        if (currentTicket.getMovie_id().equals("6") && currentTicket.getShowtime_id().equals("3")){
            showtime_info.setText(Session.getInstance().getTheater().getMovie6().getTitle() + ": " +
                    Session.getInstance().getTheater().getMovie6().getShowtime3().getShowtime() +
                    " " + Integer.toString(Session.getInstance().getTheater().getMovie6().getShowtime3().getTickets())
                    + " tickets left");

            setShowtimeBackground(Session.getInstance().getTheater().getMovie6().getShowtime3().getTickets());

        }
        if (currentTicket.getMovie_id().equals("6") && currentTicket.getShowtime_id().equals("4")){
            showtime_info.setText(Session.getInstance().getTheater().getMovie6().getTitle() + ": " +
                    Session.getInstance().getTheater().getMovie6().getShowtime4().getShowtime() +
                    " " + Integer.toString(Session.getInstance().getTheater().getMovie6().getShowtime4().getTickets())
                    + " tickets left");

            setShowtimeBackground(Session.getInstance().getTheater().getMovie6().getShowtime4().getTickets());

        }
        if (currentTicket.getMovie_id().equals("6") && currentTicket.getShowtime_id().equals("5")){
            showtime_info.setText(Session.getInstance().getTheater().getMovie6().getTitle() + ": " +
                    Session.getInstance().getTheater().getMovie6().getShowtime5().getShowtime() +
                    " " + Integer.toString(Session.getInstance().getTheater().getMovie6().getShowtime5().getTickets())
                    + " tickets left");

            setShowtimeBackground(Session.getInstance().getTheater().getMovie6().getShowtime5().getTickets());

        }

    }

    public void setShowtimeBackground(int ticketsLeft) {

        if (ticketsLeft >= 50) {
            showtime_info_hbox.setStyle("-fx-background-color: lightgreen");
            canAddTickets = true;
        }
        if (ticketsLeft > 0 && ticketsLeft < 50) {
            showtime_info_hbox.setStyle("-fx-background-color: yellow");
            canAddTickets = true;
        }
        if (ticketsLeft <= 0) {
            showtime_info_hbox.setStyle("-fx-background-color: hotpink");
            canAddTickets = false;
        }
    }



    // TICKET TYPE BUTTON HANDLERS
    @FXML
    public void handle_ticketype_adult(ActionEvent event){

        if (canAddTickets) {
            currentTicket.setTicket_type("Adult");


            // add currentTicket to transaction
            currentTransaction.tickets.add(new Ticket(currentTicket));

            currentTransactionTotal += Session.getInstance().getTheater().ticketprice_adult;

            transactionWindow.getChildren().clear();

            for (int i = 0; i < currentTransaction.tickets.size(); i++) {
                transactionWindow.getChildren().add(new TicketLabel(currentTransaction.tickets.get(i)));
            }

            currentTotal.setText(Double.toString(currentTransactionTotal));


            transactionCount++;
        }
        else{
            System.out.println("SOLD OUT");
        }

    }
    @FXML
    public void handle_tickettype_child(ActionEvent event){
        if (canAddTickets) {
            currentTicket.setTicket_type("Child");

            // add currentTicket to transaction
            currentTransaction.tickets.add(new Ticket(currentTicket));

            currentTransactionTotal += Session.getInstance().getTheater().ticketprice_child;

            transactionWindow.getChildren().clear();

            for (int i = 0; i < currentTransaction.tickets.size(); i++) {
                transactionWindow.getChildren().add(new TicketLabel(currentTransaction.tickets.get(i)));
            }


            currentTotal.setText(Double.toString(currentTransactionTotal));
            transactionCount++;
        }
        else{
            System.out.println("SOLD OUT");
        }
    }

    @FXML
    public void handle_tickettype_senior(ActionEvent event){
        if(canAddTickets) {
            currentTicket.setTicket_type("Senior");


            // add currentTicket to transaction
            currentTransaction.tickets.add(new Ticket(currentTicket));

            currentTransactionTotal += Session.getInstance().getTheater().ticketprice_senior;

            transactionWindow.getChildren().clear();

            for (int i = 0; i < currentTransaction.tickets.size(); i++) {
                transactionWindow.getChildren().add(new TicketLabel(currentTransaction.tickets.get(i)));
            }

            currentTotal.setText(Double.toString(currentTransactionTotal));
            transactionCount++;
        }
        else{
            System.out.println("Sold Out");
        }
    }
    @FXML
    public void handle_tickettype_student(ActionEvent event){
        if (canAddTickets) {
            currentTicket.setTicket_type("Student");


            // add currentTicket to transaction
            currentTransaction.tickets.add(new Ticket(currentTicket));

            transactionWindow.getChildren().clear();

            currentTransactionTotal += Session.getInstance().getTheater().ticketprice_student;

            for (int i = 0; i < currentTransaction.tickets.size(); i++) {
                transactionWindow.getChildren().add(new TicketLabel(currentTransaction.tickets.get(i)));
            }

            currentTotal.setText(Double.toString(currentTransactionTotal));

            transactionCount++;
        }
        else{
            System.out.println("SOLD OUT");
        }
    }
    @FXML
    public void handle_tickettype_pass(ActionEvent event){
    if (canAddTickets) {
        currentTicket.setTicket_type("Pass");


        // add currentTicket to transaction
        currentTransaction.tickets.add(new Ticket(currentTicket));

        transactionWindow.getChildren().clear();

        currentTransactionTotal += Session.getInstance().getTheater().ticketprice_pass;

        for (int i = 0; i < currentTransaction.tickets.size(); i++) {
            transactionWindow.getChildren().add(new TicketLabel(currentTransaction.tickets.get(i)));
        }

        currentTotal.setText(Double.toString(currentTransactionTotal));
        transactionCount++;
    }
    else{
        System.out.println("Sold OUT");
    }
    }

    @FXML
    public void handle_removeLastTicket(ActionEvent event){

        String ticket_type = currentTransaction.tickets.get(currentTransaction.tickets.size()-1).getTicket_type();

        if (ticket_type.equals("Adult")){
            currentTransactionTotal -= Session.getInstance().getTheater().ticketprice_adult;
        }
        if (ticket_type.equals("Child")){
            currentTransactionTotal -= Session.getInstance().getTheater().ticketprice_child;
        }
        if (ticket_type.equals("Senior")){
            currentTransactionTotal -= Session.getInstance().getTheater().ticketprice_senior;
        }
        if (ticket_type.equals("Student")){
            currentTransactionTotal -= Session.getInstance().getTheater().ticketprice_student;
        }
        if (ticket_type.equals("Pass")){
            currentTransactionTotal -= Session.getInstance().getTheater().ticketprice_pass;
        }

        currentTransaction.tickets.remove(currentTransaction.tickets.size()-1);
        transactionWindow.getChildren().clear();

        for(int i = 0; i < currentTransaction.tickets.size(); i++){
            transactionWindow.getChildren().add(new TicketLabel(currentTransaction.tickets.get(i)));
        }

        currentTotal.setText(Double.toString(currentTransactionTotal));
        transactionCount--;
    }

    @FXML
    public void handle_clearTransaction(ActionEvent event){
        transactionWindow.getChildren().clear();
        currentTransaction = new Transaction();
        currentTransactionTotal = 0.0;
        currentTotal.setText(Double.toString(currentTransactionTotal));
        currentRegisterValue.setText("");
        registerStatus.setText("");
    }


    @FXML
    public void handle_processTransaction(ActionEvent event){

        for (int i = 0; i < currentTransaction.tickets.size(); i++) {
            Session.getInstance().getDBConnector().decrementTicketByMovieIDAndShowtimeID(currentTransaction.tickets.get(i).getMovie_id(), currentTransaction.tickets.get(i).getShowtime_id());
        }

        currentTransaction = new Transaction();
        transactionWindow.getChildren().clear();
        currentTransactionTotal = 0.0;
        currentTotal.setText(Double.toString(currentTransactionTotal));


        // set Sessions Theater State for each Movie
        Session.getInstance().getTheater().setMovie1(Session.getInstance().getDBConnector().getMovie(1));
        Session.getInstance().getTheater().setMovie2(Session.getInstance().getDBConnector().getMovie(2));
        Session.getInstance().getTheater().setMovie3(Session.getInstance().getDBConnector().getMovie(3));
        Session.getInstance().getTheater().setMovie4(Session.getInstance().getDBConnector().getMovie(4));
        Session.getInstance().getTheater().setMovie5(Session.getInstance().getDBConnector().getMovie(5));
        Session.getInstance().getTheater().setMovie6(Session.getInstance().getDBConnector().getMovie(6));
    }

    @FXML
    public void handle_refundTransaction(ActionEvent event){

        for (int i = 0; i < currentTransaction.tickets.size(); i++) {
            Session.getInstance().getDBConnector().incrementTicketByMovieIDAndShowtimeID(currentTransaction.tickets.get(i).getMovie_id(), currentTransaction.tickets.get(i).getShowtime_id());
        }

        registerStatus.setText("Refund Complete! Change Due: $"+currentTransactionTotal);

        currentTransaction = new Transaction();
        transactionWindow.getChildren().clear();
        currentTransactionTotal = 0.0;
        currentTotal.setText(Double.toString(currentTransactionTotal));


        // set Sessions Theater State for each Movie
        Session.getInstance().getTheater().setMovie1(Session.getInstance().getDBConnector().getMovie(1));
        Session.getInstance().getTheater().setMovie2(Session.getInstance().getDBConnector().getMovie(2));
        Session.getInstance().getTheater().setMovie3(Session.getInstance().getDBConnector().getMovie(3));
        Session.getInstance().getTheater().setMovie4(Session.getInstance().getDBConnector().getMovie(4));
        Session.getInstance().getTheater().setMovie5(Session.getInstance().getDBConnector().getMovie(5));
        Session.getInstance().getTheater().setMovie6(Session.getInstance().getDBConnector().getMovie(6));
    }


    @FXML
    public void handle_LogOut(ActionEvent event){
        try {
            // Change Scene
            Parent employeeLogin = FXMLLoader.load(getClass().getResource("EmployeeLogin.fxml"));
            Scene employeeLogin_scene = new Scene(employeeLogin);
            Stage main_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            main_stage.setFullScreen(true);
            main_stage.setScene(employeeLogin_scene);
            main_stage.setFullScreen(true);
            Session.getInstance().setEmployeeID(null);

            // CHANGE CURRENT SCENE TO 2
            Session.getInstance().currentScene = 2;

        } catch (Exception e){

        }
    }

    //////////////// NUMBER PAD HANDLERS ////////////////////////////////////////////////

    @FXML
    public void handle_btn_num1(ActionEvent event){
        String currentReg = currentRegisterValue.getText();
        currentRegisterValue.setText(currentReg + "1");
    }
    @FXML
    public void handle_btn_num2(ActionEvent event){
        String currentReg = currentRegisterValue.getText();
        currentRegisterValue.setText(currentReg + "2");
    }
    @FXML
    public void handle_btn_num3(ActionEvent event){
        String currentReg = currentRegisterValue.getText();
        currentRegisterValue.setText(currentReg + "3");
    }

    @FXML
    public void handle_btn_num4(ActionEvent event){
        String currentReg = currentRegisterValue.getText();
        currentRegisterValue.setText(currentReg + "4");
    }

    @FXML
    public void handle_btn_num5(ActionEvent event){
        String currentReg = currentRegisterValue.getText();
        currentRegisterValue.setText(currentReg + "5");
    }

    @FXML
    public void handle_btn_num6(ActionEvent event){
        String currentReg = currentRegisterValue.getText();
        currentRegisterValue.setText(currentReg + "6");
    }

    @FXML
    public void handle_btn_num7(ActionEvent event){
        String currentReg = currentRegisterValue.getText();
        currentRegisterValue.setText(currentReg + "7");
    }

    @FXML
    public void handle_btn_num8(ActionEvent event){
        String currentReg = currentRegisterValue.getText();
        currentRegisterValue.setText(currentReg + "8");
    }

    @FXML
    public void handle_btn_num9(ActionEvent event){
        String currentReg = currentRegisterValue.getText();
        currentRegisterValue.setText(currentReg + "9");
    }

    @FXML
    public void handle_btn_num0(ActionEvent event){
        String currentReg = currentRegisterValue.getText();
        currentRegisterValue.setText(currentReg + "0");
    }

    @FXML
    public void handle_btn_numDecimal(ActionEvent event){
        String currentReg = currentRegisterValue.getText();
        currentRegisterValue.setText(currentReg + ".");
    }

    @FXML
    public void handle_numClear(ActionEvent event){
        currentRegisterValue.setText("");
        registerStatus.setText("");
    }




    @FXML
    public void handle_btnCash(ActionEvent event){
            // currentRegisterValue, converted to double from string
            double cr_value = Double.valueOf(currentRegisterValue.getText());
            double changeDue = cr_value - currentTransactionTotal;

            // if changeDue is less than 0, then DO NOT process transaction. prompt user to alert customer
            if (changeDue < 0){
                registerStatus.setText("Insufficient Funds");
            }
            else {
                registerStatus.setText("Transaction Complete! Change Due: " + Double.toString(changeDue));
                btn_processTransaction.fire();
            }


    }





    // initialize: executes ON LOAD of MainVendor
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        theaterID.setText(Session.getInstance().getDbID());
        empID.setText(Session.getInstance().getEmployeeID());
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        Date dateobj = new Date();
        currentDate.setText(df.format(dateobj));

        // set Sessions Theater State for each Movie
        Session.getInstance().getTheater().setMovie1(Session.getInstance().getDBConnector().getMovie(1));
        Session.getInstance().getTheater().setMovie2(Session.getInstance().getDBConnector().getMovie(2));
        Session.getInstance().getTheater().setMovie3(Session.getInstance().getDBConnector().getMovie(3));
        Session.getInstance().getTheater().setMovie4(Session.getInstance().getDBConnector().getMovie(4));
        Session.getInstance().getTheater().setMovie5(Session.getInstance().getDBConnector().getMovie(5));
        Session.getInstance().getTheater().setMovie6(Session.getInstance().getDBConnector().getMovie(6));

        // set all movie buttons to correct titles.
        btn_movie1.setText(Session.getInstance().getTheater().getMovie1().getTitle());
        btn_movie2.setText(Session.getInstance().getTheater().getMovie2().getTitle());
        btn_movie3.setText(Session.getInstance().getTheater().getMovie3().getTitle());
        btn_movie4.setText(Session.getInstance().getTheater().getMovie4().getTitle());
        btn_movie5.setText(Session.getInstance().getTheater().getMovie5().getTitle());
        btn_movie6.setText(Session.getInstance().getTheater().getMovie6().getTitle());


        String totalToString = Double.toString(currentTransactionTotal);
        currentTotal.setText(totalToString);


        // auto-selects movie1 on load
        btn_movie1.fire();
        btn_showtime1.fire();


        // SET SCENE TO 3
        Session.getInstance().currentScene = 3;

    }
}
