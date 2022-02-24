import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        int dogCount = 1;

        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");


        flipNHeads(2);


        //clock();


    }

    // Functions that return nothing have a return type of "void"
    public static String pluralize(String st, int count) {
        if (count <= 1) {

            return st;
        } else {
            st = st + "s";
            return st;
        }
    }

    public static String flipNHeads(int n) {
        int chead = 0;
        String s1=new String();
        boolean flag;
        String s2=new String();
        int count=0;
        while(chead!=n)
        {
            count++;

            double M=Math.random();

            if ( M < .5)
                flag=false;
            else
                flag=true;
            if(flag==false) {
                System.out.println("tails");
                chead = 0;
            }
            else {
                System.out.println("heads");

                chead++;
            }
            if(chead==n)
                System.out.println("It took " + count + " flips to flip " + n + " head in a row.");




        }
        return s1 ;

    }


    public static String clock()
    {
        for (int x=0;x<=1;) {
            LocalDateTime now = LocalDateTime.now();
            int hour = now.getHour();
            int minute = now.getMinute();
            int second = now.getSecond();
            String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            System.out.println(time);
        }
        return null;
    }
}
