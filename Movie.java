package MESS;

public class Movie {

    private String id;
    private String title;
    private String rating;
    private String starring;
    private String director;
    private String runtime;
    private String synopsis;

    // each movie has 5 showtimes
    private Showtime showtime1;
    private Showtime showtime2;
    private Showtime showtime3;
    private Showtime showtime4;
    private Showtime showtime5;

    public Showtime getShowtime1() {
        return showtime1;
    }

    public void setShowtime1(Showtime showtime1) {
        this.showtime1 = showtime1;
    }

    public Showtime getShowtime2() {
        return showtime2;
    }

    public void setShowtime2(Showtime showtime2) {
        this.showtime2 = showtime2;
    }

    public Showtime getShowtime3() {
        return showtime3;
    }

    public void setShowtime3(Showtime showtime3) {
        this.showtime3 = showtime3;
    }

    public Showtime getShowtime4() {
        return showtime4;
    }

    public void setShowtime4(Showtime showtime4) {
        this.showtime4 = showtime4;
    }

    public Showtime getShowtime5() {
        return showtime5;
    }

    public void setShowtime5(Showtime showtime5) {
        this.showtime5 = showtime5;
    }



    public Movie(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getStarring() {
        return starring;
    }

    public void setStarring(String starring) {
        this.starring = starring;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

}
