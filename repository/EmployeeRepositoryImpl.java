package ru.trainingwork.homeworkspringbootapp.repository;

import org.springframework.stereotype.Repository;
import ru.trainingwork.homeworkspringbootapp.pojo.Employee;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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
}
