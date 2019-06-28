package com.mortgageloan.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Mort_Loan_Details")
public class Loan {
	@Id
	private Long loanNum;
	private String loanStatus;
	private double loanAmount;
	private double securityAmount;
	@OneToOne
	private Customer customer;
	@OneToOne
	private BankEmployee bankEmployee;
	public Long getLoanNum() {
		return loanNum;
	}
	public void setLoanNum(Long loanNum) {
		this.loanNum = loanNum;
	}
	public String getLoanStatus() {
		return loanStatus;
	}
	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public double getSecurityAmount() {
		return securityAmount;
	}
	public void setSecurityAmount(double securityAmount) {
		this.securityAmount = securityAmount;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public BankEmployee getBankEmployee() {
		return bankEmployee;
	}
	public void setBankEmployee(BankEmployee bankEmployee) {
		this.bankEmployee = bankEmployee;
	}
	@Override
	public String toString() {
		return "LoanDetails [loanNum=" + loanNum + ", loanStatus=" + loanStatus + ", loanAmount=" + loanAmount
				+ ", securityAmount=" + securityAmount + "]";
	}


}
