import com.sun.org.apache.xerces.internal.xs.StringList;

import javax.security.auth.Subject;
import java.util.ArrayList;
import java.util.Scanner;

public class School {

    static ArrayList<Student> students = new ArrayList<>();


    public static void main(String[] args) {schoolArray();}
    public static void schoolArray() {

        //noinspection InfiniteLoopStatement
        do{
            int menuInput = showMainMenu();
            if (menuInput == 1) {
                showOptionOne();
            }
            if (menuInput == 2){
                showOptionTwo();
            }

        }while(true);
    }

    private static int showMainMenu() {
        int menuInput;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("\nRegistration of students, subjects and course");
            System.out.println("Select an option to perform");
            System.out.println("\n1 -> Student registration");
            System.out.println("2 -> Consult students");
            System.out.println("3 -> All students");
            menuInput = input.nextInt();
        } while (menuInput < 1 || menuInput > 3);
        return menuInput;
    }
    private static void showOptionOne() {
        Scanner inputStudent = new Scanner(System.in);
        System.out.println("\nStudent's name " + (students.size() + 1) + ": ");
        String studentName = inputStudent.nextLine();

        System.out.println("Grade to which the student enters " + (students.size() + 1) + ": ");
        ArrayList<String> grade = new ArrayList<>();
        grade.add("Sixth");
        grade.add("Seventh");
        grade.add("Eighth");
        grade.add("Ninth");
        grade.add("Tenth");
        grade.add("Eleven");
        System.out.println(grade);
        String studentGrade = inputStudent.nextLine();

        System.out.println("Subjects to be registered, minimum one to maximum three " + (students.size() + 1) + ": ");

        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("Mathematics\n");
        subjects.add("Spanish\n");
        subjects.add("Science\n");
        System.out.println(subjects);
        String studentSubjects = inputStudent.nextLine();

        students.add(new Student(studentName, studentGrade, studentSubjects));

        System.out.println("\nStudent registration is: \n");
        for (Student student : students) {
            student.printStudent(students.indexOf(student));
        }
    }
    private static void showOptionTwo() {
        int menuConsult;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("\nSelect an option");
            System.out.println("1 - Query by grade");
            System.out.println("2 - Query by subject");
            menuConsult = input.nextInt();
        }while (menuConsult < 1 || menuConsult > 2);
        for (int i=0; i < students.size(); i++){
            if (menuConsult == 1){
                if(students.get(i).isGrade()){
                    students.get(i).printGrade(i);
                }
                if (students.get(i).isGrade7()){
                  students.get(i).printGrade(i);
                }
                if (students.get(i).isGrade8()){
                    students.get(i).printGrade(i);
                }
                if (students.get(i).isGrade9()){
                    students.get(i).printGrade(i);
                }
                if (students.get(i).isGrade10()){
                    students.get(i).printGrade(i);
                }
                if (students.get(i).isGrade11()){
                    students.get(i).printGrade(i);
                }
            }if (menuConsult == 2){
                if (students.get(i).isSubject()){
                    students.get(i).printSubject(i);
                }
                if (students.get(i).isSubject1()){
                    students.get(i).printSubject(i);
                }
                if (students.get(i).isSubject2()){
                    students.get(i).printSubject(i);
                }
            }
        }
    }


}