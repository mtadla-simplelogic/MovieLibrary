import java.util.List;

public class Movie {
    private Director director;
    private List<Actor> actors;
    private int yearOfProduction;
    private String title;

    public Movie(Director director, List<Actor> actors, int yearOfProduction, String title) {
        this.director = director;
        this.actors = actors;
        this.yearOfProduction = yearOfProduction;
        this.title = title;
    }

    public Director getDirector() {
        return director;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public String getTitle() {
        return title;
    }
}
