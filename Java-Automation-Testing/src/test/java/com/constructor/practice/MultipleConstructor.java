package com.constructor.practice;

public class MultipleConstructor {
	public MultipleConstructor()
	{      //default
		this(50, 100.22f);  //it should be always 1st statement
		System.out.println("default");	
	}
	public MultipleConstructor(int a)   //parameterized
	{
		System.out.println("para a");
	}
	public MultipleConstructor(int a, int b)
	{
		this(800);
		System.out.println("para a&b");
	}
	public MultipleConstructor(float a , int b)
	{
		this(44,80);
		System.out.println("para float a&b");
	}
	public MultipleConstructor(int a, float b)
	{
		this(55.77f, 66);
		System.out.println("para a& float b");
	}

	public static void main(String[] args) {
		MultipleConstructor z = new MultipleConstructor();

	}

}
