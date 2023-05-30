package ru.trainingwork.homeworkspringbootapp.repository;

import ru.trainingwork.homeworkspringbootapp.pojo.Employee;

import java.util.Collection;

public interface EmployeeRepository {

    int getEmployeeSalarySum();

    Collection<Employee> getEmployeeSalaryMin();

    Collection<Employee> getEmployeeSalaryMax();

    Collection<Employee> getEmployeeSalaryHighAwg();
}
