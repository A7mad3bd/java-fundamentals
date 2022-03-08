package inheritance;

import java.util.ArrayList;

public class Restaurant implements Places{

    ArrayList reviews = new ArrayList<>();
    private final String name;
    private double num_stars;
    private final double price;

    public Restaurant(String name, double num_stars, double price) {
        this.name = name;
        this.num_stars = num_stars;
        this.price = price;
    }

    public String toString() {
        return "Restaurant " +
                this.name +
                " has " + this.num_stars + " stars" +
                " and the price of it is " + this.price +
                " and has " + Review.count + " reviews  ";
    }

    public boolean addReview(Review review) {
        reviews.add(review);
        return true;
    }


    public String getName() {
        return this.name;
    }

    public double geStars() {
        return this.num_stars;
    }

    public void SetStars() {
        this.num_stars = num_stars;
    }

    public double getPrice() {
        return this.price;
    }

    public ArrayList getReviews() {
        return reviews;
    }

    public double getNum_stars() {
        return num_stars;
    }
}
