package com.example.mdCloneMapStruct.dto;

import lombok.Getter;

import java.util.List;

@Getter
public class ManagerDto {
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

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
