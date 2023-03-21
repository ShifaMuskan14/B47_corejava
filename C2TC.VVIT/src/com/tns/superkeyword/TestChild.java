package com.tns.superkeyword;

class TestParent
{
	public void test()
	{
		System.out.println("This is a parent class");
	}
}
public class TestChild extends TestParent
{
  public void test()
  {
	  System.out.println("This is a child calss test");
  }
  void display()
  {
	  //test();
	  super.test();
  }
}
