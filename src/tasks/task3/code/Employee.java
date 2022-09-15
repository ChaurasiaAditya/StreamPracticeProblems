/*
 * Author Name: Aditya Chaurasia
 * Date: 16-09-2022
 * Created With: IntelliJ IDEA Community Edition
 * Profile: github.com/ChaurasiaAditya
 */
package tasks.task3.code;

import java.util.Objects;

public class Employee {
    private final short id;
    private final String name;
    private final double salary;
    private final byte numberOfLeaves;

    public Employee(short id, String name, double salary, byte numberOfLeaves) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.numberOfLeaves = numberOfLeaves;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Double.compare(employee.salary, salary) == 0 && numberOfLeaves == employee.numberOfLeaves && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary, numberOfLeaves);
    }
}
