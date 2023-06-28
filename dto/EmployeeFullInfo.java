package ru.trainingwork.homeworkspringbootapp.dto;

import lombok.Data;

@Data
public class EmployeeFullInfo {
    private String name;
    private Integer salary;
    private String position;

    public EmployeeFullInfo(String name, Integer salary, String position) {
        this.name = name;
        this.salary = salary;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
