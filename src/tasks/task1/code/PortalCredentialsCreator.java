/*
 * Author Name: Aditya Chaurasia
 * Date: 13-09-2022
 * Created With: IntelliJ IDEA Community Edition
 * Profile: github.com/ChaurasiaAditya
 */
package tasks.task1.code;

import java.util.ArrayList;
import java.util.List;

public class PortalCredentialsCreator {

    public List<UserName> createListOfUserNames(List<Student> studentsList) {


        return null;
    }

    public UserName createUserName(Student student){
        String firstName = student.getFirstName();
        String lastName = student.getLastName();
        byte currentYear = student.getCurrentYear();
        byte rollNumber = student.getRollNumber();

        String format = String.format("%s.%s.%d.%d", firstName, lastName, currentYear, rollNumber);
        return new UserName(format);
    }

    public List<PassWord> createListOfRandomPasswords(List<Student> studentsList) {
        return null;
    }


}
