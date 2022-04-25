import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class MovieLibrary {
    List<Movie> movies;

    public MovieLibrary() {
        movies = new ArrayList<>();
    }

    public void addMovie(Movie movie){
        movies.add(movie);
    }

    public void printMoviesInDates(int start, int end){
        System.out.println("Movies in dates: " + start + "-" + end);
        for (Movie movie : movies){
            if(movie.getYearOfProduction() > start && movie.getYearOfProduction() < end){
                System.out.println(movie.getTitle());
            }
        }
    }

    public void printMoviesWithActor(String firstName, String lastName){
        System.out.println("Movies with actor: " + firstName + " " + lastName);

        for (Movie movie : movies){
            for (Actor actor : movie.getActors()){
                if(actor.getFirstName().equals(firstName) && actor.getLastName().equals(lastName)){
                    System.out.println(movie.getTitle());
                }
            }
        }
    }

}
