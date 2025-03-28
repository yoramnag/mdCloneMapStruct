package com.example.mdCloneMapStruct.entity;

import com.example.mdCloneMapStruct.utils.ApprovalStatus;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;
import java.util.Date;

@Entity
public class Timesheet {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @CreatedDate
    private LocalDate date;

    @NotEmpty(message = "start date can NOT be null or empty")
    private Date startDate;

    @NotEmpty(message = "end date can NOT be null or empty")
    private Date endDate;

    @Enumerated(EnumType.STRING)
    @Column(name="status")
    private ApprovalStatus approvalStatus;

    @ManyToOne(cascade= {CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "employee_id")
    @JsonBackReference
    @NotEmpty(message = "employee can NOT be null or empty")
    private Employee employee;

    public Timesheet() {
    }

    public Timesheet(int id, LocalDate date, Date startDate, Date endDate, ApprovalStatus approvalStatus, Employee employee) {
        this.id = id;
        this.date = date;
        this.startDate = startDate;
        this.endDate = endDate;
        this.approvalStatus = approvalStatus;
        this.employee = employee;
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

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Timesheet{" +
                "id=" + id +
                ", date=" + date +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", approvalStatus=" + approvalStatus +
                ", employee=" + employee +
                '}';
    }
}
