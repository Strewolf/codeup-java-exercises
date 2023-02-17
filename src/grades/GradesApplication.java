package grades;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, String> Students = new HashMap<>();
        Students.put("lilKim"," name: Kim - GitHub Username: lilKim Average: 78.33\n");
        Students.put("MasterP"," name: Peter - GitHub Username: MasterP Average: 60.00\n");
        Students.put("lilKeed"," name: Keith - GitHub Username: MasterP Average: 76.67\n");
        Students.put("iceJJfish"," name: Jason - GitHub Username: iceJJfish Average: 30.67\n");
        Student lilKim = new Student("lilKim");
        Student MasterP = new Student("MasterP");
        Student lilKeed = new Student("lilKeed");
        Student iceJJfish = new Student("iceJJfish");
        lilKim.addGrade(80);
        lilKim.addGrade(90);
        lilKim.addGrade(65);

        MasterP.addGrade(40);
        MasterP.addGrade(60);
        MasterP.addGrade(80);

        lilKeed.addGrade(87);
        lilKeed.addGrade(65);
        lilKeed.addGrade(78);

        iceJJfish.addGrade(40);
        iceJJfish.addGrade(30);
        iceJJfish.addGrade(22);

        System.out.println("Welcome!\n\nHere are the GitHub usernames of our students:\n");
        System.out.println(Students.keySet());
        System.out.println("\nWhat student would you like to see more information on?");

        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;
        do {
            String input = scanner.next();
            if (Students.containsKey(input)) {
                String values = Students.get(input);
                System.out.println(values);
                System.out.println("Would you like to see another student?");
                input = scanner.next();
            } else {
                System.out.println("Sorry, no student found with the GitHub username of" + input);
                input = scanner.next();
            }
            if (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y")) {
                System.out.println("What student would you like to see more information on?");
            } else {
                System.out.println("Goodbye, and have a wonderful day!");
                continueLoop = false;
            }
        }while (continueLoop);



//        List<String> keys = new ArrayList<>(Students.keySet());
//        System.out.println("Keys: " + keys);

//        String averagelilKim = String.format("%.2f", lilKim.getGradeAverage());
//        System.out.println(lilKim.getName() + "'s average grade: " + averagelilKim);
//        String averageMasterP = String.format("%.2f", MasterP.getGradeAverage());
//        System.out.println(MasterP.getName() + "'s average grade: " + averageMasterP);
//        String averagelilKeed = String.format("%.2f", lilKeed.getGradeAverage());
//        System.out.println(lilKeed.getName() + "'s average grade: " + averagelilKeed);
//        String averageiceJJfish = String.format("%.2f", iceJJfish.getGradeAverage());
//        System.out.println(iceJJfish.getName() + "'s average grade: " + averageiceJJfish);
    }
    }
