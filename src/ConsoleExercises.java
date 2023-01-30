import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args){
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f%n",pi);
        Scanner scanner = new Scanner(System.in);

        System.out.print("please enter 3 words: ");
        String userInput = scanner.next(), userInput1  = scanner.next(), userInput2 = scanner.next();



        System.out.println("You entered: --> \""+ userInput + "\" <--");
        System.out.println("You entered: --> \""+ userInput1 + "\" <--");
        System.out.println("You entered: --> \""+ userInput2 + "\" <--");



    }
}
