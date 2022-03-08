
package inheritance;

import java.util.ArrayList;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public static void main(String[] args) {
        System.out.println();

        Review rev =new Review("very good",4,"Ahmad");
        Review rev1 =new Review("good",3,"Mohamad");
        double stars=(rev.geStars()+ rev1.geStars())/2;
        Restaurant res =new Restaurant("Habibah",stars,10000 );
        System.out.println(res);




        System.out.println("////////////////////////////////////////");
        System.out.println();





        Shop Zara = new Shop("Zara", "Clothes", 10);
        Review revshop = new Review("very good", 4, "Ahmad");
        Zara.addReview(revshop);
        System.out.println(Zara.getReviews());
        System.out.println(Zara);



        System.out.println("////////////////////////////////////////");
        System.out.println();




        ArrayList<String> lis = new ArrayList<>();
        lis.add("The Fly");
        Theater theater = new Theater("Taj", lis);
        theater.addMovie("Shawshank");
        theater.addMovie("oliver");
        theater.removeMovie("oliver");

        Review revtheater = new Review("good", 3, "Ahmad");
        theater.addReview(revtheater);
        System.out.println(theater.getMovies());
        System.out.println(theater.getReviews());
        System.out.println(theater);



    }
}
