/*
 * Author Name: Aditya Chaurasia
 * Date: 15-09-2022
 * Created With: IntelliJ IDEA Community Edition
 * Profile: github.com/ChaurasiaAditya
 */
package tasks.task2.code;

public class Student {
    private byte rollNumber;
    private String studentName;
    private long parentsContactNumber;
    private double marks;

    public Student() {
    }

    public Student(byte rollNumber, String studentName, long parentsContactNumber, double marks) {
        this.rollNumber = rollNumber;
        this.studentName = studentName;
        this.parentsContactNumber = parentsContactNumber;
        this.marks = marks;
    }
}
