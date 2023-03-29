package com.tns.exception;

public class DefaultDemo 
{
 public static void main(String[] args) 
 {
   String str=null;
   try
   {
	   str.equals("Hello");
	   System.out.println("Hello printed");
   }
   catch(NullPointerException Ne)
   {
	   System.out.println("Cannot print as there is a null poiner exception");
   }
   System.out.println("Exception handled");
 }
}
