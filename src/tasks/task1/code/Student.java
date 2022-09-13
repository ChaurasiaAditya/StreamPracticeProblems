/*
 * Author Name: Aditya Chaurasia
 * Date: 13-09-2022
 * Created With: IntelliJ IDEA Community Edition
 * Profile: github.com/ChaurasiaAditya
 */
package tasks.task1.code;

import java.util.Objects;

public record Student(byte rollNumber, String firstName, String lastName, byte currentYear) {


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNumber == student.rollNumber && currentYear == student.currentYear && Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName);
    }

    @Override
    public String toString() {
        return "Student{" + "rollNumber=" + rollNumber() + ", firstName='" + firstName() + '\'' + ", lastName='" + lastName() + '\'' + ", currentYear=" + currentYear() + '}';
    }
}
