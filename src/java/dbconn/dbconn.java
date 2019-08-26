/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconn;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;

/**
 *
 * @author Shalini
 */
public class dbconn {
    
    public static Connection connect(){
	Connection conn=null;
	
	try 
	{
		Class.forName("com.mysql.jdbc.Driver");
		 
               conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ruvinidb","root","");
		 
		Statement st=conn.createStatement();
                
                
                  String query ="INSERT INTO `ooo`(`quantity`) VALUES (quan)";
                  
                  
	 //  String sql= "create table customer(ID varchar(10),FirstName varchar(20),LastName varchar(60),DOB varchar(30),Gender varchar(10),Region varchar(20),TelNo varchar(30))";
	
	st.executeUpdate(query);
		System.out.println("Data added succesfully");
	}
	
	catch(Exception e)
	{
		System.out.println(e);
	}
	return conn;
	
	
}
    
}
