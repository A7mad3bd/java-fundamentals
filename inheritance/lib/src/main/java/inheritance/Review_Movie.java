package inheritance;

import javafx.util.Pair;

public class Review_Movie {
    private String Movie = null;
    private int Rate = 0;
    Pair<String, Integer> pair = new Pair<String, Integer>(Movie, Rate);

    public Review_Movie(Pair<String, Integer> pair) {
        this.pair = pair;
    }

}



