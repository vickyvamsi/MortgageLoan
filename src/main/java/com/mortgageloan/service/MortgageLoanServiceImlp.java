package com.mortgageloan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mortgageloan.entity.Customer;
import com.mortgageloan.repo.BankEmployeeRepo;
import com.mortgageloan.repo.CustomerRepo;
import com.mortgageloan.repo.LoanRepo;
@Service
public class MortgageLoanServiceImlp implements MortgageLoanService {
	@Autowired
	LoanRepo loanRepo;
	@Autowired
	CustomerRepo customerRepo;
	@Autowired
	BankEmployeeRepo bankEmployeeRepo;
	
	@Override
	public Customer createMortgageLoan(Customer customer) {
		return customerRepo.save(customer);
	}
	
	
}
