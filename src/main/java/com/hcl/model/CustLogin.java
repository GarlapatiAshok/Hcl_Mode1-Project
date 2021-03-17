/*HARDCODED BY GARLAPATI ASHOK*/
package com.hcl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CustLogin")
public class CustLogin {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="custloginid")
	private Long custloginid;
	@Column(name="password")
	private String password;
	
	
	public CustLogin() {
		super();
	}


	public CustLogin(int id, Long custloginid, String password) {
		super();
		this.id = id;
		this.custloginid = custloginid;
		this.password = password;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Long getCustloginid() {
		return custloginid;
	}


	public void setCustloginid(Long custloginid) {
		this.custloginid = custloginid;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "CustLogin [id=" + id + ", custloginid=" + custloginid + ", password=" + password + "]";
	}
	
	
}
