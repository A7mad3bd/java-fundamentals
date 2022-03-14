package inheritance;

import javafx.util.Pair;

import java.util.ArrayList;

public class Theater {


    private final String name;
    ArrayList arrayList = new ArrayList<Pair>();
    Pair<String, Integer> reviews = new Pair<String, Integer>("", 0);


    ArrayList<String> Movies;

    public Theater(String name, ArrayList<String> movies) {
        this.name = name;
        this.Movies = movies;
    }

    public void addMovie(String mov) {
        Movies.add(mov);
    }

    public void removeMovie(String mov) {
        Movies.remove(mov);
    }

    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", reviews=" + arrayList +
                ", Movies=" + Movies +
                '}';
    }

    public boolean addReview(Pair<String, Integer> review) {
        arrayList.add(review);
        return true;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getMovies() {
        return Movies;
    }

    public ArrayList getReviews() {
        return arrayList;
    }
}
