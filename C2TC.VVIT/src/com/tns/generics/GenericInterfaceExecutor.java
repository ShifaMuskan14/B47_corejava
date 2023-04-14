package com.tns.generics;

public class GenericInterfaceExecutor 
{
  public static void main(String[] args) 
  {
	  MyFirstGeneric f=new MyFirstGeneric();
	  MySecondGeneric s=new MySecondGeneric();
	  
	  System.out.println(f.Demo());
	  System.out.println(s.Demo());
  }
}
