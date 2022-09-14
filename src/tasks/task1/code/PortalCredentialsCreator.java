/*
 * Author Name: Aditya Chaurasia
 * Date: 13-09-2022
 * Created With: IntelliJ IDEA Community Edition
 * Profile: github.com/ChaurasiaAditya
 */
package tasks.task1.code;
import java.util.List;
import java.util.Random;
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
        String username = String.format("%s.%s.%d.%d", firstName, lastName, currentYear, rollNumber);
        return new UserName(username);
    }

    public List<PassWord> createListOfRandomPasswords(List<Student> studentsList) {
        return studentsList
                .stream()
                .map(student -> new PassWord(createStringPassword(student)))
                .collect(Collectors.toList());
    }

    private String createStringPassword(Student student){
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 8;
        Random random = new Random();
        return random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString()
                .concat(student.firstName());
    }

}