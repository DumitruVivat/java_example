package main.lesson3;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {

        List<ArrayList<String>> movies = new ArrayList<>();
        movies.add(new ArrayList<>(List.of("Action","Hitman","The ultimate tournament","Dragon Fist")));
        movies.add(new ArrayList<>(List.of("Fantasy","Lord of the rings","Harry Potter","Warcraft")));

        System.out.printf("%-15s %-50s\n","Genre","Movies");
        System.out.println("------------------------------------------------------------");

        for (ArrayList<String> movie : movies) {
            String genre = movie.get(0);
            for(int i = 1; i < movie.size(); i++) {
                String movieName = movie.get(i);
                if (i == 1) {
                    System.out.printf("%-15s %-50s\n",genre,movieName);
                } else {
                    System.out.printf("%-15s %-50s\n","",movieName);
                }
            }
        }
    }
}
