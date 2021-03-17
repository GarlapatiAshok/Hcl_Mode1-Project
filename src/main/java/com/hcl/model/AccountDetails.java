/*HARDCODED BY GARLAPATI ASHOK*/
package com.hcl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ACCOUNTDETAILS")
public class AccountDetails {

	@Id
	@Column(name="CUSTOMERID")
	private Long customerId;
	@Column(name="ACCNUM")
	private Long accnum;
	@Column(name="BRANCHNAME")
	private String branchName;
	@Column(name="IFSCCODE")
	private String ifscCode;
	@Column(name="ACCTYPE")
	private String accType;
	@Column(name="ACCBAL")
	private Double accBal;
	
	
	public AccountDetails() {
		super();
	}


	public AccountDetails(Long customerId, Long accnum, String branchName, String ifscCode, String accType,
			Double accBal) {
		super();
		this.customerId = customerId;
		this.accnum = accnum;
		this.branchName = branchName;
		this.ifscCode = ifscCode;
		this.accType = accType;
		this.accBal = accBal;
	}


	public Long getCustomerId() {
		return customerId;
	}


	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}


	public Long getAccnum() {
		return accnum;
	}


	public void setAccnum(Long accnum) {
		this.accnum = accnum;
	}


	public String getBranchName() {
		return branchName;
	}


	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}


	public String getIfscCode() {
		return ifscCode;
	}


	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}


	public String getAccType() {
		return accType;
	}


	public void setAccType(String accType) {
		this.accType = accType;
	}


	public Double getAccBal() {
		return accBal;
	}


	public void setAccBal(Double accBal) {
		this.accBal = accBal;
	}


	@Override
	public String toString() {
		return "AccountDetails [customerId=" + customerId + ", accnum=" + accnum + ", branchName=" + branchName
				+ ", ifscCode=" + ifscCode + ", accType=" + accType + ", accBal=" + accBal + "]";
	}


	
}
