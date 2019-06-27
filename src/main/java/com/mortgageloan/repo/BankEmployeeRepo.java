package com.mortgageloan.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mortgageloan.entity.BankEmployee;

public interface BankEmployeeRepo extends JpaRepository<BankEmployee, Long>{

}
