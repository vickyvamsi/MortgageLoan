package com.mortgageloan.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="Mort_cust_details")
public class Customer {
	
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Id
	private Long custId;
	private String custName;
	private String custMob;
	private int custAge;
	private String custGen;
	private String custMaritalSatus;
	private int custCreditScore;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Loan loan;
	
	
	public Customer() {
		super();
	}
	public Long getCustId() {
		return custId;
	}
	public void setCustId(Long custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustMob() {
		return custMob;
	}
	public void setCustMob(String custMob) {
		this.custMob = custMob;
	}
	public int getCustAge() {
		return custAge;
	}
	public void setCustAge(int custAge) {
		this.custAge = custAge;
	}
	public String getCustGen() {
		return custGen;
	}
	public void setCustGen(String custGen) {
		this.custGen = custGen;
	}
	public String getCustMaritalSatus() {
		return custMaritalSatus;
	}
	public void setCustMaritalSatus(String custMaritalSatus) {
		this.custMaritalSatus = custMaritalSatus;
	}
	public int getCustCreditScore() {
		return custCreditScore;
	}
	public void setCustCreditScore(int custCreditScore) {
		this.custCreditScore = custCreditScore;
	}
	
	
	public Loan getLoan() {
		return loan;
	}
	public void setLoan(Loan loan) {
		this.loan = loan;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custMob=" + custMob + ", custAge=" + custAge
				+ ", custGen=" + custGen + ", custMaritalSatus=" + custMaritalSatus + ", custCreditScore="
				+ custCreditScore + "]";
	}
	
	

}
