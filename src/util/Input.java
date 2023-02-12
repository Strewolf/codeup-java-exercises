package util;
import java.util.Scanner;
public class Input {
    private Scanner scanner;

    public Input(){
        int min = 1;
        int max = 10;
        Double minn = 1.2;
        Double maxx = 10.5;
        this.scanner = new Scanner(System.in);

    }
    public String getString(){
        return this.scanner.nextLine();
    };
    public Boolean yesNo(){
        System.out.println(input.equals("yes") ? true : false);
        return this.scanner.nextBoolean();
    };
    public int getInt(int min, int max){
        return this.scanner.nextInt();
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

    public void inputTest(){
        System.out.println("Enter a string: ");
        String str = getString();
        System.out.println("You entered: " + str);

        System.out.println("Enter a boolean value (true or false): ");
        boolean bool = yesNo();
        System.out.println("You entered: " + bool);

        System.out.println("Enter an integer value between 1 and 10: ");
        int num1 = getInt(1, 10);
        System.out.println("You entered: " + num1);

        System.out.println("Enter an integer value: ");
        int num2 = getInt();
        System.out.println("You entered: " + num2);

        System.out.println("Enter a double value between 1.2 and 10.5: ");
        double dbl1 = getDouble(1.2, 10.5);
        System.out.println("You entered: " + dbl1);

        System.out.println("Enter a double value: ");
        double dbl2 = getDouble();
        System.out.println("You entered: " + dbl2);
    }
     public static void main(String[] args) {
        Input input = new Input();
        String str = input.getString();
         System.out.println("this is a string " + str);
         int in = input.getInt();
         System.out.println("this is a integer " + in);
         double dbl = input.getDouble();
         System.out.println("this is a double " + dbl);
         boolean bln = input.yesNo();
         System.out.println("this is a boolean " + bln);
         System.out.println(result);
         double dbll = input.getDouble() ? "enter": "good";



    }

}
