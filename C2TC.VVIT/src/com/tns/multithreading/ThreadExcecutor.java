package com.tns.multithreading;

public class ThreadExcecutor 
{
  public static void main(String[] args) 
  {
	CreatingThreadOne t=new CreatingThreadOne();  //new State
	t.start();  //implicitly calls run method
	t.run();   //explicitly calls run method
  }
}
