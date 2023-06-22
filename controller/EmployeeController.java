package ru.trainingwork.homeworkspringbootapp.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import ru.trainingwork.homeworkspringbootapp.pojo.Employee;
import ru.trainingwork.homeworkspringbootapp.repository.EmployeeRepository;
import ru.trainingwork.homeworkspringbootapp.service.EmployeeService;

import java.util.Collection;

@RestController
@RequestMapping("/employees")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping("/")
    public void addNewEmployee(@RequestBody Employee employee) {
        employeeService.addNewEmployee(employee);
    }

    @PutMapping("/{id}")
    public void editEmployeeById (@RequestBody Employee employee, @PathVariable (value = "id") String identificator) {
        employeeService.editEmployeeById(employee, identificator);
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById (@PathVariable (value = "id") String identificator){
        return employeeService.getEmployeeById(identificator);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@RequestParam (value = "id") String identificator) {
        employeeService.deleteEmployeeById(identificator);
    }

    @GetMapping("/salary/higherThen")
    public Collection<Employee> getEmployeeWithSalaryHigherThen (@RequestParam ("compareSalary") Integer compSalary) {
        return employeeService.getEmployeeWithSalaryHigherThen(compSalary);
    }


    @GetMapping("/salary/sum")
    public int getEmployeeSalarySum () {
        return employeeService.getEmployeeSalarySum();
    }

    @GetMapping("/salary/min")
    public Collection<Employee> getEmployeeSalaryMin () {
        return employeeService.getEmployeeSalaryMin();
    }

    @GetMapping("/salary/max")
    public Collection<Employee> getEmployeeSalaryMax () {return employeeService.getEmployeeSalaryMax();}

    @GetMapping("/salary/high-salary")
    public Collection<Employee> getEmployeeSalaryHighAwg () {return employeeService.getEmployeeSalaryHighAwg();}


//    GET-запрос
//    localhost:8080/employees/salaryHigherThan?salary=
//    Он должен возвращать всех сотрудников, зарплата которых выше переданного параметра salary.

}
