import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Actor diCaprio = new Actor("Leonardo", "DiCaprio");
        Actor tomHardy = new Actor("Tom", "Hardy");
        Actor jamieFoxx = new Actor("Jamie", "Foxx");
        Actor kateWinslet = new Actor("Kate", "Winslet");
        Actor samuelJackson = new Actor("Samuel", "Jackson");


        List<Actor> titanicActors = new ArrayList<>();
        titanicActors.add(diCaprio);
        titanicActors.add(kateWinslet);
        titanicActors.add(new Actor("Billy", "Zane"));

        List<Actor> inceptionActors = new ArrayList<>();
        inceptionActors.add(diCaprio);
        inceptionActors.add(tomHardy);
        inceptionActors.add(new Actor("Ken", "Watanabe"));


        List<Actor> djangoActors = new ArrayList<>();
        djangoActors.add(diCaprio);
        djangoActors.add(samuelJackson);
        djangoActors.add(jamieFoxx);

        Director jamesCameron = new Director("James", "Cameron");
        Director christopherNolan = new Director("Christopher", "Nolan");
        Director quentinTarantino = new Director("Quentin", "Tarantino");


        Movie titanic = new Movie(jamesCameron, titanicActors, 1998, "Titanic");
        Movie inception = new Movie(christopherNolan, inceptionActors, 2010, "Inception");

        MovieLibrary library = new MovieLibrary();
        library.addMovie(titanic);
        library.addMovie(inception);
        library.addMovie(new Movie(quentinTarantino, djangoActors, 2012, "Django"));

        int startDate = 1990;
        int endDate = 2011;

        library.printMoviesInDates(startDate, endDate);
        library.printMoviesWithActor("Leonardo", "DiCaprio");
        library.printMoviesWithActor("Samuel", "Jackson");

    }
}
