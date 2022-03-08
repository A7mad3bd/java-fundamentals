package inheritance;
import java.util.ArrayList;

public class Theater implements Places {

    private final String name;
    ArrayList reviews = new ArrayList<>();
    ArrayList<String> Movies;

    public Theater(String name, ArrayList<String> movies) {
        this.name = name;
        this.Movies=movies;
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
                ", reviews=" + reviews +
                ", Movies=" + Movies +
                '}';
    }

    public boolean addReview(Review review) {
        reviews.add(review);
        return true;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getMovies() {
        return Movies;
    }

    public ArrayList getReviews() {
        return reviews;
    }
}
