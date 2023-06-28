package ru.trainingwork.homeworkspringbootapp.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import ru.trainingwork.homeworkspringbootapp.dto.EmployeeDTO;
import ru.trainingwork.homeworkspringbootapp.dto.EmployeeFullInfo;
import ru.trainingwork.homeworkspringbootapp.exceptions.IncorrectEmployeeIdException;
import ru.trainingwork.homeworkspringbootapp.model.Employee;
import ru.trainingwork.homeworkspringbootapp.model.Position;
import ru.trainingwork.homeworkspringbootapp.repository.EmployeeRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeRepository employeeRepository;
    public EmployeeServiceImpl (EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<EmployeeDTO> findByName(@Param("name") String name) {
        List<Employee> result = new ArrayList<>(employeeRepository.findByName(name));
        return result
                .stream()
                .map(EmployeeDTO::fromEmployee)
                .toList();
    }

    @Override
    public List<EmployeeDTO> findEmployeeWithHighestSalary() {
        return employeeRepository.findEmployeeWithHighestSalary()
                .stream()
                .map(EmployeeDTO::fromEmployee)
                .toList();
    }

    @Override
    public List<EmployeeFullInfo> findAllEmployeeFullInfo() {
        return employeeRepository.findAllEmployeeFullInfo();
    }

    @Override
    public List<EmployeeDTO> findByPosition(String position) {
        return employeeRepository.findAllByPosition(position)
                .stream()
                .map(EmployeeDTO::fromEmployee)
                .toList();
    }

    @Override
    public List<Employee> getEmployeeWithPaging(int pageIndex) {
        Pageable employeeOfConcretePage = PageRequest.of(pageIndex, 10);
        Page<Employee>page = employeeRepository.findAll(employeeOfConcretePage);
        return page.stream().toList();
    }

//    @Override
//    public void addEmployee(Employee employee) {
//        employeeRepository.save(employee);
//    }
//
//    @Override
//    public Employee getEmployeeById(int id) {
//        return employeeRepository.findById(id).orElseThrow();
//    }
//
//    @Override
//    public void deleteEmployeeById(int id) {
//        employeeRepository.deleteById(id);
//    }
//
//    @Override
//    public List<EmployeeDTO> getAllEmployees () {
//        List<Employee> result = new ArrayList<>();
//        employeeRepository.findAll().forEach(result::add);
//        return result
//                .stream()
//                .map(EmployeeDTO::fromEmployee)
//                .toList();
//    }
//    @Override
//    public List<Employee> getEmployeeWithPaging (int pageIndex, int unitPerPage) {
//        Pageable employeeOfConcretePage = (Pageable) PageRequest.of(pageIndex, unitPerPage);
//        Page<Employee>page = employeeRepository.findAll((org.springframework.data.domain.Pageable) employeeOfConcretePage);
//        return page.stream().toList();
//    }

//    @Override
//    public List<EmployeeDTO> findEmployeesPosition(@Param("position") String position) {
//        List<Employee> result = new ArrayList<>(employeeRepository.findEmployeesPosition(position));
//    }


//
//
//    @Override
//    public void editEmployeeById(Employee employee, String identificator) {
//        employeeRepository.editEmployeeById(employee, Integer.parseInt(identificator));
//    }
//
//    @Override
//    public void deleteEmployeeById(String identificator) {
//        employeeRepository.deleteEmployee(Integer.parseInt(identificator));
//    }
//
//    @Override
//    public void addNewEmployee(Employee employee) {
//       employeeRepository.addNewEmployee(employee);
//    }
//
//    @Override
//    public Employee getEmployeeById(String identificator) {
//        return employeeRepository.getEmployeeById(Integer.parseInt(identificator));
//    }
//
//    @Override
//    public Collection<Employee> getEmployeeWithSalaryHigherThen(Integer compSalary) {
//        return employeeRepository.getEmployeeWithSalaryHigherThen(compSalary);
//    }
//
//    @Override
//    public int getEmployeeSalarySum() {
//        return employeeRepository.getEmployeeSalarySum();
//    }
//
//    @Override
//    public Collection<Employee> getEmployeeSalaryMin() {
//        return employeeRepository.getEmployeeSalaryMin();
//    }
//
//    @Override
//    public Collection<Employee> getEmployeeSalaryMax() {
//        return employeeRepository.getEmployeeSalaryMax();
//    }
//
//    @Override
//    public Collection<Employee> getEmployeeSalaryHighAwg() {
//        return employeeRepository.getEmployeeSalaryHighAwg();
//    }
}
