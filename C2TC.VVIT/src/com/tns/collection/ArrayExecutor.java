package com.tns.collection;

import java.util.ArrayList;

public class ArrayExecutor 
{
  public static void main(String[] args) 
  {
	//Creating an ArrayList
	ArrayList<String> vvit=new ArrayList<String>();
	System.out.println(vvit);   //displaying the ArrayList
	vvit.add("Shifa");
	vvit.add("Moufeeka");
	vvit.add(null);
	vvit.add("Iqra");
	System.out.println(vvit);
	vvit.remove(1);
	System.out.println(vvit);
  }
}
