import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        String userInput = "y";

        while (userInput.equalsIgnoreCase("y")) {
        System.out.println("Please enter your numerical grade ranging from 0 to 100:");
        int grade = scanner.nextInt();
        if(grade >= 88 && grade <= 100){
            System.out.println(" Your letter grade is : A");
        }
         else if (grade >= 80 && grade <= 87) {
            System.out.println(" Your letter grade is : B");
        }
        else if (grade >= 67 && grade <= 79) {
            System.out.println(" Your letter grade is : C");
        }
        else if (grade >= 60 && grade <= 66) {
            System.out.println(" Your letter grade is : D");
        }
        else if (grade >= 0 && grade <= 59) {
            System.out.println(" Your letter grade is : F");
        }

            System.out.println("Would you like to continue? [y/n]: ");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("n")) {
                System.out.println("Thank you for using smith grading services");
                break;
            }

    }}}
