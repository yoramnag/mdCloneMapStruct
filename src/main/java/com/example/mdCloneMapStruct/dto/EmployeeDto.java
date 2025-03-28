package com.example.mdCloneMapStruct.dto;

import java.util.List;

public class EmployeeDto {

    private String firstName;
    private String lastName;
    private String role;
    private List<TimesheetDto> timesheetDtos;
    private ManagerDto managerDto;

    public EmployeeDto() {
    }

    public EmployeeDto(String firstName, String lastName, String role, List<TimesheetDto> timesheetDtos, ManagerDto managerDto) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
        this.timesheetDtos = timesheetDtos;
        this.managerDto = managerDto;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<TimesheetDto> getTimesheetDtos() {
        return timesheetDtos;
    }

    public void setTimesheetDtos(List<TimesheetDto> timesheetDtos) {
        this.timesheetDtos = timesheetDtos;
    }

    public ManagerDto getManagerDto() {
        return managerDto;
    }

    public void setManagerDto(ManagerDto managerDto) {
        this.managerDto = managerDto;
    }

    @Override
    public String toString() {
        return "EmployeeDto{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", role='" + role + '\'' +
                ", timesheetDtos=" + timesheetDtos +
                ", managerDto=" + managerDto +
                '}';
    }
}
