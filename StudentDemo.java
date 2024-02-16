import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentFunctions stufuncs = new StudentFunctions();

        // Initial operation
        stufuncs.addStudent();

        // Menu
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Display all students");
            System.out.println("2. Search Student");
            System.out.println("3. Update, Edit, or Delete Student info");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    stufuncs.printStudentDetails();
                    break;
                case 2:
                    stufuncs.searchStu();
                    break;
                case 3:
                    stufuncs.updateOrDelete();
                    stufuncs.printStudentDetails();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return; // Exit the program
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
