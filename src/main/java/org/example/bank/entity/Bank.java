package org.example.bank.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "bank")
public class Bank {
    @Id
    @Column(name = "bank_id")
    private String bank_id;
    @Column(name = "bank_name")
    private String bank_name;
    @OneToMany(mappedBy = "bank", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<BankBranch> bankBranchList;
}
