/*
 * Author Name: Aditya Chaurasia
 * Date: 16-09-2022
 * Created With: IntelliJ IDEA Community Edition
 * Profile: github.com/ChaurasiaAditya
 */
package tasks.task3.code;

import java.util.Objects;

public record Employee(short id, String name, double salary, byte numberOfLeaves) {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Double.compare(employee.salary, salary) == 0 && numberOfLeaves == employee.numberOfLeaves && Objects.equals(name, employee.name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", numberOfLeaves=" + numberOfLeaves +
                '}';
    }
}
