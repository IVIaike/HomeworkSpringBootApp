package ru.trainingwork.homeworkspringbootapp.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor 
public class Employee {

    private Integer id;
    private String name;
    private int salary;

}
