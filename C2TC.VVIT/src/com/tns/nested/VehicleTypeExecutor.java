package com.tns.nested;

public class VehicleTypeExecutor 
{
	public static void main(String[] args) 
	{
		Bus b=new Bus();
		System.out.println(b.getNoofWheels());
		
		Scooter s=new Scooter();
		System.out.println(s.getNoofWheels());
	}
}
