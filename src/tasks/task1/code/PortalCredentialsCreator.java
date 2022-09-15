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

    /**
     * "Create a list of UserName objects from a list of Student objects."
     * The function is a one-liner, but it's still easy to understand
     *
     * @param studentsList The list of students that we want to convert to a list of UserNames.
     * @return A list of UserName objects.
     */
    public List<UserName> createListOfUserNames(List<Student> studentsList) {

        return studentsList
                .stream()
                .map(this::createUserName)
                .collect(Collectors.toList());
    }

    /**
     * It creates a username for a student
     *
     * @param student The object of the class Student.
     * @return A UserName object is being returned.
     */
    private UserName createUserName(Student student){
        String firstName = student.firstName();
        String lastName = student.lastName();
        byte currentYear = student.currentYear();
        byte rollNumber = student.rollNumber();
        String username = String.format("%s.%s.%d.%d", firstName, lastName, currentYear, rollNumber);
        return new UserName(username);
    }

    /**
     * Create a list of passwords from a list of students by mapping each student to a password.
     *
     * @param studentsList a list of students
     * @return A list of PassWord objects.
     */
    public List<PassWord> createListOfRandomPasswords(List<Student> studentsList) {
        return studentsList
                .stream()
                .map(student -> new PassWord(createStringPassword(student)))
                .collect(Collectors.toList());
    }

    /**
     * It creates a random string of 8 characters, and then concatenates the first name of the student to the end of it
     *
     * @param student the student object that we are creating the password for
     * @return A string of 8 random letters and the student's first name.
     */
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