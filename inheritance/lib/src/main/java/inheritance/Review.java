package inheritance;

public class Review {
    public static int count;
    public final String body;
    public final int num_stars;
    public final String author;

    public Review(String body, int num_stars, String author) {
        this.body = body;
        this.num_stars = num_stars;
        this.author = author;
        count++;
    }

    public String toString() {
        return "My Review" +
                " is " + this.body +
                " and my stars " + this.num_stars +
                " by " + this.author;
    }

    public String getBody() {
        return this.body;
    }
    public double geStars() {
        return this.num_stars;
    }
    public String getauthor() {
        return this.author;
    }


}
