/*
 * Author Name: Aditya Chaurasia
 * Date: 13-09-2022
 * Created With: IntelliJ IDEA Community Edition
 * Profile: github.com/ChaurasiaAditya
 */
package tasks.task1.code;

import java.util.List;
import java.util.stream.Collectors;

public class PortalCredentialsCreator {

    public List<UserName> createListOfUserNames(List<Student> studentsList) {

        return studentsList
                .stream()
                .map(this::createUserName)
                .collect(Collectors.toList());
    }

    private UserName createUserName(Student student){
        String firstName = student.firstName();
        String lastName = student.lastName();
        byte currentYear = student.currentYear();
        byte rollNumber = student.rollNumber();
        String format = String.format("%s.%s.%d.%d", firstName, lastName, currentYear, rollNumber);
        return new UserName(format);
    }

    public List<PassWord> createListOfRandomPasswords(List<Student> studentsList) {
        return null;
    }


}
