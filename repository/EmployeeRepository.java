package ru.trainingwork.homeworkspringbootapp.repository;

public interface EmployeeRepository {

    int getEmployeeSalarySum();

    int getEmployeeSalaryMin();

    int getEmployeeSalaryMax();

    int getEmployeeSalaryHighAwg();
}
