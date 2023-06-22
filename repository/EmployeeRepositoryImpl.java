package ru.trainingwork.homeworkspringbootapp.repository;

import lombok.SneakyThrows;
import org.springframework.stereotype.Repository;
import org.webjars.NotFoundException;
import ru.trainingwork.homeworkspringbootapp.pojo.Employee;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository{

    private final List<Employee> employeeList = new ArrayList<>(List.of(
            new Employee(1, "Leo", 90_000),
            new Employee(2, "Damon", 100_000),
            new Employee(3, "Rousi", 80_000),
            new Employee(4, "Dominik", 120_000)));

    @Override
    public int getEmployeeSalarySum() {
        int sumSalary = 0;
        for (Employee e: employeeList) {
            sumSalary = sumSalary + e.getSalary();
        }
        return sumSalary;
    }

    @Override
    public Collection<Employee> getEmployeeSalaryMin() {
        int minSalary = Integer.MAX_VALUE;
        for (Employee e: employeeList) {
            minSalary = Math.min(minSalary, e.getSalary());
        }
        Collection<Employee> result = new ArrayList<>();
        for (Employee e: employeeList) {
            if(minSalary == e.getSalary()) {
                result.add(e);
            }
        }
        return result;
    }

    @Override
    public Collection<Employee> getEmployeeSalaryMax() {
        int maxSalary = 0;
        for (Employee e: employeeList) {
            if (maxSalary < e.getSalary()) {
                maxSalary = e.getSalary();
            }
        }
        Collection<Employee> result = new ArrayList<>();
        for (Employee e: employeeList) {
            if(maxSalary == e.getSalary()) {
                result.add(e);
            }
        }
        return result;
    }
    @Override
    public Collection<Employee> getEmployeeSalaryHighAwg() {
        int sumSalary = 0;
        for (Employee e: employeeList) {
            sumSalary = sumSalary + e.getSalary();
        }
        int awgSalary = sumSalary / employeeList.size();
        Collection<Employee> result = new ArrayList<>();
        for (Employee e: employeeList) {
            if(awgSalary < e.getSalary()) {
                result.add(e);
            }
        }
        return result;
    }

    @Override
    public void deleteEmployee(int parseInt) {
//        employeeList.stream()
//                .filter(employee -> employee.getSalary() > employeeList.stream()
//                        .map(Employee::getSalary)
//                        .reduce(Integer::sum)
//                        .orElse(0) / employeeList.size())
//                .toList();
        employeeList.remove(getEmployeeById(parseInt));
    }

    @SneakyThrows
    @Override
    public void editEmployeeById(Employee employee, Integer parseInt) {
            for (int i = 0; i < employeeList.size(); i++) {
                if(employeeList.get(i).getId().equals(parseInt)){
                    employeeList.get(i).setId(employee.getId());
                    employeeList.get(i).setName(employee.getName());
                    employeeList.get(i).setSalary(employee.getSalary());
                    break;
                }
            }
    }

    @Override
    public void addNewEmployee(Employee employee) {
        employeeList.add(employee);
    }

    @SneakyThrows
    @Override
    public Employee getEmployeeById(int parseInt) {

//        return employeeList.stream().filter(x -> x.getId() == parseInt).findFirst().orElseThrow(IOException::new);

        Predicate<Employee>currentEmployee = employee -> employee.getId() == parseInt;
        return employeeList
                .stream()
                .filter(employee -> employee.getId() == parseInt)
                .toList()
                .get(0);
    }

    @Override
    public Collection<Employee> getEmployeeWithSalaryHigherThen(Integer compSalary) {
        return employeeList.stream().filter(employee -> employee.getSalary() > compSalary).toList();

    }

}
