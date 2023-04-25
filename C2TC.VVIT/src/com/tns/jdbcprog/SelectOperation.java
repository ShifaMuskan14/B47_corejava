package com.tns.jdbcprog;

import java.sql.*;
import javax.sql.*;
import java.sql.DriverManager;

@SuppressWarnings("unused")
public class SelectOperation 
{
	public static void main(String[] args) 
	{
		try 
		{
		//establish connection
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_c2tc","root","Shifa@2001");
		
		//create statement	
		Statement st=conn.createStatement();
		
		//write the query
		String str="select book_id,title,price,quantity from book";
		System.out.println("the sql Statement is "+str+"\n");
		
		//execute the query
		ResultSet rst=st.executeQuery(str);
		
		System.out.println("the records are");
		int rowCount=0;
		while(rst.next())
		{
               int book_id=rst.getInt("book_id");
		       String title=rst.getString("title");
		       int price=rst.getInt("price");
		       int quantity=rst.getInt("quantity");
		       System.out.println(book_id+" , "+title+" ,"+ price+ " ," + quantity);
		       ++rowCount;
		}
		}
		catch(SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
