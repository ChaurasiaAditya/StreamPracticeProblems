/*
 * Author Name: Aditya Chaurasia
 * Date: 14-09-2022
 * Created With: IntelliJ IDEA Community Edition
 * Profile: github.com/ChaurasiaAditya
 */
package tasks.task1.main;

import tasks.task1.code.PassWord;
import tasks.task1.code.PortalCredentialsCreator;
import tasks.task1.code.Student;
import tasks.task1.code.UserName;

import java.util.*;

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

        // Call the Method and store the list of UserName
        List<UserName> listOfUserNames = portalCredentialsCreator.createListOfUserNames(studentList);

        // Call the method and store the list of Passwords
        List<PassWord> listOfRandomPasswords = portalCredentialsCreator.createListOfRandomPasswords(studentList);

        // create a Map
        Map<UserName,PassWord> namePassWordMap = new HashMap<>();

        // User iterator on username and Password
        Iterator<UserName> userNameIterator = listOfUserNames.iterator();
        Iterator<PassWord> passWordIterator = listOfRandomPasswords.iterator();
        while (userNameIterator.hasNext()){
            UserName userName = userNameIterator.next();
            PassWord next = passWordIterator.next();
            namePassWordMap.put(userName,next);
        }
        // Print the username with Password
        System.out.println(namePassWordMap);
    }
}