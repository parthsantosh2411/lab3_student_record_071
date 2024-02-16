import java.util.ArrayList;
import java.util.Scanner;
public class StudentFunctions {

    ArrayList<Student> studentDatabase = new ArrayList<>(); // array list
    Scanner sc = new Scanner(System.in);

    public void addStudent() { // to add students
        System.out.println("Enter Number of students: ");
        int noOfStu = sc.nextInt();
        for (int i = 0; i < noOfStu; i++) {
            System.out.println("Enter details for student "+(i+1)+" : ");
            System.out.println("Enter prn: ");
            int p = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Name: ");
            String n = sc.nextLine();

            System.out.println("Enter DOB(dd/MM/yyyy): ");
            String db = sc.nextLine();

            System.out.println("Enter marks: ");
            double m = sc.nextDouble();

            Student s = new Student(p, n, db, m);
            studentDatabase.add(s);
        }
    }

    public void printStudentDetails() { // to print all students
        System.out.println("Student Details:");
        for (Student student : studentDatabase) {
            System.out.println(student);
        }
    }

    public void searchStu() { // to search students
        System.out.println("Enter Search Choice: ");
        System.out.println("1. Search By PRN");
        System.out.println("2. Search By Name");
        System.out.println("3. Search By DOB");
        System.out.println("4. Search By Marks");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        switch (choice) { // using switch case to implement search by choice
            case 1:
                System.out.println("Enter PRN to search: ");
                int prn = sc.nextInt();
                sc.nextLine(); // consume newline
                for (Student student : studentDatabase) {
                    if (student.getPrn() == prn) {
                        System.out.println("Student Found:");
                        System.out.println(student);
                        return;
                    }
                }
                System.out.println("Student with PRN " + prn + " not found.");
                break;

            case 2:
                System.out.println("Enter Name to search: ");
                String name = sc.nextLine();
                boolean found = false;
                for (Student student : studentDatabase) {
                    if (student.getName().equals(name)) {
                        System.out.println("Student Found:");
                        System.out.println(student);
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("Student with Name " + name + " not found.");
                }
                break;

            case 3:
                System.out.println("Enter DOB to search (dd/MM/yyyy): ");
                String dob = sc.nextLine();
                found = false;
                for (Student student : studentDatabase) {
                    if (student.getDob().equals(dob)) {
                        System.out.println("Student Found:");
                        System.out.println(student);
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("Student with DOB " + dob + " not found.");
                }
                break;

            case 4:
                System.out.println("Enter Marks to search: ");
                double marks = sc.nextDouble();
                for (Student student : studentDatabase) {
                    if (student.getMarks() == marks) {
                        System.out.println("Student Found:");
                        System.out.println(student);
                        return;
                    }
                }
                System.out.println("Student with Marks " + marks + " not found.");
                break;

            default:
                System.out.println("Invalid choice.");
        }
    }
    public void updateOrDelete() { // to update, edit or delete the student information
        System.out.println("Do you want to:");
        System.out.println("1. Add Student");
        System.out.println("2. Edit Student");
        System.out.println("3. Delete Student");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        switch (choice) {
            case 1:
                addStudent();
                break;
            case 2:
                editStudent();
                break;
            case 3:
                deleteStudent();
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    public void editStudent() { // to edit student details
        System.out.println("Enter PRN of student to edit: ");
        int prn = sc.nextInt();
        sc.nextLine(); // consume newline

        boolean found = false;
        for (Student student : studentDatabase) {
            if (student.getPrn() == prn) {
                System.out.println("Enter updated Name: ");
                String name = sc.nextLine();
                student.setName(name);

                System.out.println("Enter updated DOB(dd/MM/yyyy): ");
                String dob = sc.nextLine();
                student.setDob(dob);

                System.out.println("Enter updated marks: ");
                double marks = sc.nextDouble();
                student.setMarks(marks);

                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with PRN " + prn + " not found.");
        } else {
            System.out.println("Student details updated successfully.");
        }
    }

    public void deleteStudent() { // to delete student details
        System.out.println("Enter PRN of student to delete: ");
        int prn = sc.nextInt();
        sc.nextLine(); // consume newline

        boolean removed = false;
        for (int i = 0; i < studentDatabase.size(); i++) {
            if (studentDatabase.get(i).getPrn() == prn) {
                studentDatabase.remove(i);
                removed = true;
                break;
            }
        }
        if (removed) {
            System.out.println("Student with PRN " + prn + " deleted successfully.");
        } else {
            System.out.println("Student with PRN " + prn + " not found.");
        }
    }
}
