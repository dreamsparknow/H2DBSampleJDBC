package com.example.H2DBSample.model;

public class Address {
	
	private int addressId;	
	private String street;
	private String city;
	private String zipCode;
	
	public Address(){
		
	}
	
	public Address(String street, String city , String zipcode){
		this.street = street;
		this.city = city;
		this.zipCode = zipcode;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", street=" + street + ", city=" + city + ", zipCode=" + zipCode
				+ "]";
	}		
}
