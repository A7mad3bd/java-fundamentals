package inheritance;

import java.util.ArrayList;

public class Shop implements Places {
    private final String name;
    private final String description;
    private final double numdol;
    ArrayList reviews = new ArrayList<>();
    public Shop(String name, String description, double numdol)
    {
        this.name=name;
        this.description=description;
        this.numdol=numdol;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", numdol=" + numdol +
                '}';
    }

    public double getNumdol() {
        return numdol;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public boolean addReview(Review review) {
        reviews.add(review);
        return true;
    }

    public ArrayList getReviews() {
        return reviews;
    }
}
