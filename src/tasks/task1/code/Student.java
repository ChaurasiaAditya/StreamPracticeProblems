/*
 * Author Name: Aditya Chaurasia
 * Date: 13-09-2022
 * Created With: IntelliJ IDEA Community Edition
 * Profile: github.com/ChaurasiaAditya
 */
package tasks.task1.code;

import java.util.Objects;

public class Student {
    private byte rollNumber;
    private final String firstName;
    private final String lastName;
    private byte currentYear;

    public Student(byte rollNumber, String firstName, String lastName, byte currentYear) {
        this.rollNumber = rollNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.currentYear = currentYear;
    }

    public byte getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(byte rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public byte getCurrentYear() {
        return currentYear;
    }

    public void setCurrentYear(byte currentYear) {
        this.currentYear = currentYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNumber == student.rollNumber && currentYear == student.currentYear && Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNumber, firstName, lastName, currentYear);
    }
}
