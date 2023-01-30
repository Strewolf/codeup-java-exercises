import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args){

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




