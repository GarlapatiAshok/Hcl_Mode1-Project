/*HARDCODED BY GARLAPATI ASHOK*/
package com.hcl.service;

public interface AccountRegService {
	public void register(String name, String fatherName, String gender, String address, String dob,String mobilenumber, String email,
			String pan, String aadhar, String password);
	
	public void accInsrt();
	
	public void passInsrt();
	
	public void custInsrt();
}
