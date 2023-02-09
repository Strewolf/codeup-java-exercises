import java.util.Scanner;

public class MethodsExercises {
public static int Addition(int number,int number2){
return  number + number2;
};

public static int Subtraction(int number, int number2){
return number - number2;
};

public static int Multiplication(int number, int number2) {
    if (number2 == 0) {
        return 0;
    };
    if (number2 > 0) {
        return number + Multiplication(number, number2 - 1);

    };
    return -Multiplication(number, -number2);
};

public static int Division(int number, int number2) {
    return number / number2;
};
    public static int Modulus(int number, int number2){
        return number % number2;
    }

    public static int getInteger(int input) {
        if (input < 2 || input > 9) {
            System.out.println("Number you entered is out of range");
            return input;
        } else{
            return input;
        }
    };


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = Addition(3,4);
        System.out.println(result);

        int subtract = Subtraction(8,4);
        System.out.println(subtract);

        int multiply = Multiplication(2,-2);
        System.out.println(multiply);

        int divide = Division(8,2);
        System.out.println(divide);

        int mod = Modulus(4,4);
        System.out.println(mod);
        int results;


       do {
           System.out.print("Enter a number between 1 and 10: ");
           int userInput = scanner.nextInt();
             results = getInteger(userInput);
            System.out.println(results);
        }while (results < 2 || results > 9);

    }

}






