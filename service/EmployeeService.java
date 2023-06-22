package ru.trainingwork.homeworkspringbootapp.service;

import ru.trainingwork.homeworkspringbootapp.pojo.Employee;

import java.util.Collection;

public interface EmployeeService {

    int getEmployeeSalarySum();

    Collection<Employee> getEmployeeSalaryMin();

    Collection<Employee> getEmployeeSalaryMax();

    Collection<Employee> getEmployeeSalaryHighAwg();
    
    void editEmployeeById(Employee employee, String identificator);

    void deleteEmployeeById(String identificator);

    void addNewEmployee(Employee employee);

    Employee getEmployeeById(String identificator);

    Collection<Employee> getEmployeeWithSalaryHigherThen(Integer compSalary);
}
