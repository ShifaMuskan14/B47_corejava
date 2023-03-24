package com.tns.staticprogram;

public class EmployeeExecutor 
{
  public static void main(String[] args) 
  {
	Employee ob1=new Employee();
	System.out.println(Employee.companyName);
	Employee ob=new Employee("Shifa",123);
	System.out.println(ob);
	
	Employee ob2=new Employee();
	System.out.println(Employee.companyName);
	ob=new Employee("Muskan",456);
	System.out.println(ob);
  }
}
