package ru.trainingwork.homeworkspringbootapp.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import ru.trainingwork.homeworkspringbootapp.repository.EmployeeRepository;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeRepository employeeRepository;
    @Override
    public int getEmployeeSalarySum() {
        return employeeRepository.getEmployeeSalarySum();
    }

    @Override
    public int getEmployeeSalaryMin() {
        return employeeRepository.getEmployeeSalaryMin();
    }

    @Override
    public int getEmployeeSalaryMax() {
        return employeeRepository.getEmployeeSalaryMax();
    }

    @Override
    public int getEmployeeSalaryHighAwg() {
        return employeeRepository.getEmployeeSalaryHighAwg();
    }
}
