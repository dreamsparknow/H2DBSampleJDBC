package com.example.H2DBSample.persistence.service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.example.H2DBSample.Connection.MyConnection;
import com.example.H2DBSample.model.Address;
import com.example.H2DBSample.model.Customer;

public class MyPersistenceService {

	private static MyPersistenceService instance = null;

	public static MyPersistenceService getInstance() throws SQLException {
		if (instance == null)
			instance = new MyPersistenceService();

		return instance;
	}

	public int insertCustomer(Customer customer) throws SQLException {
		String insertSql = "INSERT INTO Customer(name, dob, email,homephone, cellphone) VALUES(?,?,?,?,?)";
		int rs;
		Connection con = MyConnection.getInstance();
		PreparedStatement ps = con.prepareStatement(insertSql);

		ps.setString(1, customer.getName());
		ps.setDate(2, (Date) customer.getDob());
		ps.setString(3, customer.getEmail());
		ps.setString(4, customer.getHomePhone());
		ps.setString(5, customer.getCellPhone());
		
		rs = ps.executeUpdate();
		return rs;

	}

	public int insertAddress(Address address) throws SQLException {
		String insertSql = "INSERT INTO Address(street, city, zipcode) VALUES(?,?,?)";
		Long generatedKey = null;

		Connection con = MyConnection.getInstance();
		PreparedStatement ps = con.prepareStatement(insertSql);

		ps.setString(1, address.getStreet());
		ps.setString(2, address.getCity());
		ps.setString(3, address.getZipCode());
		int rs = ps.executeUpdate();
		

		return rs;

	}

	public List<Customer> getAllCustomer() throws SQLException {
		String query = "SELECT * FROM customer";
		List<Customer> customerList = new ArrayList<Customer>();

		Connection con = MyConnection.getInstance();
		Statement st1 = con.createStatement();
		ResultSet rs = st1.executeQuery(query);

		while (rs.next()) {
			Customer customer = new Customer();
			customer.setCustId(rs.getInt("custId"));
			customer.setName(rs.getString("name"));
			customer.setDob(rs.getDate("dob"));
			customer.setEmail(rs.getString("email"));
			customer.setHomePhone(rs.getString("homephone"));
			customer.setCellPhone(rs.getString("cellphone"));

			customerList.add(customer);
		}

		return customerList;
	}

	public List<Address> getAllAddresses() throws SQLException {
		String query = "SELECT * FROM address";
		List<Address> addressList = new ArrayList<Address>();

		Connection con = MyConnection.getInstance();
		Statement st1 = con.createStatement();
		ResultSet rs = st1.executeQuery(query);

		while (rs.next()) {
			Address address = new Address();
			address.setAddressId(rs.getInt("addressId"));
			address.setStreet(rs.getString("street"));
			address.setCity(rs.getString("city"));
			address.setZipCode(rs.getString("zipcode"));
			
			addressList.add(address);
		}

		return addressList;
	}

}
