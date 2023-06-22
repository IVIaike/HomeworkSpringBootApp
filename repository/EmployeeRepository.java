package ru.trainingwork.homeworkspringbootapp.repository;

import ru.trainingwork.homeworkspringbootapp.pojo.Employee;

import java.util.Collection;

public interface EmployeeRepository {

    int getEmployeeSalarySum();

    Collection<Employee> getEmployeeSalaryMin();

    Collection<Employee> getEmployeeSalaryMax();

    Collection<Employee> getEmployeeSalaryHighAwg();

    void deleteEmployee(int parseInt);

    void editEmployeeById(Employee employee, Integer parseInt);

    void addNewEmployee(Employee employee);

    Employee getEmployeeById(int parseInt);

    Collection<Employee> getEmployeeWithSalaryHigherThen(Integer compSalary);
}
