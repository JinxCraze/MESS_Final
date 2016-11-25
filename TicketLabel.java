package MESS;


import javafx.scene.control.Label;

public class TicketLabel extends Label {

    public String movieTitle;
    public String movieShowtime;
    public String ticketType;

    public TicketLabel(Ticket ticket){
       this.setText(convertMovieIdToTitle(ticket.getMovie_id()) + " - " + convertShowtimeIDtoTime( ticket.getMovie_id(),
               ticket.getShowtime_id()) + " " + convertTicketTypeToTypePrice(ticket.getTicket_type()));

        this.setStyle("-fx-font-size: 20px");
    }

    public String convertTicketTypeToTypePrice(String ticketType){
        String type_price = "";

        if (ticketType.equals("Adult")){
            type_price = "ADULT - $8.50";
        }
        if (ticketType.equals("Child")){
            type_price = "CHILD - $6.25";
        }
        if (ticketType.equals("Senior")){
            type_price = "SENIOR - $6.25";
        }
        if (ticketType.equals("Student")){
            type_price = "Student - $6.25";
        }
        if (ticketType.equals("Pass")){
            type_price = "Pass - $0.00";
        }

        return type_price;
    }

    public String convertMovieIdToTitle(String movieId){
        String movieTitle = "";

        if (movieId.equals("1")){
            movieTitle = Session.getInstance().getTheater().getMovie1().getTitle();
        }
        if (movieId.equals("2")){
            movieTitle = Session.getInstance().getTheater().getMovie2().getTitle();
        }
        if (movieId.equals("3")){
            movieTitle = Session.getInstance().getTheater().getMovie3().getTitle();
        }
        if (movieId.equals("4")){
            movieTitle = Session.getInstance().getTheater().getMovie4().getTitle();
        }
        if (movieId.equals("5")){
            movieTitle = Session.getInstance().getTheater().getMovie5().getTitle();
        }
        if (movieId.equals("6")){
            movieTitle = Session.getInstance().getTheater().getMovie6().getTitle();
        }
        return movieTitle;
    }

