/*
 * Author Name: Aditya Chaurasia
 * Date: 15-09-2022
 * Created With: IntelliJ IDEA Community Edition
 * Profile: github.com/ChaurasiaAditya
 */
package tasks.task2.code;

import java.util.Objects;

public record Student(byte rollNumber, String studentName, long parentsContactNumber,
                      double marks) implements Comparable<Student> {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNumber == student.rollNumber &&
                parentsContactNumber == student.parentsContactNumber &&
                Double.compare(student.marks, marks) == 0 &&
                Objects.equals(studentName, student.studentName);
    }

    @Override
    public String toString() {
        return " RollNumber = " + rollNumber() +
                ", StudentName = " + studentName() + '\'' +
                ", ParentsContactNumber = " + parentsContactNumber() +
                ", Marks = " + marks() +
                "\n";
    }

    @Override
    public int compareTo(Student o) {
        return Byte.compare((byte) o.marks(), (byte) this.marks());
    }
}
