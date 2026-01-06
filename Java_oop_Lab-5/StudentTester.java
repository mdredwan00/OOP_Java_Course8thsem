public class StudentTester {
    public static void main(String args[]) {
        CSEStudent.details();
        System.out.println("1--------------");

        CSEStudent s1 = new CSEStudent("Bob", 23);
        s1.info();
        System.out.println("2--------------");

        CSEStudent s2 = new CSEStudent("Don", 33);
        s2.info();
        System.out.println("3--------------");

        s1.addLabBasedCourse("CSE220");
        s1.addLabBasedCourse("CSE221");
        System.out.println("4--------------");
        s1.info();
        System.out.println("5--------------");

        CSEStudent.details();
        System.out.println("6--------------");

        s1.addLabBasedCourse("CSE230"); // invalid
        System.out.println("7--------------");
        s1.info();
        System.out.println("8--------------");

        s2.addLabBasedCourse("CSE110");
        s2.info();
    }
}

/* Base Student class */
class Student {
    public String name;
    public int id;
    public String courses = "";

    public Student(String n, int i) {
        name = n;
        id = i;
    }

    public void info() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Courses: " + courses);
    }
}

/* CSEStudent class */
class CSEStudent extends Student {
    private static int totalCSEStudents = 0;
    private static String[] labCourses = {"CSE110", "CSE111", "CSE220", "CSE221"};

    public CSEStudent(String name, int id) {
        super(name, id);
        totalCSEStudents++;
    }

    // Add a lab-based course if valid
    public void addLabBasedCourse(String course) {
        boolean valid = false;
        for (String c : labCourses) {
            if (c.equals(course)) {
                valid = true;
                break;
            }
        }
        if (valid) {
            if (!courses.isEmpty()) courses += " ";
            courses += course;
        } else {
            System.out.println("It is not a lab based course!");
        }
    }

    // Static method to display details
    public static void details() {
        System.out.println("Total CSE Students: " + totalCSEStudents);
        System.out.print("Available Lab Based Courses:\n");
        for (String c : labCourses) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}

