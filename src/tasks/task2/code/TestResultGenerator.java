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
                .filter(students -> students.marks() < 30)
                .map(students -> "\"" + students.studentName() + "=" + students.parentsContactNumber() + "\"")
                .collect(Collectors.toCollection(HashSet::new));
    }

    public Set<Student> sortStudentsForRanking(Set<Student> studentSet) {
        return new TreeSet<>(studentSet);
    }
}
