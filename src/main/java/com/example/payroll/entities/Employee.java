package com.example.payroll.entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Employee {
    
    @Id @GeneratedValue private Long id;
    private String name;
    private String role;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if(!(obj instanceof Employee)) return false;

        Employee employee = (Employee) obj;
        return (Objects.equals(this.id, employee.id)
                && Objects.equals(this.name, employee.name)
                && Objects.equals(this.role, employee.role));
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name, this.role);
    }

    @Override
    public String toString() {
        return "Employee{\n   id: " + this.id + "\n   name: " + this.name
                + "\n   role: " + this.role + "\n}";
    }


}
