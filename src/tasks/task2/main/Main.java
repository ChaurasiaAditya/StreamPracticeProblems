/*
 * Author Name: Aditya Chaurasia
 * Date: 15-09-2022
 * Created With: IntelliJ IDEA Community Edition
 * Profile: github.com/ChaurasiaAditya
 */
package tasks.task2.main;

import tasks.task2.code.Student;
import tasks.task2.code.TestResultGenerator;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        // create student object
        Student student1 = new Student((byte) 1,"Divyansh",1234657890,98);
        Student student2 = new Student((byte) 2,"Vaibhav",1234657890,28);
        Student student3 = new Student((byte) 3,"Neeraj",1234657890,23);
        Student student4 = new Student((byte) 4,"Aditya",1234657890,93);

        // create set of student Object
        Set<Student> students = new HashSet<>(Arrays.asList(student1,student2,student3,student4));

        // create object for Test result Generator
        TestResultGenerator testResultGenerator = new TestResultGenerator();

        // Call the method and print the Set of Failed students
        System.out.println("Failed Students with their Parents Contact Number");
        System.out.println(testResultGenerator.getDetailsOfFailedStudents(students));

        // Call the method and Print the Set of Students by Ranking Order
        System.out.println("\n" + "Students by Ranking");
        System.out.println(testResultGenerator.sortStudentsForRanking(students));
    }
}