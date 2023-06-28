package ru.trainingwork.homeworkspringbootapp.service;

import org.springframework.data.repository.query.Param;
import ru.trainingwork.homeworkspringbootapp.dto.EmployeeDTO;
import ru.trainingwork.homeworkspringbootapp.dto.EmployeeFullInfo;
import ru.trainingwork.homeworkspringbootapp.model.Employee;
import ru.trainingwork.homeworkspringbootapp.model.Position;

import java.util.List;

public interface EmployeeService {
    List<EmployeeDTO> findByName(@Param("name") String name);

    List<EmployeeDTO> findEmployeeWithHighestSalary();

    List<EmployeeFullInfo> findAllEmployeeFullInfo();

    List<EmployeeDTO> findByPosition(String position);

    List<Employee> getEmployeeWithPaging(int pageIndex);

//    void addEmployee(Employee employee);
//
//    Employee getEmployeeById(int id);
//
//    void deleteEmployeeById(int id);
//
//    List<EmployeeDTO> getAllEmployees();
//
//    int getEmployeeSalarySum();
//
//    Collection<Employee> getEmployeeSalaryMin();
//
//    Collection<Employee> getEmployeeSalaryMax();
//
//    Collection<Employee> getEmployeeSalaryHighAwg();
//
//    void editEmployeeById(Employee employee, String identificator);
//
//    void deleteEmployeeById(String identificator);
//
//    void addNewEmployee(Employee employee);
//
//    Employee getEmployeeById(String identificator);
//
//    Collection<Employee> getEmployeeWithSalaryHigherThen(Integer compSalary);
}
