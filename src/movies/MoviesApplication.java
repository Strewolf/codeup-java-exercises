package movies;
import util.Input;

import javax.swing.text.html.Option;
import java.text.BreakIterator;
import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication {
    public static void viewAllMovies() {
        // Get all movies and print them to the console
        Movie[] allMovies = MoviesArray.findAll();
        for (Movie movie : allMovies) {
            System.out.println(movie.getName() + " -- " + movie.getCategory());
        }
    }

    public static void viewMoviesByCategory(String category) {
        // Get movies in the specified category and print them to the console
        Movie[] movies = MoviesArray.findAll();
        for (Movie movie : movies) {
            if (movie.getCategory().equalsIgnoreCase(category)) {
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer userInput = 1;
        while (userInput.intValue() < -1 || userInput.intValue() < 5) {
            System.out.println("What would you like to do?\n\n" +
                    "0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category\n" +
                    "6 - view movies in the musical category\n" +
                    "7 - view movies in the comedy category\n\n" +
                    "Enter your choice:");
            int input = scanner.nextInt();
            if (input == 1) {
                viewAllMovies();
            }
            if (input == 2) {
                viewMoviesByCategory("animated");
            }
            if (input == 3) {
                viewMoviesByCategory("drama");
            }
            if (input == 4) {
                viewMoviesByCategory("horror");
            }
            if (input == 5) {
                viewMoviesByCategory("scifi");
            }
            if (input == 6) {
                viewMoviesByCategory("musical");
            }
            if (input == 7) {
                viewMoviesByCategory("comedy");
            }
            if (input == 0) {
                break;
            } if (input <0 || input > 7){
                System.out.println("sorry this number has no category in the database");
            }


        }
    }
}