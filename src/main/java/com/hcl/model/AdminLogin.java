/*HARDCODED BY GARLAPATI ASHOK*/
package com.hcl.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "adminlogin")
public class AdminLogin implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@Column(name = "adminuserid")
	private String adminUserId;
	@Column(name = "password")
	private String password;

	public AdminLogin() {
		super();
	}

	public AdminLogin(int id, String adminUserId, String password) {
		super();
		this.id = id;
		this.adminUserId = adminUserId;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdminUserId() {
		return adminUserId;
	}

	public void setAdminUserId(String adminUserId) {
		this.adminUserId = adminUserId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "AdminLogin [id=" + id + ", adminUserId=" + adminUserId + ", password=" + password + "]";
	}
}
