package com.string.practice;

public class EqualAndEqualToOperater {
	public void ac()
	{
		String city1 = "pune";
		String city2 = "pune";
		String city3 = new String("pune");
		
		if(city1.equals(city3))
		{
			System.out.println("1&3 matching");
		}else {
			System.out.println("1&3 not matching");
		}
		if(city1==city3)
		{
			System.out.println("1&3 is matching");
		}else {
			System.out.println("1&3 is not matching");
		}
		city1 = "mumbai";
		System.out.println(city1);
		System.out.println(city2);
		if(city1.contentEquals(city2))
		{
			System.out.println("matching");
		}else {
			System.out.println("not matching");
		}
		if(city1==city2)
		{
			System.out.println("is matching");
		}else {
			System.out.println("is not matching");
		}
	}

	public static void main(String[] args) {
		EqualAndEqualToOperater obj = new EqualAndEqualToOperater();
		obj.ac();
		
	}

}
