package grades;

import java.util.HashMap;

public class GradesApplication {
    public static void StudentsHash(){
        HashMap<String, String> Students = new HashMap<>();
        Students.put(" | lilKim | "," name: Kim - GitHub Username: lilKim Average: 87.4\n");
        Students.put(" | MasterP | "," name: Peter - GitHub Username: MasterP Average: 90.4\n");
        Students.put(" | lilKeed | "," name: Keith - GitHub Username: MasterP Average: 60.8\n");
        Students.put(" | iceJJfish | "," name: Jason - GitHub Username: iceJJfish Average: 78.9\n");
        System.out.println(Students);
    }

}