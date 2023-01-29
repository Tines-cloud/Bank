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
    private String emp_id;
    @Column(name = "emp_name")
    private String emp_name;
    @Column(name = "emp_phone")
    private String emp_email;
    @Column(name = "emp_email")
    private String emp_photo;
    @Column(name = "emp_address")
    private String emp_address;
    @Column(name = "emp_password")
    private String emp_password;
    @ManyToOne
    @JoinColumn(name = "branch_id")
    private BankBranch bankBranch;
}
