

public class Student {
    String nameStudent;
    String gradeEnter;
    String matterRecorded;

    public Student(String nameStudent, String gradeEnter, String matterRecorded){
        this.nameStudent = nameStudent;
        this.gradeEnter = gradeEnter;
        this.matterRecorded = matterRecorded;
    }

    public void printSchoolStudent(int i){System.out.println(i+1+". Student's name "+this.nameStudent +" "+"grade you are entering is "+this.gradeEnter +" "+"your registered subjects are "+this.matterRecorded);}
}
