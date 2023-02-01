import java.util.Scanner;
public class Bob {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        String reply = "bye";

        System.out.println("Talk to Bob the lazy teenager\n");
        String input = scanner.next();

        while (reply.equalsIgnoreCase("bye")) {

            if (input.endsWith("?")) {
                System.out.println("Sure.\n");
            } else if (input.endsWith("!\n")) {
                System.out.println("Whoa, chill out!\n");
            } else if (input.isEmpty()) {
                System.out.println("Fine. Be that way!\n");
            } else {
                System.out.println("Whatever.\n");
            }

            System.out.println("Say bye to end conversation");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("bye")) {
                break;
            }
        }
    }
}
