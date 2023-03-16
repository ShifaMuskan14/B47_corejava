package com.tns.programs;

public class Executor 
{
  public static void main(String[] args) 
  {
	CarClass ob=new CarClass();    //creation of object
	ob.forward();   //calling member function of the carclass
	ob.backward();
	ob.stop();
	
  }
}
