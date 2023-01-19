package com.basic.practice;

public class SwappingOfTwoNumber {
	public static void main(String[] args)
	{
		int a = 10;
		int b = 20;
		int temp;
		
		System.out.println("before");
		System.out.println("a="+a);
		System.out.println("b="+b);
		          //logic by different method
		temp=a;   // a=a+b;  a=10-20=30
		a=b;      // b=a-b;  b=30-20=10
		b=temp;   // a=a-b;  a=30-10=20
		
		System.out.println("after");
		System.out.println("a="+a);
		System.out.println("b="+b);
		
	}
	
	

}
