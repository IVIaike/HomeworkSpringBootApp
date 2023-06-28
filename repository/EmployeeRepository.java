package ru.trainingwork.homeworkspringbootapp.repository;

import jakarta.persistence.criteria.From;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import ru.trainingwork.homeworkspringbootapp.dto.EmployeeFullInfo;
import ru.trainingwork.homeworkspringbootapp.model.Employee;
import ru.trainingwork.homeworkspringbootapp.model.Position;

import java.util.Collection;
import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>, PagingAndSortingRepository<Employee, Integer> {

    Page<Employee> findAll(Pageable pageable);
    Employee findByNameAndSalary(String name, Integer salary);
    @Query(value = "SELECT * FROM employee WHERE name= :name", nativeQuery = true)
    List<Employee> findByName(@Param("name") String name);

    @Query("SELECT new ru.trainingwork.homeworkspringbootapp.dto.EmployeeFullInfo(e.name, e.salary, p.position) FROM Employee e JOIN FETCH Position p WHERE e.position = p")
    List<EmployeeFullInfo>findAllEmployeeFullInfo();

    @Query(value = "SELECT * FROM employee WHERE salary = (SELECT max(salary) FROM employee e2)", nativeQuery = true)
    List<Employee> findEmployeeWithHighestSalary();

//    @Query(value = "SELECT e from Employee e WHERE e.position.position = :position")
    @Query(value = "SELECT e.id as said, name, salary, position_id, p.id, p.position FROM employee e INNER JOIN position p on p.id = e.position_id WHERE p.position = :position", nativeQuery = true)
    List<Employee> findAllByPosition(@Param("position") String position);



//    @Query(value = "SELECT * FROM employee", nativeQuery = true)
//    List<Employee> getAllEmployees();
//    int getEmployeeSalarySum();
//
//    Collection<Employee> getEmployeeSalaryMin();
//
//    Collection<Employee> getEmployeeSalaryMax();
//
//    Collection<Employee> getEmployeeSalaryHighAwg();
//
//    void deleteEmployee(int parseInt);
//
//    void editEmployeeById(Employee employee, Integer parseInt);
//
//    void addNewEmployee(Employee employee);
//
//    Employee getEmployeeById(int parseInt);
//
//    Collection<Employee> getEmployeeWithSalaryHigherThen(Integer compSalary);
}
