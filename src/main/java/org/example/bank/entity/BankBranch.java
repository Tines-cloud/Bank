package org.example.bank.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "bank_branch")
public class BankBranch {
    @Id
    @Column(name = "branch_id")
    private String branch_id;
    @Column(name = "branch_name")
    private String branch_name;
    @Column(name = "branch_address")
    private String branch_address;
    @ManyToOne
    @JoinColumn(name = "bank_id")
    private Bank bank;

    @OneToMany(mappedBy = "bankBranch", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Employee> employeeList;
}
