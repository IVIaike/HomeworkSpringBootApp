package ru.trainingwork.homeworkspringbootapp.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.trainingwork.homeworkspringbootapp.pojo.Employee;
import ru.trainingwork.homeworkspringbootapp.service.EmployeeService;

import java.util.Collection;

@RestController
@RequestMapping("/employee/salary")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("/sum")
    public int getEmployeeSalarySum () {
        return employeeService.getEmployeeSalarySum();
    }

    @GetMapping("/min")
    public Collection<Employee> getEmployeeSalaryMin () {
        return employeeService.getEmployeeSalaryMin();
    }

    @GetMapping("/max")
    public Collection<Employee> getEmployeeSalaryMax () {return employeeService.getEmployeeSalaryMax();}

    @GetMapping("/high-salary")
    public Collection<Employee> getEmployeeSalaryHighAwg () {return employeeService.getEmployeeSalaryHighAwg();}




    //        ### Получение суммы зарплат сотрудников
//        GET http://localhost:8080/employee/salary/sum
//
//### Получение сотрудника с минимальной зарплатой
//        GET http://localhost:8080/employee/salary/min
//
//### Получение сотрудника с максимальной зарплатой
//        GET http://localhost:8080/employee/salary/max
//
//### Получение всех сотрудников, зарплата которых больше средней
//        GET http://localhost:8080/employee/salary/high-salary
}
