package org.example.bank.repository;

import org.example.bank.entity.BankBranch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BankBranchRepository extends JpaRepository<BankBranch, String>, JpaSpecificationExecutor<BankBranch> {
}