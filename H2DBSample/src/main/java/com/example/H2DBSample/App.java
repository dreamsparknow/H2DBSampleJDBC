package com.example.H2DBSample;

import java.sql.SQLException;
import java.util.List;

import com.example.H2DBSample.model.Address;
import com.example.H2DBSample.model.Customer;
import com.example.H2DBSample.persistence.service.MyPersistenceService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
    	 	
    	List<Customer> custList = MyPersistenceService.getInstance().getAllCustomer();
    	for(Customer c: custList){
    		System.out.println(c.toString());
    	}
    	
    	Address address =  new Address("Test Street", "Test City", "12345");
    	MyPersistenceService.getInstance().insertAddress(address);
    	
    	List<Address> addList = MyPersistenceService.getInstance().getAllAddresses();
    	for(Address add :addList){
    		System.out.println(add.toString());
    	}
    	
    }
}
