// StudentTester.java
public class StudentTester {
    public static void main(String[] args) {
        Student s1 = new Student("Harry", "CSE"); // Create Student object
        System.out.println(s1.name);              // Output: Harry

        s1.updateName("Harry Potter");            // Update name
        System.out.println(s1.name);              // Output: Harry Potter

        System.out.println(s1.prog);              // Output: CSE

        s1.updateProgram("CS");                   // Update program
        String var = s1.accessProgram();          // Access updated program
        System.out.println(var);                  // Output: CS
    }
}
// Student.java
    class Student {
    // Fields
    String name;
    String prog;

    // Constructor
    public Student(String name, String prog) {
        this.name = name;
        this.prog = prog;
    }

    // Method to update the student's name
    public void updateName(String newName) {
        this.name = newName;
    }

    // Method to update the student's program
    public void updateProgram(String newProg) {
        this.prog = newProg;
    }

    // Method to access the program
    public String accessProgram() {
        return this.prog;
    }
}
