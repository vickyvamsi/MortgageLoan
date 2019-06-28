package com.mortgageloan.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mortgageloan.entity.BankEmployee;
import com.mortgageloan.entity.Customer;
import com.mortgageloan.entity.Loan;
import com.mortgageloan.entity.ResponseDto;
import com.mortgageloan.exception.MortgageLoanException;
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

	
	 

	@Override
	public ResponseDto approvedLoan(Long loanNum,Long offId)throws MortgageLoanException {

		Optional<Loan> loan=loanRepo.findById(loanNum);
		Loan loans= loan.get();
		Long appliedId=loans.getCustomer().getCustId();
		Customer cust=customerRepo.findById(appliedId).get();
		BankEmployee bankEmployee=bankEmployeeRepo.findById(offId).get();

		if(bankEmployee.getOffLevel().equalsIgnoreCase("officer")) {

			if(cust.getCustAge()>=24 && cust.getCustAge()<60) {
				if(cust.getCustMaritalSatus().equalsIgnoreCase("married")) {
					if(cust.getCustAge()>24 && cust.getCustAge()<29) {
						throw new MortgageLoanException("Customer (Married) Age Criteria Not Matched");
					}
				}

				if(cust.getCustCreditScore()>=600) {
					if(loans.getLoanAmount()*2 <= loans.getSecurityAmount()) {
						loans.setLoanStatus("approved");
						loans.setBankEmployee(bankEmployee);
						loanRepo.save(loans);
					}
					else {
						throw new MortgageLoanException("loan Security Amount Should Be Double");
					}

				}
				else
				{
					throw new MortgageLoanException("Customer Creadit Score Is Less 600");
				}
			}
			else
			{
				throw new MortgageLoanException("Customer Age Criteria Not Matched");
			}

		}
		else {
			throw new MortgageLoanException("Officer Only Can Approve The Loan");
		}
		return new ResponseDto("Loan Approved Sucessful");
	}

	@Override
	public BankEmployee createEmp(BankEmployee bankEmployee) {
		return bankEmployeeRepo.save(bankEmployee);
	}




	@Override
	public Customer getDetailsById(Long custId) {
		
		return customerRepo.findById(custId).get();
	}



}
