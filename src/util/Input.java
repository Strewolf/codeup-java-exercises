package util;
import java.util.Scanner;
public class Input {
    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);

    }
    public String getString(){
        return this.scanner.nextLine();
    };
    public Boolean yesNo(){
        String input = this.scanner.nextLine().toLowerCase();
        return input.equals ("y") || input.equals("yes");
    };
    public int getInt(int min, int max){
        int input;
        do {
            System.out.println("Enter a number between " + min + " and " + max);
            input = this.scanner.nextInt();
        }while(input < min || input > max);
        return input;
    }

    public int getInt() {
        return this.scanner.nextInt();
    }

    public double getDouble(double min, double max){
        return this.scanner.nextDouble();
    }
    public double getDouble(){
        return this.scanner.nextDouble();
    }

    public class InputTest {
        public static void main (String[]args){
            Input input = new Input();
            String str = input.getString();
            System.out.println("this is a string " + str);
            int in = input.getInt(10, 20);
            System.out.println("this is a integer " + in);
            int integer = input.getInt();
            System.out.println();
            double dbl = input.getDouble(.5, 10.2);
            System.out.println("this is a double within range " + dbl);
            double dbl2 = input.getDouble();
            System.out.println("this is double no limits");
            boolean bln = input.yesNo();
            System.out.println("this is a boolean " + bln);
        }
    }
}
