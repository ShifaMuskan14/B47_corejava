package com.tns.collection;

import java.util.ArrayList;

public class Generics 
{
public static void main(String[] args) 
{
	ArrayList list=new ArrayList();
	list.add("java");
	list.add(123);
	for(Object ob:list)
	{
		//String str=(String) ob; //typecasting
		System.out.println(ob);
	}
}
}
