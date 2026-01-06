public class Coursse {
    // Instance variables to store course details
    String courseName;
    String courseCode;
    int courseCredit;

    // Default constructor
    public Coursse() {
        // You can add default values if you like, but not necessary
    }

    // Method to update course details
    public void updateDetails(String name, String code, int credit) {
        this.courseName = name;
        this.courseCode = code;
        this.courseCredit = credit;
    }

    // Method to display the course information
    public void displayCourse() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Credit: " + courseCredit);
    }
}

