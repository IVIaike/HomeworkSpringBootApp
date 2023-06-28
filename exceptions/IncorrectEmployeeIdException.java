package ru.trainingwork.homeworkspringbootapp.exceptions;

import java.util.NoSuchElementException;
import java.util.function.Supplier;
public class IncorrectEmployeeIdException extends NoSuchElementException {

    public IncorrectEmployeeIdException(int id) {
    }
}