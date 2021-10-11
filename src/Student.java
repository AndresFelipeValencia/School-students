import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    int grade;
    ArrayList<EnumSubject> subjects;

    public Student(String name, int grade, ArrayList<EnumSubject> subjects) {
        this.name = name;
        this.grade = grade;
        this.subjects = subjects;

    }


    public void printStudent(int i)
    {
        System.out.println(i+1+". Student's name "+this.name +" "+"grade you are entering is " +
            " " + " " +this.grade +" "+"your registered subjects are ");

        for (EnumSubject subjectString : subjects){
            System.out.println(subjectString);
        }

    }


}







//    public boolean isGrade(){
//        if (grade.contains("grade")){
//            return true;
//        }
//        return grade.contains("Grade");
//    }
//
//    public boolean isSubject(){
//        if (subject.contains("mathematics")){
//            return true;
//        }
//        return subject.contains("Mathematics");
//    }