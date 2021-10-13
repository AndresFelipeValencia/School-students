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
        System.out.println(i + 1 + ". Student's name " + this.name + " " + "grade you are entering is " +
                "" +  " " + "your registered subjects are ");

        for (EnumGrade gradeString : grade){
            System.out.println(gradeString);
        }

        for (EnumSubject subjectString : subjects) {
            System.out.println(subjectString);
        }


    }


//    public boolean isGrade() {
//        if (grade.contains(6)) {
//            return true;
//        }
//        return grade.contains(7);
//    }
//
//    public boolean isSubject() {
//        if (subject.contains("mathematics")) {
//            return true;
//        }
//        return subject.contains("Mathematics");
//    }

}