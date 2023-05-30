package ru.trainingwork.homeworkspringbootapp.service;

import ru.trainingwork.homeworkspringbootapp.pojo.Employee;

import java.util.Collection;

public interface EmployeeService {

    int getEmployeeSalarySum();

    Collection<Employee> getEmployeeSalaryMin();

    Collection<Employee> getEmployeeSalaryMax();

    Collection<Employee> getEmployeeSalaryHighAwg();
}
