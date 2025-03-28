package com.example.mdCloneMapStruct.dto;

import com.example.mdCloneMapStruct.utils.ApprovalStatus;

import java.time.LocalDate;
import java.util.Date;


public class TimesheetDto {

    private int id;
    private LocalDate date;
    private Date startDate;
    private Date endDate;
    private ApprovalStatus approvalStatus;
    private EmployeeDto employeeDto;

    public TimesheetDto() {
    }

    public TimesheetDto(int id, LocalDate date, Date startDate, Date endDate, ApprovalStatus approvalStatus, EmployeeDto employeeDto) {
        this.id = id;
        this.date = date;
        this.startDate = startDate;
        this.endDate = endDate;
        this.approvalStatus = approvalStatus;
        this.employeeDto = employeeDto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public ApprovalStatus getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(ApprovalStatus approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public EmployeeDto getEmployeeDto() {
        return employeeDto;
    }

    public void setEmployeeDto(EmployeeDto employeeDto) {
        this.employeeDto = employeeDto;
    }

    @Override
    public String toString() {
        return "TimesheetDto{" +
                "id=" + id +
                ", date=" + date +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", approvalStatus=" + approvalStatus +
                ", employeeDto=" + employeeDto +
                '}';
    }
}
