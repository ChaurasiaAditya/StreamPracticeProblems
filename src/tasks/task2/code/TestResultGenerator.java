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
    /**
     * It takes a set of students, filters out the students who have failed, and returns a set of strings containing the
     * name and contact number of the parents of the failed students
     *
     * @param studentSet The set of students
     * @return A HashSet of Strings
     */
    public HashSet<String> getDetailsOfFailedStudents(Set<Student> studentSet) {
        return studentSet
                .stream()
                .filter(students -> students.marks() < 30)
                .map(students -> "\"" + students.studentName() + "=" + students.parentsContactNumber() + "\"")
                .collect(Collectors.toCollection(HashSet::new));
    }

    /**
     * Sort the students by their name and return the sorted set.
     *
     * @param studentSet A set of students
     * @return A new TreeSet object that contains the elements of the studentSet.
     */
    public Set<Student> sortStudentsForRanking(Set<Student> studentSet) {
        return new TreeSet<>(studentSet);
    }
}
