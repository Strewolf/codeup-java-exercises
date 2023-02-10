
import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static int randoN() {
        Random random = new Random();
        return random.nextInt(100) + 1;

    }

    ;

    public static void main(String[] args) throws InterruptedException {
        String sentence = "Welcome to smitty's java guessing game!!!\n In this game you will guess a number between 1 and 100.\n You will have 10 guesses total, good luck!!!\n ";
        String[] words = sentence.split(" ");

        for (String word : words) {
            System.out.print(word + " ");
            Thread.sleep(300);
        }
        Scanner scanner = new Scanner(System.in);
        int guess = 10;
        int randomNumber = randoN();
        do {
            System.out.println("Please enter a number between 1 and 100");
            int response = scanner.nextInt();

            if (response == randomNumber) {
                System.out.println("Congratulations!! you guessed correctly the number is " + randomNumber);
                break;
            }
            if (response > randomNumber) {
                System.out.println("LOWER");
            }
            if (response < randomNumber) {
                System.out.println("Higher");
            }
            guess--;
        } while (guess != 0);

        if (guess == 0){
            System.out.println("Sorry you ran out of lives");
                };


    }
};