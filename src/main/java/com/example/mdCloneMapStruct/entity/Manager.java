package com.example.mdCloneMapStruct.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;

import java.util.List;

@Entity
public class Manager {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="Id")
    private int id;
    @NotEmpty(message = "first name can NOT be null or empty")
    private String firstName;
    @NotEmpty(message = "last name can NOT be null or empty")
    private String lastName;
    @OneToMany(mappedBy = "manager")
    @JsonManagedReference
    private List<Employee> employeeList;

    public Manager() {
    }

    public Manager(int id, String firstName, String lastName, List<Employee> employeeList) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeList = employeeList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", employeeList=" + employeeList +
                '}';
    }
}