    public String convertShowtimeIDtoTime(String movieId, String showtimeId){

        String showtime = "";

        if (movieId.equals("1")){
            if (showtimeId.equals("1")){
                showtime = Session.getInstance().getTheater().getMovie1().getShowtime1().getShowtime();
            }
        }
        if (movieId.equals("1")){
            if (showtimeId.equals("2")){
                showtime = Session.getInstance().getTheater().getMovie1().getShowtime2().getShowtime();
            }
        }
        if (movieId.equals("1")){
            if (showtimeId.equals("3")){
                showtime = Session.getInstance().getTheater().getMovie1().getShowtime3().getShowtime();
            }
        }
        if (movieId.equals("1")){
            if (showtimeId.equals("4")){
                showtime = Session.getInstance().getTheater().getMovie1().getShowtime4().getShowtime();
            }
        }
        if (movieId.equals("1")){
            if (showtimeId.equals("5")){
                showtime = Session.getInstance().getTheater().getMovie1().getShowtime5().getShowtime();
            }
        }

        ///////////

        if (movieId.equals("2")){
            if (showtimeId.equals("1")){
                showtime = Session.getInstance().getTheater().getMovie2().getShowtime1().getShowtime();
            }
        }
        if (movieId.equals("2")){
            if (showtimeId.equals("2")){
                showtime = Session.getInstance().getTheater().getMovie2().getShowtime2().getShowtime();
            }
        }
        if (movieId.equals("2")){
            if (showtimeId.equals("3")){
                showtime = Session.getInstance().getTheater().getMovie2().getShowtime3().getShowtime();
            }
        }
        if (movieId.equals("2")){
            if (showtimeId.equals("4")){
                showtime = Session.getInstance().getTheater().getMovie2().getShowtime4().getShowtime();
            }
        }
        if (movieId.equals("2")){
            if (showtimeId.equals("5")){
                showtime = Session.getInstance().getTheater().getMovie2().getShowtime5().getShowtime();
            }
        }

        ///////////////////

        if (movieId.equals("3")){
            if (showtimeId.equals("1")){
                showtime = Session.getInstance().getTheater().getMovie3().getShowtime1().getShowtime();
            }
        }
        if (movieId.equals("3")){
            if (showtimeId.equals("2")){
                showtime = Session.getInstance().getTheater().getMovie3().getShowtime2().getShowtime();
            }
        }
        if (movieId.equals("3")){
            if (showtimeId.equals("3")){
                showtime = Session.getInstance().getTheater().getMovie3().getShowtime3().getShowtime();
            }
        }
        if (movieId.equals("3")){
            if (showtimeId.equals("4")){
                showtime = Session.getInstance().getTheater().getMovie3().getShowtime4().getShowtime();
            }
        }
        if (movieId.equals("3")){
            if (showtimeId.equals("5")){
                showtime = Session.getInstance().getTheater().getMovie3().getShowtime5().getShowtime();
            }
        }

        if (movieId.equals("4")){
            if (showtimeId.equals("1")){
                showtime = Session.getInstance().getTheater().getMovie4().getShowtime1().getShowtime();
            }
        }
        if (movieId.equals("4")){
            if (showtimeId.equals("2")){
                showtime = Session.getInstance().getTheater().getMovie4().getShowtime2().getShowtime();
            }
        }
        if (movieId.equals("4")){
            if (showtimeId.equals("3")){
                showtime = Session.getInstance().getTheater().getMovie4().getShowtime3().getShowtime();
            }
        }
        if (movieId.equals("4")){
            if (showtimeId.equals("4")){
                showtime = Session.getInstance().getTheater().getMovie4().getShowtime4().getShowtime();
            }
        }
        if (movieId.equals("4")){
            if (showtimeId.equals("5")){
                showtime = Session.getInstance().getTheater().getMovie4().getShowtime5().getShowtime();
            }
        }

        if (movieId.equals("5")){
            if (showtimeId.equals("1")){
                showtime = Session.getInstance().getTheater().getMovie5().getShowtime1().getShowtime();
            }
        }
        if (movieId.equals("5")){
            if (showtimeId.equals("2")){
                showtime = Session.getInstance().getTheater().getMovie5().getShowtime2().getShowtime();
            }
        }
        if (movieId.equals("5")){
            if (showtimeId.equals("3")){
                showtime = Session.getInstance().getTheater().getMovie5().getShowtime3().getShowtime();
            }
        }
        if (movieId.equals("5")){
            if (showtimeId.equals("4")){
                showtime = Session.getInstance().getTheater().getMovie5().getShowtime4().getShowtime();
            }
        }
        if (movieId.equals("5")){
            if (showtimeId.equals("5")){
                showtime = Session.getInstance().getTheater().getMovie5().getShowtime5().getShowtime();
            }
        }

        /////////////////////////
        if (movieId.equals("6")){
            if (showtimeId.equals("1")){
                showtime = Session.getInstance().getTheater().getMovie6().getShowtime1().getShowtime();
            }
        }
        if (movieId.equals("6")){
            if (showtimeId.equals("2")){
                showtime = Session.getInstance().getTheater().getMovie6().getShowtime2().getShowtime();
            }
        }
        if (movieId.equals("6")){
            if (showtimeId.equals("3")){
                showtime = Session.getInstance().getTheater().getMovie6().getShowtime3().getShowtime();
            }
        }
        if (movieId.equals("6")){
            if (showtimeId.equals("4")){
                showtime = Session.getInstance().getTheater().getMovie6().getShowtime4().getShowtime();
            }
        }
        if (movieId.equals("6")){
            if (showtimeId.equals("5")){
                showtime = Session.getInstance().getTheater().getMovie6().getShowtime5().getShowtime();
            }
        }

        return showtime;
    }


}
