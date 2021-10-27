import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    ArrayList<EnumGrade> grade;
    ArrayList<EnumSubject> subjects;

    public Student(String name, ArrayList<EnumGrade> grade, ArrayList<EnumSubject> subjects) {
        this.name = name;
        this.grade = grade;
        this.subjects = subjects;

    }

    public void printStudent(int i) {
        System.out.println(i + 1 + ". Student's name: " + this.name );

        for (EnumGrade gradeString : grade){
            System.out.println(" -> Grade you are entering is: " + gradeString);
        }

        for (EnumSubject subjectString : subjects) {
            System.out.println(" -> Your registered subjects are: " + subjectString);
        }
        System.out.println(" ");
    }

    public boolean isMathematics(){
        if(subjects.contains(EnumSubject.MATHEMATICS)) {
            return true;
        }
        return subjects.contains(EnumSubject.MATHEMATICS);
    }

    public boolean isSpanish(){
        if(subjects.contains(EnumSubject.SPANISH)) {
            return true;
        }
        return subjects.contains(EnumSubject.SPANISH);
    }

    public boolean isScience(){
        if(subjects.contains(EnumSubject.SCIENCE)) {
            return true;
        }
        return subjects.contains(EnumSubject.SCIENCE);
    }


}