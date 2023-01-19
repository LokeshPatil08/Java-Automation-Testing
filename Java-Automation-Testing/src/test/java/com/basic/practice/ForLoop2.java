package com.basic.practice;

public class ForLoop2 
{
	public void increament()
	{
		for(char x = 'A'; x<='Z'; x++) 
		{
			System.out.println(x);
		}
	}
	public void decreament() 
	{
		for(char y = 'Z'; y>='A'; y--) 
		{
			System.out.println(y);
		}
		
	}
	public static void main(String[] args) 
	{
		ForLoop2 xyz = new ForLoop2();
		System.out.println("increament");
		xyz.increament();
		System.out.println("decreament");
		xyz.decreament();
	 }
}

	