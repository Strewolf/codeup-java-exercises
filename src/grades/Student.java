package grades;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student (String name){
        this.name = name;
        this.grades = new ArrayList<Integer>();
    }
    public String getName(){
        return this.name = name;
    }

    public void addGrade(int grade){
       grades.add(grade);
    }
    public double getGradeAverage(){
        if (grades.size() == 0) {
            return 0.0;
        }

        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }

        return (double) sum / grades.size();
    }
}
