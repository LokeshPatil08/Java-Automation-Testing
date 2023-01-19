package com.typecasting.practice;

public class ToStringMethod {
	int a,b;
	public static void main(String[] args) {
		ToStringMethod obj = new ToStringMethod();
		System.out.println(obj);//by default toString is hidden.
		System.out.println(obj.toString());
	}
	public String toString()
	{
		System.out.println("hello");
		System.out.println("hi");
		a=10;
		b=20;
		return " ";
	}

}
