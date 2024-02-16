# Student Management System

This program is a Java-based Student Management System that allows users to perform various operations on a list of students, including adding, displaying, searching, updating, and deleting student records.

## Classes

### Student Class
The Student class represents a student with attributes such as PRN (Permanent Registration Number), name, date of birth, and marks. It includes constructors to initialize a student object with different sets of parameters, as well as getters, setters, and a toString() method for printing student details.

#### Definition:
The `Student` class represents a student entity with the following attributes:
- `prn`: The Permanent Registration Number of the student.
- `name`: The name of the student.
- `dob`: The date of birth of the student (in the format dd/MM/yyyy).
- `marks`: The marks obtained by the student.

#### Constructors:
- `Student(int prn)`: Constructor with one parameter, initializes PRN.
- `Student(int prn, String name)`: Constructor with two parameters, initializes PRN and name.
- `Student(int prn, String name, String dob)`: Constructor with three parameters, initializes PRN, name, and dob.
- `Student(int prn, String name, String dob, double marks)`: Constructor with four parameters, initializes all attributes.

#### Methods:
- Getters and setters for each attribute.
- `toString()`: Method to generate a string representation of the student object.

### StudentFunctions Class
The StudentFunctions class contains methods for various operations on the list of students, including adding students, printing all student details, searching for students by PRN, name, date of birth, or marks, updating student information, and deleting students.

#### Definition:
The `StudentFunctions` class encapsulates methods to perform operations on a list of students.

#### Attributes:
- `studentDatabase`: An ArrayList to store Student objects.
- `sc`: A Scanner object for user input.

#### Methods:
- `addStudent()`: Adds new students to the database.
- `printStudentDetails()`: Prints details of all students in the database.
- `searchStu()`: Allows users to search for students by PRN, name, date of birth, or marks.
- `updateOrDelete()`: Provides options to update, edit, or delete student information.
- `editStudent()`: Allows users to edit details of a specific student.
- `deleteStudent()`: Deletes a student record from the database.

### StudentDemo Class
The StudentDemo class contains the main method and serves as the entry point for the program. It creates an instance of the StudentFunctions class and provides a menu-driven interface for users to interact with the Student Management System.

#### Definition:
The `StudentDemo` class contains the main method and serves as the entry point for the program.

#### Methods:
- `main(String[] args)`: The entry point of the program, creates an instance of `StudentFunctions` and provides a menu-driven interface for user interaction.

---

This README file provides a detailed overview of the classes, attributes, and methods used in the Student Management System program. For further details, refer to the source code provided.
