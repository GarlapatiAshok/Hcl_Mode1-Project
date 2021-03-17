/*HARDCODED BY GARLAPATI ASHOK*/
package com.hcl.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CUSTTRANSACTION")
public class CustTxn {

	@Id
	@Column(name="TXNID")
	private int txnId;
	@Column(name="TXNDTTM")
	private Timestamp txnDttm;
	@Column(name="ACCNUM")
	private Long accNum;
	@Column(name="DESCRIPTION")
	private Long description;
	@Column(name="WITHDRAWL")
	private Double withdrawl;
	@Column(name="DEPOSIT")
	private Double deposit;
	@Column(name="ACCBAL")
	private Double accBal;
	@Column(name="REMARKS")
	private String remarks;
	@Column(name="TXNTYPE")
	private String txnType;
	
	
	public CustTxn() {
		super();
	}


	public CustTxn(int txnId, Timestamp txnDttm, Long accNum, Long description, Double withdrawl, Double deposit,
			Double accBal, String remarks, String txnType) {
		super();
		this.txnId = txnId;
		this.txnDttm = txnDttm;
		this.accNum = accNum;
		this.description = description;
		this.withdrawl = withdrawl;
		this.deposit = deposit;
		this.accBal = accBal;
		this.remarks = remarks;
		this.txnType = txnType;
	}


	public int getTxnId() {
		return txnId;
	}


	public void setTxnId(int txnId) {
		this.txnId = txnId;
	}


	public Timestamp getTxnDttm() {
		return txnDttm;
	}


	public void setTxnDttm(Timestamp txnDttm) {
		this.txnDttm = txnDttm;
	}


	public Long getAccNum() {
		return accNum;
	}


	public void setAccNum(Long accNum) {
		this.accNum = accNum;
	}


	public Long getDescription() {
		return description;
	}


	public void setDescription(Long description) {
		this.description = description;
	}


	public Double getWithdrawl() {
		return withdrawl;
	}


	public void setWithdrawl(Double withdrawl) {
		this.withdrawl = withdrawl;
	}


	public Double getDeposit() {
		return deposit;
	}


	public void setDeposit(Double deposit) {
		this.deposit = deposit;
	}


	public Double getAccBal() {
		return accBal;
	}


	public void setAccBal(Double accBal) {
		this.accBal = accBal;
	}


	public String getRemarks() {
		return remarks;
	}


	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}


	public String getTxnType() {
		return txnType;
	}


	public void setTxnType(String txnType) {
		this.txnType = txnType;
	}


	@Override
	public String toString() {
		return "CustTxn [txnId=" + txnId + ", txnDttm=" + txnDttm + ", accNum=" + accNum + ", description="
				+ description + ", withdrawl=" + withdrawl + ", deposit=" + deposit + ", accBal=" + accBal
				+ ", remarks=" + remarks + ", txnType=" + txnType + "]";
	}
	
	
	
}
