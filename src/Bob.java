import java.util.Scanner;
public class Bob {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        String reply = "bye";
        System.out.println("Talk to Bob the lazy teenager");
        while (reply.equalsIgnoreCase("bye")) {

            String input = scanner.next();
            if (input.endsWith("?")) {
                System.out.println("Sure.");
            } else if (input.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (input.isEmpty()) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever.%n");
            }

            System.out.println("Say bye to end conversation");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("bye")) {
                break;
            }
        }
    }
}
