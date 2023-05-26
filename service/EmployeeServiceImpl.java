package ru.trainingwork.homeworkspringbootapp.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import ru.trainingwork.homeworkspringbootapp.pojo.Employee;
import ru.trainingwork.homeworkspringbootapp.repository.EmployeeRepository;

import java.util.Collection;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeRepository employeeRepository;
    @Override
    public int getEmployeeSalarySum() {
        return employeeRepository.getEmployeeSalarySum();
    }

    @Override
    public Collection<Employee> getEmployeeSalaryMin() {
        return employeeRepository.getEmployeeSalaryMin();
    }

    @Override
    public Collection<Employee> getEmployeeSalaryMax() {
        return employeeRepository.getEmployeeSalaryMax();
    }

    @Override
    public Collection<Employee> getEmployeeSalaryHighAwg() {
        return employeeRepository.getEmployeeSalaryHighAwg();
    }
}
