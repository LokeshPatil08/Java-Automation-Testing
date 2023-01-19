package com.argument.practice;

public class ArgumentMethod {

	public static void main(String[] args)
	{
		System.out.println("start");
//		Access_specifier return_type method_name(){}
		ArgumentMethod obj = new ArgumentMethod();
		obj.addition();
		
		obj.addition(30, 40);
		System.out.println("end");
	}
	public void addition()
	{
		int a=10, b=20;
		int sum= a+b;
		System.out.println("sum="+sum);
//		return; by default hidden
	}
	public void addition(int a , int b)
	{
		int sum=a+b;
		System.out.println("sum ="+sum);
	}

}
