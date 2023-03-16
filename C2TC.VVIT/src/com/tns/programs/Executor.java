package com.tns.programs;

public class Executor 
{
  public static void main(String[] args) 
  {
	CarClass ob=new CarClass();    //creation of object
	ob.forward();   //calling member function of the CarClass
	ob.backward();
	ob.stop();
	
	System.out.println("reg is "+ob.reg);
	System.out.println("amount is "+ob.amount);
  }
}
