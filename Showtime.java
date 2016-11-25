package MESS;

public class Showtime {

    private String showtime_id;
    private String showtime;
    private int ticketsLeft;

    public Showtime(String sid, String showtime, int tixleft){
        this.setShowtime_id(sid);
        this.setShowtime(showtime);
        this.ticketsLeft = tixleft;
    }
    public Showtime(String sid, String showtime){
        this.setShowtime_id(sid);
        this.setShowtime(showtime);
    }


    public String getShowtime_id() {
        return showtime_id;
    }

    public void setShowtime_id(String showtime_id) {
        this.showtime_id = showtime_id;
    }

    public String getShowtime() {
        return showtime;
    }

    public void setShowtime(String showtime) {
        this.showtime = showtime;
    }

    public int getTickets(){
        return this.ticketsLeft;
    }

    public void setTicketsLeft(int newAmount){
        this.ticketsLeft = newAmount;
    }

}


