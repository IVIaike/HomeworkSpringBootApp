package ru.trainingwork.homeworkspringbootapp.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;
import ru.trainingwork.homeworkspringbootapp.dto.EmployeeDTO;
import ru.trainingwork.homeworkspringbootapp.dto.EmployeeFullInfo;
import ru.trainingwork.homeworkspringbootapp.model.Employee;
import ru.trainingwork.homeworkspringbootapp.model.Position;
import ru.trainingwork.homeworkspringbootapp.service.EmployeeService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("/name")
    public List<EmployeeDTO> findByName(@Param("name") String name) {
        return employeeService.findByName(name);
    }

    @GetMapping("/position")
    public List<EmployeeDTO> findByPosition(@Param("position") String position) {
        return employeeService.findByPosition(position);
    }

    @GetMapping("/withHighestSalary")
    public List<EmployeeDTO> findEmployeeWithHighestSalary() {
        return employeeService.findEmployeeWithHighestSalary();
    }

    @GetMapping("/all")
    public List<EmployeeFullInfo> findAllEmployeeFullInfo() {
        return employeeService.findAllEmployeeFullInfo();
    }

    @GetMapping("/page")
    public List<Employee> getEmployeeWithPaging(@RequestParam("page") Integer pageIndex) {
        return employeeService.getEmployeeWithPaging(pageIndex);
    }
}
//    @PostMapping("/")
//    public void addEmployee(@RequestBody Employee employee) {
//        employeeService.addEmployee(employee);
//    }
//
//    @GetMapping("/{id}")
//    public Employee getEmployeeById(@PathVariable int id) {
//        return employeeService.getEmployeeById(id);
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteEmployeeById(@PathVariable int id) {
//        employeeService.deleteEmployeeById(id);
//    }
//
//    @GetMapping("/all")
//    public List<EmployeeDTO> getAllEmployees() {
//        return employeeService.getAllEmployees();
//    }
//    @PostMapping("/")
//    public void addNewEmployee(@RequestBody Employee employee) {
//        employeeService.addNewEmployee(employee);
//    }
//
//    @PutMapping("/{id}")
//    public void editEmployeeById (@RequestBody Employee employee, @PathVariable (value = "id") String identificator) {
//        employeeService.editEmployeeById(employee, identificator);
//    }
//
//    @GetMapping("/{id}")
//    public Employee getEmployeeById (@PathVariable (value = "id") String identificator){
//        return employeeService.getEmployeeById(identificator);
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteEmployee(@RequestParam (value = "id") String identificator) {
//        employeeService.deleteEmployeeById(identificator);
//    }
//
//    @GetMapping("/salary/higherThen")
//    public Collection<Employee> getEmployeeWithSalaryHigherThen (@RequestParam ("compareSalary") Integer compSalary) {
//        return employeeService.getEmployeeWithSalaryHigherThen(compSalary);
//    }
//
//
//    @GetMapping("/salary/sum")
//    public int getEmployeeSalarySum () {
//        return employeeService.getEmployeeSalarySum();
//    }
//
//    @GetMapping("/salary/min")
//    public Collection<Employee> getEmployeeSalaryMin () {
//        return employeeService.getEmployeeSalaryMin();
//    }
//
//    @GetMapping("/salary/max")
//    public Collection<Employee> getEmployeeSalaryMax () {return employeeService.getEmployeeSalaryMax();}
//
//    @GetMapping("/salary/high-salary")
//    public Collection<Employee> getEmployeeSalaryHighAwg () {return employeeService.getEmployeeSalaryHighAwg();}


