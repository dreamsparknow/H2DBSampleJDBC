package com.example.H2DBSample.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
	
     private static Connection instance = null; 	  
   	
   	   public static Connection getInstance() throws SQLException 
   	    { 
   	        if (instance == null) 
   	            instance = DriverManager.getConnection("jdbc:h2:~/test", "sa","");
   	  
   	        return  instance; 
   	    } 
	
}
