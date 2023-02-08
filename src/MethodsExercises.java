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


    public static void main(String[] args) {
        int result = Addition(3,4);
        System.out.println(result);

        int subtract = Subtraction(8,4);
        System.out.println(subtract);

        int multiply = Multiplication(2,2);
        System.out.println(multiply);

        int divide = Division(8,2);
        System.out.println(divide);

        int mod = Modulus(4,4);
        System.out.println(mod);
    }

}






