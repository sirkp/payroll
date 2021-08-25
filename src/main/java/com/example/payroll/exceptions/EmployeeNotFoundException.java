package com.example.payroll.exceptions;

public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(Long id) {
        super("could not find Employee with id: " + id);
    }
}
