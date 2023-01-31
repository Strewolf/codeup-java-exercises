import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What number would you like to go up to?");
        int number = scanner.nextInt();

        System.out.println("Here is your table!");
        System.out.println("number | squared | Cubed");
        System.out.println("------ | ------- | -----");

        for (int i = 1; i <= number; i++) {
            if (i == number + 1) {
                break;
            }
            System.out.println(i + "      | " + (int)Math.pow(i, 2)+ "       | " + (int)Math.pow(i, 3) );
        }

//        int squared = number;
//        for (int i = 1; i <= number; i *= ) {
//            if (i == number + 1) {
//                break;
//            }
//            System.out.println(i);
//        }
    }}
