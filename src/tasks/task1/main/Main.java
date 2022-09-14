/*
 * Author Name: Aditya Chaurasia
 * Date: 14-09-2022
 * Created With: IntelliJ IDEA Community Edition
 * Profile: github.com/ChaurasiaAditya
 */
package tasks.task1.main;

import tasks.task1.code.PortalCredentialsCreator;
import tasks.task1.code.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Create Student Objects
        Student student1 = new Student((byte) 1, "Aditya", "Chaurasia", (byte) 22);
        Student student2 = new Student((byte) 2, "Divyansh", "Bharadwaj", (byte) 22);
        Student student3 = new Student((byte) 3, "Pinky", "Sodhi", (byte) 22);

        // Add the Student objects in an Array List.
        List<Student> studentList = new ArrayList<>(Arrays.asList(student1, student2, student3));

        // Create PortalCredentialCreator Object
        PortalCredentialsCreator portalCredentialsCreator = new PortalCredentialsCreator();

        // Call the Method and Print the UserName
        System.out.println(portalCredentialsCreator.createListOfUserNames(studentList));

        // Call the method and Print the Passwords
        System.out.println(portalCredentialsCreator.createListOfRandomPasswords(studentList));
    }
}