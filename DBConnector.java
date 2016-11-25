package MESS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnector {

    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;

    private String dbPath;
    private String dbAdmin;
    private String dbPass;

    public DBConnector(String dbPath, String dbAdmin, String dbPass) {
        this.dbPath = dbPath;
        this.dbAdmin = dbAdmin;
        this.dbPass = dbPass;
    }

    public boolean setConnection() {
        try {
            this.connection = DriverManager.getConnection("jdbc:mysql://107.180.4.111/" + this.dbPath, this.dbAdmin, this.dbPass);
            System.out.println("DBConnector: setConnection() -> Connection Successful");
            return true;
        } catch (Exception e) {
            System.out.println("DBConnector: setConnection() -> Connection FAILED");
            return false;
        }
    }

    public boolean checkEmployee(String empID) {
//        try {
//            this.connection = DriverManager.getConnection("jdbc:mysql://107.180.4.111/" + Session.getInstance().getDbID(), Session.getInstance().getDbAdmin(), Session.getInstance().getDbPass());
//        } catch (Exception e) {
//            System.out.println("ERROR: checkEmployee()");
//        }

        this.createStatement();

        String employeeIDQuery = "SELECT * FROM employee where eid =" + "'" + empID + "'";

        setResultSet(employeeIDQuery);

        try {
            while (resultSet.next()) {
                if (resultSet.getString(1).equals(empID)) {
                    System.out.println("Employee Found");
                    return true;
                }
            }
        } catch (Exception e) {
            System.out.println("Error checking employeeID");
        }

        System.out.println("Employee ID Not Found");

        return false;

    }

    public void createStatement() {
        try {
            this.statement = this.connection.createStatement();
        } catch (Exception e) {
            System.out.println("ERROR: createStatement()");
        }
    }

    public void setResultSet(String query) {
        try {
            this.resultSet = this.statement.executeQuery(query);
        } catch (Exception e) {
            System.out.println("ERROR: setResultSet()");
        }
    }

    public ResultSet getResultSet() {
        return this.resultSet;
    }


    // getMovie returns a movie object containing all movie info based on given id.  id corresponds to movie's id on database
    public Movie getMovie(int id) {

        // movie to return
        Movie movie = new Movie();
//
//        try {
//            this.connection = DriverManager.getConnection("jdbc:mysql://107.180.4.111/" + Session.getInstance().getDbID(), Session.getInstance().getDbAdmin(), Session.getInstance().getDbPass());
//        } catch (Exception e) {
//            System.out.println("ERROR: getMovie()");
//        }

        // boilerplate stmt code for sql
        this.createStatement();

        // query gets full row by movie_id
        String getMovieQuery = "SELECT * FROM `movie` WHERE `movie_id`=" + id;

        // actual query is set
        setResultSet(getMovieQuery);
        try {
            while (resultSet.next()) {

                // set movie.id -- 1st column in query results
                movie.setId(resultSet.getString(1));

                //set movie.title
                movie.setTitle(resultSet.getString(2));

                // set movie.rating
                movie.setRating(resultSet.getString(3));

                // set movie.starring
                movie.setStarring(resultSet.getString(4));

                // set movie.director
                movie.setDirector(resultSet.getString(5));

                //set movie.runtime
                movie.setRuntime(resultSet.getString(6));

                //set movie.synopsis
                movie.setSynopsis(resultSet.getString(7));

            }
        } catch (Exception e) {

        }

        // now set SHOWTIMES
        this.createStatement();

        String getShowtimesQuery = "SELECT * FROM `showtime` WHERE `movie_id`="+id;

        // actual query is set
        setResultSet(getShowtimesQuery);

        try{
            while(resultSet.next()){
                if (resultSet.getString(5).equals("1")){
                    movie.setShowtime1(new Showtime(resultSet.getString(1), resultSet.getString(2), resultSet.getInt(4)));
                }
                if (resultSet.getString(5).equals("2")){
                    movie.setShowtime2(new Showtime(resultSet.getString(1), resultSet.getString(2), resultSet.getInt(4)));
                }
                if (resultSet.getString(5).equals("3")){
                    movie.setShowtime3(new Showtime(resultSet.getString(1), resultSet.getString(2), resultSet.getInt(4)));
                }
                if (resultSet.getString(5).equals("4")){
                    movie.setShowtime4(new Showtime(resultSet.getString(1), resultSet.getString(2), resultSet.getInt(4)));
                }
                if (resultSet.getString(5).equals("5")){
                    movie.setShowtime5(new Showtime(resultSet.getString(1), resultSet.getString(2), resultSet.getInt(4)));
                }
            }
        }catch (Exception e){

        }



        return movie;
        }

    public void decrementTicketByMovieIDAndShowtimeID(String movieID, String showtimeID){

//        try {
//            this.connection = DriverManager.getConnection("jdbc:mysql://107.180.4.111/" + Session.getInstance().getDbID(),
//                    Session.getInstance().getDbAdmin(), Session.getInstance().getDbPass());
//        } catch (Exception e) {
//            System.out.println("ERROR");
//        }

        // boilerplate stmt code for sql
        this.createStatement();

        String decrementQuery = "UPDATE `showtime` SET tickets = tickets - 1 WHERE `movie_id`=" + movieID + " AND `showtime_order`="+showtimeID;

        try {
            this.statement.execute(decrementQuery);
        }catch (Exception e){
            System.out.println("ERROR!!");
        }
    }

    public void incrementTicketByMovieIDAndShowtimeID(String movieID, String showtimeID){

//        try {
//            this.connection = DriverManager.getConnection("jdbc:mysql://107.180.4.111/" + Session.getInstance().getDbID(),
//                    Session.getInstance().getDbAdmin(), Session.getInstance().getDbPass());
//        } catch (Exception e) {
//            System.out.println("ERROR");
//        }

        // boilerplate stmt code for sql
        this.createStatement();

        String incrementQuery = "UPDATE `showtime` SET tickets = tickets + 1 WHERE `movie_id`=" + movieID + " AND `showtime_order`="+showtimeID;

        try {
            this.statement.execute(incrementQuery);
        }catch (Exception e){
            System.out.println("ERROR!!");
        }
    }

    }




