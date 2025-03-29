package com.example.mdCloneMapStruct.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;

import java.util.List;

public class ManagerDto {
    @JsonIgnore
    private int id;
    private String firstName;
    private String lastName;
    private List<EmployeeDto> employeeDtoList;

    public ManagerDto() {
    }

    public ManagerDto(int id, String firstName, String lastName, List<EmployeeDto> employeeDtoList) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeDtoList = employeeDtoList;
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

    public List<EmployeeDto> getEmployeeDtoList() {
        return employeeDtoList;
    }

    public void setEmployeeDtoList(List<EmployeeDto> employeeDtoList) {
        this.employeeDtoList = employeeDtoList;
    }

    @Override
    public String toString() {
        return "ManagerDto{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", employeeDtoList=" + employeeDtoList +
                '}';
    }
}
