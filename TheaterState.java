package MESS;

public class TheaterState {

    Movie movie1;
    Movie movie2;
    Movie movie3;
    Movie movie4;
    Movie movie5;
    Movie movie6;

    final Double ticketprice_adult = 8.50;
    final Double ticketprice_child = 6.25;
    final Double ticketprice_senior = 6.25;
    final Double ticketprice_student = 6.25;
    final Double ticketprice_pass = 0.0;

    public TheaterState(){

    }


    public Movie getMovie1() {
        return movie1;
    }

    public void setMovie1(Movie movie1) {
        this.movie1 = movie1;
    }

    public Movie getMovie2() {
        return movie2;
    }

    public void setMovie2(Movie movie2) {
        this.movie2 = movie2;
    }

    public Movie getMovie3() {
        return movie3;
    }

    public void setMovie3(Movie movie3) {
        this.movie3 = movie3;
    }

    public Movie getMovie4() {
        return movie4;
    }

    public void setMovie4(Movie movie4) {
        this.movie4 = movie4;
    }

    public Movie getMovie5() {
        return movie5;
    }

    public void setMovie5(Movie movie5) {
        this.movie5 = movie5;
    }

    public Movie getMovie6() {
        return movie6;
    }

    public void setMovie6(Movie movie6) {
        this.movie6 = movie6;
    }

}
