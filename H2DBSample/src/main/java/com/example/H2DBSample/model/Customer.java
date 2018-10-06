package com.example.H2DBSample.model;

import java.util.Date;

public class Customer {

	private int custId;
	private String name;
	private Date dob;
	private String email;
	private String homePhone;
	private String cellPhone;

	public Customer() {

	}

	public Customer(String name, Date dob, String email, String homePhone, String cellPhone) {
		this.name = name;
		this.dob = dob;
		this.email = email;
		this.homePhone = homePhone;
		this.cellPhone = cellPhone;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public String getCellPhone() {
		return cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", name=" + name + ", dob=" + dob + ", email=" + email + ", homePhone="
				+ homePhone + ", cellPhone=" + cellPhone + "]";
	}
}
