package com.tns.jdbcprog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
		         // Step 1: Allocate a database 'Connection' object
				 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_c2tc","root", "Shifa@2001");  // for MySQL only
		 
		         // Step 2: Allocate a 'Statement' object in the Connection
		         Statement stmt = conn.createStatement();
		     
		         // Step 3 & 4: Execute a SQL INSERT|DELETE statement via executeUpdate(),
		         //   which returns an int indicating the number of rows affected.
		 
//		         // DELETE records with id>=3000 and id<4000
//		         String sqlDelete = "delete from books where id >= 3000 and id < 4000";
//		         System.out.println("The SQL statement is: " + sqlDelete + "\n");  // Echo for debugging
//		         int countDeleted = stmt.executeUpdate(sqlDelete);
//		         System.out.println(countDeleted + " records deleted.\n");
		 
		         // INSERT a record
		         String sqlInsert = "insert into books values (100, 'A Wanted Man', 300, 11,'Lee Child')";
		         System.out.println("The SQL statement is: " + sqlInsert + "\n");  // Echo for debugging
		         int a = stmt.executeUpdate(sqlInsert);
		         System.out.println(a + " records inserted.\n");
		 
//		         // INSERT multiple records
//		         sqlInsert = "insert into books values "
//		               + "(3002, 'Gone Fishing 2', 'Kumar', 22.22, 22),"
//		               + "(3003, 'Gone Fishing 3', 'Kumar', 33.33, 33)";
//		         System.out.println("The SQL statement is: " + sqlInsert + "\n");  // Echo for debugging
//		         countInserted = stmt.executeUpdate(sqlInsert);
//		         System.out.println(countInserted + " records inserted.\n");
//		 
//		         // INSERT a partial record
//		         sqlInsert = "insert into books (id, title, author) values (3004, 'Fishing 101', 'Kumar')";
//		         System.out.println("The SQL statement is: " + sqlInsert + "\n");  // Echo for debugging
//		         countInserted = stmt.executeUpdate(sqlInsert);
//		         System.out.println(countInserted + " records inserted.\n");
		 
		         // Step 3 & 4: Issue a SELECT (via executeQuery()) to check the changes
		         String strSelect = "select * from books";
		         System.out.println("The SQL statement is: " + strSelect + "\n");  // Echo For debugging
		         ResultSet rset = stmt.executeQuery(strSelect);
		         while(rset.next()) 
		         {   // Move the cursor to the next row
		            System.out.println(rset.getInt("book_id") + ", "
		                    + rset.getString("title") + ", "
		                    + rset.getDouble("price") + ", "
		                    + rset.getInt("quantity") + ", "
		                    + rset.getString("author"));
		         }
		      } 
		      catch(SQLException ex) 
		        {
		         ex.printStackTrace();
		         }  // Step 5: Close conn and stmt - Done automatically by try-with-resources
		   }

	}