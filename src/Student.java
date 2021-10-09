import com.sun.org.apache.xerces.internal.impl.xs.util.StringListImpl;
import com.sun.org.apache.xerces.internal.xs.StringList;

public class Student {
    String name;
    String grade;
    String subject;

    public Student(String name, String grade, String subject){
        this.name = name;
        this.grade = grade;
        this.subject = subject;
    }

    public void printStudent(int i){System.out.println(i+1+". Student's name "+this.name +" "+"grade you are entering is "+this.grade +" "+"your registered subjects are "+this.subject);}
    public void printGrade(int i){System.out.println(i+1+". Student's name "+this.name +" "+"grade you are entering is "+this.grade);}
    public void printSubject(int i){System.out.println(i+1+". Student's name "+this.name +" "+"your registered subjects are "+this.subject);}

    public boolean isGrade(){
        if (grade.contains("sixth")){
            return true;
        }
        return grade.contains("Sixth");
    }
    public boolean isGrade7(){
        if (grade.contains("seventh")){
            return true;
        }
        return grade.contains("Seventh");
    }
    public boolean isGrade8(){
        if (grade.contains("eighth")){
            return true;
        }
        return grade.contains("Eighth");
    }
    public boolean isGrade9(){
        if (grade.contains("ninth")){
            return true;
        }
        return grade.contains("Ninth");
    }
    public boolean isGrade10(){
        if(grade.contains("tenth")){
            return true;
        }
        return grade.contains("Tenth");
    }
    public boolean isGrade11(){
        if (grade.contains("eleven")){
            return true;
        }
        return grade.contains("Eleven");
    }
    public boolean isSubject(){
        if (subject.contains("mathematics")){
            return true;
        }
        return subject.contains("Mathematics");
    }
    public boolean isSubject1(){
        if (subject.contains("spanish")){
            return true;
        }
        return subject.contains("Spanish");
    }
    public boolean isSubject2(){
        if (subject.contains("science")){
            return true;
        }
        return subject.contains("Science");
    }

}
