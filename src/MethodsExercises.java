public class MethodsExercises {
public static int Addition(int number,int number2){
return  number + number2;
};

public static int Subtraction(int number, int number2){
return number - number2;
};

public static int Multiplication(int number, int number2){
return number * number2;
};

public static int Division(int number, int number2){
    return number / number2;
};
    public static void main(String[] args) {
        int result = Addition(3,4);
        System.out.println(result);

        int subtract = Subtraction(8,4);
        System.out.println(subtract);

        int multiply = Multiplication(2,2);
        System.out.println(multiply);
        int divide = Division(8,4);
        System.out.println(divide);
    }

}






