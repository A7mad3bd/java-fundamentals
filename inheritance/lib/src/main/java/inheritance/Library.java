
package inheritance;

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
        System.out.println(res.toString());

          }
}
