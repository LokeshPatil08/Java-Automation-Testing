package com.basic.practice;

public class ForEvenOddNo 
{
	public static void main(String[] args) 
	{
		System.out.println("even number");
		for(int a= 1; a<=40; a++ )
		{
			if(a%2==0)
			{
				System.out.println(+a);
			}
		}
		System.out.println("odd numbers");
		for(int a=1; a<=40; a++)
		{
			if(!(a%2==0))
			{
				System.out.println(+a);
			}
		}
		
	}

}
