package com.mortgageloan.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mortgageloan.entity.Loan;

public interface LoanRepo extends JpaRepository<Loan, Long>{

}
