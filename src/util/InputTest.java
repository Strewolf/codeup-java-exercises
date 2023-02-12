package util;
import java.util.Scanner;
public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
        String str = input.getString();
        System.out.println("this is a string " + str);
        int in = input.getInt(10, 20);
        System.out.println("this is a integer within range " + in);
        int integer = input.getInt();
        System.out.println("this is an integer with no limits " + integer);
        double dbl = input.getDouble(.5, 10.2);
        System.out.println("this is a double within range " + dbl);
        double dbl2 = input.getDouble();
        System.out.println("this is double no limits " + dbl2);
        boolean bln = input.yesNo();
        System.out.println("this is a boolean " + bln);
    }
}

