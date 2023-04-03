package com.tns.multithreading;

public class ThreadExcecutor 
{
  public static void main(String[] args) 
  {
	CreatingThreadOne t=new CreatingThreadOne();  //new State
	t.start();
	t.run();
  }
}
