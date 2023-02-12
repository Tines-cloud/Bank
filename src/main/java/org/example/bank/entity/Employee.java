package org.example.bank.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employee")
public class Employee {
    @Id
    @Column(name = "emp_id")
    private String empId;
    @Column(name = "emp_name")
    private String empName;
    @Column(name = "emp_phone")
    private String empEmail;
    @Column(name = "emp_email")
    private String empPhoto;
    @Column(name = "emp_address")
    private String empAddress;
    @Column(name = "emp_password")
    private String empPassword;
    @ManyToOne
    @JoinColumn(name = "branch_id")
    private BankBranch bankBranch;
}
