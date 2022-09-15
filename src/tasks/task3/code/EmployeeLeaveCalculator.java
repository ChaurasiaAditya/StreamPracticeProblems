/*
 * Author Name: Aditya Chaurasia
 * Date: 16-09-2022
 * Created With: IntelliJ IDEA Community Edition
 * Profile: github.com/ChaurasiaAditya
 */
package tasks.task3.code;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeLeaveCalculator {
    public List<Short> getDefaulterEmployeeIDList(List<Employee> employeeList) {
        List<Short> shortList = new ArrayList<>();
        employeeList.stream().filter(next -> next.getNumberOfLeaves() > 25).forEach(next -> {
            shortList.add(next.getId());
            next.setSalary(next.getSalary() - next.getSalary() * 0.1);
        });
        return shortList;
    }

    public ArrayList<String> getNumberOfLeaves(List<Employee> employeeList) {
        return employeeList
                .stream()
                .map(next -> "\"" + next.getName() + "-" + next.getNumberOfLeaves() + "\"")
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
