package com.mortgageloan.service;

import com.mortgageloan.entity.BankEmployee;
import com.mortgageloan.entity.Customer;
import com.mortgageloan.entity.ResponseDto;
import com.mortgageloan.exception.MortgageLoanException;

public interface MortgageLoanService {
	
	public Customer createMortgageLoan(Customer  customer);
	
	public Customer getDetailsById(Long custId);
	
	public ResponseDto approvedLoan(Long loanNum,Long offId)throws MortgageLoanException ;
	
	public BankEmployee createEmp(BankEmployee bankEmployee);
	
}
