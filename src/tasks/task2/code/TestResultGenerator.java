/*
 * Author Name: Aditya Chaurasia
 * Date: 15-09-2022
 * Created With: IntelliJ IDEA Community Edition
 * Profile: github.com/ChaurasiaAditya
 */
package tasks.task2.code;

import java.util.*;
import java.util.stream.Collectors;

public class TestResultGenerator {
    public HashSet<String> getDetailsOfFailedStudents(Set<Student> studentSet) {
        return studentSet
                .stream()
                .filter(students -> students.getMarks() < 30)
                .map(students -> "\"" + students.getStudentName() + "=" + students.getParentsContactNumber() + "\"")
                .collect(Collectors.toCollection(HashSet::new));
    }

    public Set<Student> sortStudentsForRanking(HashSet<Student> studentSet) {
        return new TreeSet<>(studentSet);
    }
}
