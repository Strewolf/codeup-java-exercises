import java.util.Random;
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

    }

}
