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
        String studentGrade = inputStudent.nextLine();

        System.out.println("Subjects to be registered " + (students.size() + 1) + ": ");
        String studentSubjects = inputStudent.nextLine();

        students.add(new Student(studentName, studentGrade, studentSubjects));

        System.out.println("\nStudent registration is: \n");
        for (Student student : students) {
            student.printSchoolStudent(students.indexOf(student));
        }
    }


}