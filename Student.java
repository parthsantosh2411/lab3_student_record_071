public class Student {
    private int prn;
    private String name;
    private String dob; // format dd/MM/yyyy
    private double marks;

    public Student(int prn) { // constructor with one parameter
        this.prn = prn;
    }

    public Student(int prn, String name) { // constructor with two parameter
        this(prn);
        this.name = name;
    }

    public Student(int prn, String name, String dob) { // constructor with three parameter
        this(prn, name);
        this.dob = dob;
    }

    public Student(int prn, String name, String dob, double marks) { // constructor with four parameter
        this(prn, name, dob);
        this.marks = marks;
    }

    public int getPrn() {
        return prn;
    }

    public void setPrn(int prn) {
        this.prn = prn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "prn=" + prn +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", marks=" + marks +
                '}';
    }
}