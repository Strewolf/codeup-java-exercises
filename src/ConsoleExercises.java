import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args){
//        double pi = 3.14159;
//        System.out.format("The value of pi is approximately %.2f%n",pi);
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("please enter 3 Sentences: ");
//        String userInput = scanner.nextLine(), userInput1  = scanner.nextLine(), userInput2 = scanner.nextLine();
//
//
//
//        System.out.println("You entered: --> \""+ userInput + "\" <--");
//        System.out.println("You entered: --> \""+ userInput1 + "\" <--");
//        System.out.println("You entered: --> \""+ userInput2 + "\" <--");
//        import java.util.Scanner;
//

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the length of the classroom: ");
        int length = scanner.nextInt();

        System.out.print("Please enter the width of the classroom: ");
        int width = scanner.nextInt();

        System.out.print("Please enter the width of the classroom: ");
        int height = scanner.nextInt();

        int area = length * width;
        int perimeter = (length * 2) + (width * 2);
        int volume = length * width * height;

        System.out.println("The area of the classroom is: " + area);

        System.out.println("The perimeter of the classroom is: " + perimeter);

        System.out.println("The volume of the classroom is:" + volume);
    }
}




