// Course.java
public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        // Write your code here
        students[numberOfStudents] = student;
        numberOfStudents += 1;
    }

    public String[] getStudents() {
        // Write your code here
        return students;
    }

    public int getNumberOfStudents() {
        // Write your code here
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }
}
