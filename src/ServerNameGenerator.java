import java.util.Random;
import java.util.Scanner;

public class ServerNameGenerator {
    static String[] adjectives = {"Radiant","Majestic","Mysterious","Bold","Shy","Dangerous","Dirty","Active","Loving"};

    static String[] nouns =  {"Avocado","Potato","Pony","Brick","Egg","Donut","Salmon","Toaster","Macbook"};

    public static int randomInt(int min, int max){
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static String randomString (String[] stringArr) {
        int randomIndex = randomInt(0, stringArr.length);
        return stringArr[randomIndex];
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input;
        do{
            System.out.println("Enter y/yes to make a server name and n/no to exit");
            input=scanner.next();
            if (input.equalsIgnoreCase("yes")|| input.equalsIgnoreCase("y")){
                System.out.println("here is your server name:" + randomString(adjectives) + "-" + randomString(nouns));
            }

        }while (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y"));

    }

}
