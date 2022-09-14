/*
 * Author Name: Aditya Chaurasia
 * Date: 13-09-2022
 * Created With: IntelliJ IDEA Community Edition
 * Profile: github.com/ChaurasiaAditya
 */
package tasks.task1.code;

import java.util.Objects;

public class PassWord {
    private String passWord;

    public PassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PassWord passWord1 = (PassWord) o;
        return Objects.equals(passWord, passWord1.passWord);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passWord);
    }

    @Override
    public String toString() {
        return "PassWord{" +
                "passWord='" + passWord + '\'' +
                '}';
    }
}
