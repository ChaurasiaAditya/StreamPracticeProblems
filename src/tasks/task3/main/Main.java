/*
 * Author Name: Aditya Chaurasia
 * Date: 16-09-2022
 * Created With: IntelliJ IDEA Community Edition
 * Profile: github.com/ChaurasiaAditya
 */
package tasks.task3.main;

import tasks.task3.code.Employee;
import tasks.task3.code.EmployeeLeaveCalculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // create Employees objects
        Employee employee1 = new Employee((short) 101, "Aditya", 100000.0, (byte) 12);
        Employee employee2 = new Employee((short) 102, "Divyansh", 90000.0, (byte) 16);
        Employee employee3 = new Employee((short) 103, "Neeraj", 80000.0, (byte) 27);
        Employee employee4 = new Employee((short) 104, "Vaibhav", 70000.0, (byte) 32);
    }
}