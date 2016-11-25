package MESS;

public class Session {

    private final static Session instance = new Session();

    public static Session getInstance(){
        return instance;
    }

    // global DBConnector
    private DBConnector dbc;

    // string to hold current dbID (aka Theater ID. ie "mess_01")
    private String dbID;

    // string to hold current dbAdmin
    private String dbAdmin = "mess_admin1";

    // string to hold current dbPass
    private String dbPass;

    // string to hold current Employee ID
    private String employeeID;

    // TheaterState from Database
    private TheaterState theater = new TheaterState();

    // if timeOut = true, return to EmployeeScene
    boolean timeOut = false;

    int currentScene = 1; // 1, theater login 2, employee login, 3, main vendor screen

    // currentTransaction
    private Transaction currentTransaction = new Transaction();

    public Transaction getCurrentTransaction() {
        return currentTransaction;
    }

    public void setCurrentTransaction(Transaction currentTransaction) {
        this.currentTransaction = currentTransaction;
    }



    public void setDBConnector(String dbcPath, String dbcAdmin, String dbcPass){
        dbc = new DBConnector(dbcPath, dbcAdmin, dbcPass);
    }

    public void setTheater(TheaterState theater) {
        this.theater = theater;
    }

    public TheaterState getTheater() {
        return theater;
    }


    public DBConnector getDBConnector(){
        return this.dbc;
    }

    public void setDbAdmin(String newDbAdmin){
        this.dbAdmin = newDbAdmin;
    }

    public String getDbAdmin(){
        return dbAdmin;
    }

    public String getDbPass(){
        return dbPass;
    }

    public void setDbPass(String newDbPass){
        dbPass = newDbPass;
    }

    public String getDbID(){
        return dbID;
    }

    public void setDbID(String newDbID){
        dbID = newDbID;
    }

    public String getEmployeeID(){
        return employeeID;
    }

    public void setEmployeeID(String empID){
        employeeID = empID;
    }


}
