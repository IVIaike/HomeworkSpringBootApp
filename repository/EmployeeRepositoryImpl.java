package ru.trainingwork.homeworkspringbootapp.repository;

import org.springframework.stereotype.Repository;
import ru.trainingwork.homeworkspringbootapp.pojo.Employee;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository{

    private final List<Employee> employeeList = List.of(
            new Employee("Leo", 90_000),
            new Employee("Damon", 100_000),
            new Employee("Rousi", 80_000),
            new Employee("Dominik", 120_000));

    @Override
    public int getEmployeeSalarySum() {
        int sumSalary = 0;
        for (Employee e: employeeList) {
            sumSalary = sumSalary + e.getSalary();
        }
        return sumSalary;
    }

    @Override
    public int getEmployeeSalaryMin() {
        int minSalary = Integer.MAX_VALUE;
        for (Employee e: employeeList) {
            minSalary = Math.min(minSalary, e.getSalary());
        }
        return minSalary;
    }

    @Override
    public int getEmployeeSalaryMax() {
        int maxSalary = 0;
        for (Employee e: employeeList) {
            if (maxSalary < e.getSalary()) {
                maxSalary = e.getSalary();
            }
        }
        return maxSalary;
    }
//Что-то тут не так работает
    @Override
    public int getEmployeeSalaryHighAwg() {
        int highAwgSalary = 0;
        int sumSalary = 0;
        for (Employee e: employeeList) {
            sumSalary = sumSalary + e.getSalary();
        }
        int awgSalary = sumSalary / employeeList.size();
        for (Employee e: employeeList) {
            if (awgSalary < e.getSalary()){
                highAwgSalary = e.getSalary();
            }
        }
        return highAwgSalary;
    }
}
