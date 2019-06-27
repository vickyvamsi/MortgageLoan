package com.mortgageloan.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BankEmployee {
	@Id
	private Long offId;
	private String offName;
	private String offLevel;
	
	
	public BankEmployee() {
		super();
	}
	public Long getOffId() {
		return offId;
	}
	public void setOffId(Long offId) {
		this.offId = offId;
	}
	public String getOffName() {
		return offName;
	}
	public void setOffName(String offName) {
		this.offName = offName;
	}
	public String getOffLevel() {
		return offLevel;
	}
	public void setOffLevel(String offLevel) {
		this.offLevel = offLevel;
	}
	@Override
	public String toString() {
		return "OfficerDetails [offId=" + offId + ", offName=" + offName + ", offLevel=" + offLevel + "]";
	}
	
}
