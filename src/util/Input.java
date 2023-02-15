package util;
import movies.MoviesApplication;

import java.util.Scanner;
public class Input {
    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }
    public String getString(){
        String input;
        do {
            System.out.println("enter a string");
            input = this.scanner.nextLine().toLowerCase();
        }while(input.isEmpty());

        return input;
    };
    public Boolean yesNo(){
        System.out.println("Enter y/yes or n/no");
        String input = this.scanner.next();
        return "y".equalsIgnoreCase(input) || "yes".equalsIgnoreCase(input);
    };
//    public int getInt(int min, int max){
//        int input;
//        do {
//            System.out.println("Enter a number between " + min + " and " + max);
//            input = this.scanner.nextInt();
//        }while(input < min+ 1 || input > max- 1);
//        return input;
//    }
    public int getInt(int min, int max){
        int input;
        do {
            MoviesApplication movie = new MoviesApplication();
            System.out.println("What would you like to do?\n\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the drama category\n" +
                "3 - view movies in the musical category\n" +
                "4 - view movies in the scifi category\n" +
                "5 - view movies in the horror category\n\n" +
                "Enter your choice:");
            input = this.scanner.nextInt();
        }while(input < min || input < max);
        return input;
    }

    public int getInt() {
        System.out.println("enter an integer");
        return this.scanner.nextInt();
    }

    public double getDouble(double min, double max){
        double input;
        do {
            System.out.println("Enter a number with decimal between " + min + " and " + max);
            input = this.scanner.nextDouble();
        }while(input < min+.1 || input > max-.1);
        return input;
    }
    public double getDouble(){
        System.out.println("enter a number with a decimal");
        return this.scanner.nextDouble();
    }


}
