/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;
/*
 * This Java source file was generated by the Gradle 'init' task.
 */
/*
1 pt for weather function and tests
1 pt for tallying function and tests
3 pts for linter application and associated tests to catch all errors
1 pts for README
 */

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class App {
    public static String weather(int[][] array) {
        HashSet<Integer> h_set = new HashSet<>();
        String final_anser = "";
        for (int[] row : array) {
            for (int el : row) {
                h_set.add(el);
            }
        }
        int min = array[0][0], max = array[0][0];
        for (int[] weeklyMonthTemperature : array) {
            for (int index : weeklyMonthTemperature) {
                if (index >= max) {
                    max = index;
                }
                if (index <= min) {
                    min = index;
                }
            }
        }
        final_anser += "Highest is " + max + "\n";
        final_anser += "Lowest is " + min + "\n\n";

        int i = min;
        while (i < max) {
            if (!h_set.contains(i))
                final_anser += "Never seen " + i + "\n";
            System.out.println();
            i++;
        }
        return final_anser;
    }

    public static String tally(List<String> votes) {

        HashSet<String> datas = new HashSet<>(votes);

        int numVotes = 0;
        String winner = "";

        for (String item : datas) {
            int count = Collections.frequency(votes, item);//most votes
            if (numVotes < count) {
                numVotes = count;
                winner = (item);
            } else if (numVotes == count) {
                winner = "Two gets same votes";
            }
        }
        return winner;
    }

    public static int FileReader(String Path) {
        int count = 0;
        int ans;

        ArrayList<Integer> errLines = new ArrayList<>();
        try {

            System.out.println("////////////////////////////////////////////////////");
            Scanner scanner = new Scanner(Path);
            int line_num = 0;
            while (scanner.hasNextLine()) {
                String next_line = scanner.nextLine();
                line_num++;
                boolean skips = next_line.equals("")
                        || next_line.contains("if")
                        || next_line.contains("else")
                        || next_line.endsWith("{")
                        || next_line.endsWith("}");

                if (!skips && !next_line.endsWith(";")) {
                    errLines.add(line_num);
                    System.out.println("line " + line_num + " missing semicolon");
                    count++;
                }
            }
            if(Path=="")
            ans=0;
            else
            ans=errLines.size();
            System.out.println("errors = " + errLines.size());
        } finally {
            System.out.println("program excuted");
        }
         return ans;
    }


    public static void main(String[] args) throws IOException {

        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };


        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        System.out.println(weather(weeklyMonthTemperatures));
        String winner = tally(votes);
        System.out.println(winner + " received the most votes!");
        System.out.println();

        Path path = Paths.get("C:\\Users\\Motas\\IdeaProjects\\java-fundamentals\\linter\\app\\src\\main\\resources\\ gates.js");
        FileReader(String.valueOf(path));
    }

}


