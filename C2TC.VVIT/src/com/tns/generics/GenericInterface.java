package com.tns.generics;

public interface GenericInterface<T> 
{
  public T Demo();
}

class MyFirstGeneric implements GenericInterface<String>
{
	@Override
	public String Demo() 
	{
		return "Hello world";
	}
}
class MySecondGeneric implements GenericInterface<Integer>
{

	@Override
	public Integer Demo() 
	{
		return 20;
	}
}
