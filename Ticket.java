package MESS;

public class Ticket {


    private String movie_id;
    private String showtime_id;
    private String ticket_type;

    public Ticket(){

    }

    public Ticket(Ticket ticket){
        this.movie_id = ticket.getMovie_id();
        this.showtime_id = ticket.getShowtime_id();
        this.ticket_type = ticket.getTicket_type();
    }

    public String getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(String movie_id) {
        this.movie_id = movie_id;
    }

    public String getShowtime_id() {
        return showtime_id;
    }

    public void setShowtime_id(String showtime_id) {
        this.showtime_id = showtime_id;
    }

    public String getTicket_type() {
        return ticket_type;
    }

    public void setTicket_type(String ticket_type) {
        this.ticket_type = ticket_type;
    }

}
