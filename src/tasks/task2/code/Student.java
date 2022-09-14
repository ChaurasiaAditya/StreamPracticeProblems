/*
 * Author Name: Aditya Chaurasia
 * Date: 15-09-2022
 * Created With: IntelliJ IDEA Community Edition
 * Profile: github.com/ChaurasiaAditya
 */
package tasks.task2.code;

public class Student {
    private byte rollNumber;
    private final String studentName;
    private final long parentsContactNumber;
    private double marks;


    public Student(byte rollNumber, String studentName, long parentsContactNumber, double marks) {
        this.rollNumber = rollNumber;
        this.studentName = studentName;
        this.parentsContactNumber = parentsContactNumber;
        this.marks = marks;
    }

    public byte getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(byte rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public long getParentsContactNumber() {
        return parentsContactNumber;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
}
