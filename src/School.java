import com.sun.org.apache.xerces.internal.xs.StringList;

import javax.security.auth.Subject;
import java.util.ArrayList;
import java.util.Arrays;
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
//                if (menuInput == 2){
////                  showOptionTwo();
//                }

            }while(true);
        }

        private static int showMainMenu() {
            int menuInput;
                do {
                    Scanner input = new Scanner(System.in);
                    System.out.println("\nRegistration of students, subjects and course.");
                    System.out.println("Select an option to perform");
                    System.out.println("\n1 - Student registration");
                    System.out.println("2 - Consult students");
                    System.out.println("3 - All students");
                    menuInput = input.nextInt();
                } while (menuInput < 1 || menuInput > 3);
                return menuInput;
        }
        private static void showOptionOne() {
            Scanner input = new Scanner(System.in);
            System.out.println("\nStudent's name " + (students.size() + 1) + ": ");
            String name1 = input.nextLine();


            System.out.println("\nGrade of 6to to 11nce " + (students.size() + 1) + ": ");
            for (int i = 0; i < EnumGrade.values().length; i++){
                System.out.println(i + 1 + "." + " " +EnumGrade.values()[i]);
            }

            System.out.println("\nSelect the grade to enter");
            int grade1 = input.nextInt();

            ArrayList<EnumGrade> gradeSelect = new ArrayList<>();
            gradeSelect.add(EnumGrade.values()[grade1 - 1]);

            System.out.println("\nSelect subjects, minimum 1 maximum 3.");
            for (int i = 0; i < EnumSubject.values().length; i++){
                System.out.println(i + 1 + "." + " " +EnumSubject.values()[i]);
            }

            System.out.println("\nType the number you want to select");
            int reading = input.nextInt();

            ArrayList<EnumSubject> subjectSelect = new ArrayList<>();
            subjectSelect.add(EnumSubject.values()[reading - 1]);

            students.add(new Student(name1, gradeSelect, subjectSelect));

            System.out.println("\nThe registered student is: \n");
                for (Student student : students) {
                     student.printStudent(students.indexOf(student));
                }

//            System.out.println("\nDesea seleccionar otra materia");

//            for (int i = 0; i < EnumSubject.values().length; i++){
//                System.out.println(i + 1 + "." + " " +EnumSubject.values()[i]);
//            }

        }


}


//    private static void showOptionTwo() {
//        int menuConsult;
//        do {
//            Scanner input = new Scanner(System.in);
//            System.out.println("\nSelect an option");
//            System.out.println("1 - Query by grade");
//            System.out.println("2 - Query by subject");
//            menuConsult = input.nextInt();
//        }while (menuConsult < 1 || menuConsult > 2);
//        for (int i=0; i < students.size(); i++){
//            if (menuConsult == 1){
//                if(students.get(i).isGrade()){
//                    students.get(i).printStudent(i);
//                }
//
//            }if (menuConsult == 2){
//                if (students.get(i).isSubject()){
//                    students.get(i).printStudent(i);
//                }
//
//            }
//        }
//    }


//                for (EnumSubject subjectString : EnumSubject.values()){
//                System.out.println(subjectString);
//                } // For para buscar elementos en el enum y imprimir

