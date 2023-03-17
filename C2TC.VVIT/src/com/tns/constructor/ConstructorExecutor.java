package com.tns.constructor;

import java.util.Scanner;

public class ConstructorExecutor 
{
  public static void main(String[] args) 
  {
	Scanner sc=new Scanner(System.in);
	String name,city;
	int id;
	
	System.out.println("Enter customer name: ");
	name=sc.nextLine();
	
	System.out.println("Enter customer id: ");
	id=sc.nextInt();
	
	System.out.println("Enter customer city: ");
	city=sc.next();
		
	Customer ob=new Customer();
	ob.setCustomerName(name);
	ob.setCustomerId(id);
	ob.setCustomerCity(city);
	
	System.out.println(name+ " " +id+" "+city);
  }
}
