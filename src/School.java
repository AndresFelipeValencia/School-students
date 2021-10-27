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
                if (menuInput == 3){
                    showOptionThree();
                }

            }while(true);
        }

    private static int showMainMenu() {
            int menuInput;
                do {
                    Scanner input = new Scanner(System.in);
                    System.out.println("\nRegistration of students, subjects and course.");
                    System.out.println("Select an option to perform");
                    System.out.println("\n1 - Student registration");
                    System.out.println("2 - Consult students by subject");
                    System.out.println("3 - All students");
                    menuInput = input.nextInt();
                } while (menuInput < 1 || menuInput > 3);
                return menuInput;
        }
        private static void showOptionOne() {
            Scanner input = new Scanner(System.in);

            System.out.println("\nStudent's name " + (students.size() + 1) + ": ");
            String name = input.nextLine();

            System.out.println("\nGrade of 6to to 11nce : "  );
            for (int i = 0; i < EnumGrade.values().length; i++){
                System.out.println(i + 1 + "." + " " +EnumGrade.values()[i]);
            }

            System.out.println("\nSelect the grade to enter");
            int grade = input.nextInt();

            ArrayList<EnumGrade> gradeSelect = new ArrayList<>();
            gradeSelect.add(EnumGrade.values()[grade - 1]);

            System.out.println("\nSelect subjects, minimum 1 maximum 3.");
            for (int i = 0; i < EnumSubject.values().length; i++){
                System.out.println(i + 1 + "." + " " +EnumSubject.values()[i]);
            }

            System.out.println("\nType the number of the subject you want to register");
            int reading = input.nextInt();

            ArrayList<EnumSubject> subjectSelect = new ArrayList<>();
            subjectSelect.add(EnumSubject.values()[reading - 1]);

            int resp1;
            Scanner input1 = new Scanner(System.in);
                do {
                    System.out.println("\nWould you like to add another subject");
                    System.out.println("1 - Yes");
                    System.out.println("2 - No");
                    resp1 = input1.nextInt();
                }while (resp1<1||resp1>2);

                if (resp1 == 1) {
                    do {
                        System.out.println("\nThe subjects available are: ");
                        for (int i = 0; i < EnumSubject.values().length; i++) {
                            System.out.println(i + 1 + "." + " " + EnumSubject.values()[i]);
                        }
                        System.out.println("\nSelect asignature 1");
                        int option = input.nextInt();
                        subjectSelect.add(EnumSubject.values()[option - 1]);

                        do {
                            System.out.println("\nWould you like to add another subject ");
                            System.out.println("1 - Yes");
                            System.out.println("2 - No");
                            resp1 = input1.nextInt();
                        }while (resp1<1||resp1>2);
                    }while (resp1 == 1);
                }

                students.add(new Student(name, gradeSelect, new ArrayList<>(subjectSelect)));
                System.out.println("\nThe registered student is: \n");
                for (Student student : students) {
                    student.printStudent(students.indexOf(student));
                }
        }
    private static void showOptionTwo() {
        int numConsult;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("\nSelect an option");
            System.out.println("1 - Mathematics");
            System.out.println("2 - Spanish");
            System.out.println("3 - Science");
            numConsult = input.nextInt();
        }while (numConsult <1 || numConsult >3);

        for (int i = 0; i < students.size(); i++){
            if (numConsult == 1){
                if (students.get(i).isMathematics()){
                    students.get(i).printStudent(i);
                }
            }
        }
        for (int i = 0; i < students.size(); i++){
            if (numConsult == 2){
                if (students.get(i).isSpanish()){
                    students.get(i).printStudent(i);
                }
            }
        }
        for (int i = 0; i < students.size(); i++){
            if (numConsult == 3){
                if (students.get(i).isScience()){
                    students.get(i).printStudent(i);
                }
            }
        }
    }
    private static void showOptionThree() {
        System.out.println("\nAll students are: \n");
        for (Student student : students) {
            student.printStudent(students.indexOf(student));
        }
    }

}




