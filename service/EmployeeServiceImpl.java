package ru.trainingwork.homeworkspringbootapp.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.trainingwork.homeworkspringbootapp.pojo.Employee;
import ru.trainingwork.homeworkspringbootapp.repository.EmployeeRepository;

import java.util.Collection;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeRepository employeeRepository;


    @Override
    public void editEmployeeById(Employee employee, String identificator) {
        employeeRepository.editEmployeeById(employee, Integer.parseInt(identificator));
    }

    @Override
    public void deleteEmployeeById(String identificator) {
        employeeRepository.deleteEmployee(Integer.parseInt(identificator));
    }

    @Override
    public void addNewEmployee(Employee employee) {
       employeeRepository.addNewEmployee(employee);
    }

    @Override
    public Employee getEmployeeById(String identificator) {
        return employeeRepository.getEmployeeById(Integer.parseInt(identificator));
    }

    @Override
    public Collection<Employee> getEmployeeWithSalaryHigherThen(Integer compSalary) {
        return employeeRepository.getEmployeeWithSalaryHigherThen(compSalary);
    }

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
