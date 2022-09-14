/*
 * Author Name: Aditya Chaurasia
 * Date: 15-09-2022
 * Created With: IntelliJ IDEA Community Edition
 * Profile: github.com/ChaurasiaAditya
 */
package tasks.task2.code;

import java.util.HashSet;
import java.util.Set;

public class TestResultGenerator {
    public HashSet<String> getDetailsOfFailedStudents(Set<Student> studentSet) {
        HashSet<String> detailsOfFailedStudent = new HashSet<>();
        for (Student students : studentSet){
            if (students.getMarks() < 30){
                detailsOfFailedStudent.add(students.getStudentName() + "=" + students.getParentsContactNumber());
            }
        }
        return null;
    }
}
