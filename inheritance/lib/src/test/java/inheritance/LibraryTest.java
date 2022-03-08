/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }


    @Test void Restorant_constructer(){
        Restaurant r1=new Restaurant("snack",5,100);
        assertEquals(100,r1.getPrice());
        assertEquals("snack",r1.getName());
        assertEquals(5,r1.geStars());
    }

    @Test void Review_constructer(){
        Review rv =new Review("very good",4,"Ahmad");
        assertEquals("very good",rv.getBody());
        assertEquals("Ahmad",rv.getauthor());
        assertEquals(4,rv.geStars());
    }
    @Test void Shop_constructer(){
        Shop sp=new Shop("Zara","Clothes",100);
        assertEquals("Zara",sp.getName());
        assertEquals("Clothes",sp.getDescription());
        assertEquals(100,sp.getNumdol());
    }
    @Test void Theater_constructer(){
        ArrayList<String> lis = new ArrayList<>();
        lis.add("The Fly");
        Theater th =new Theater("roman",lis);
        assertEquals("roman",th.getName());
        assertEquals(lis,th.getMovies());
    }


    @Test void To_string_Restorant(){
        Restaurant r1=new Restaurant("snack",5,100);
        assertEquals(100,r1.getPrice());
        assertEquals("snack",r1.getName());
        assertEquals(5,r1.geStars());
        System.out.println(r1);
        assertEquals("Restaurant "+r1.getName()+" has "+r1.geStars()+" stars and the price of it is "+r1.getPrice()+" and has "+Review.count+" reviews  ",r1.toString());
   }
    @Test void To_string_Review(){
        Review rv =new Review("very good",4,"Ahmad");
        System.out.println(rv);
        assertEquals("My Review is "+rv.getBody()+" and my stars "+(rv.geStars())+" by "+rv.getauthor() ,rv.toString());
    }
    @Test void To_string_Shop(){
        Shop Zara = new Shop("Zara", "Clothes", 10);
        System.out.println(Zara);
        assertEquals("Shop{name='Zara', description='Clothes', numdol=10.0}",Zara.toString());
    }
    @Test void To_string_theater(){
        ArrayList<String> lis = new ArrayList<>();
        lis.add("The Fly");
        Theater theater = new Theater("Taj", lis);
        System.out.println(theater);
        assertEquals("Theater{name='Taj', reviews=[], Movies=[The Fly]}",theater.toString());
    }



    @Test void Test_add_Review(){
        Review rev =new Review("very good",4,"Ahmad");
        Review rev1 =new Review("good",3,"Mohamad");
        double stars=(rev.geStars()+ rev1.geStars())/2;
        Restaurant res =new Restaurant("Habibah",stars,10000 );
        System.out.println(res.addReview(rev1));
        assertTrue(res.addReview(rev1));
    }


}

