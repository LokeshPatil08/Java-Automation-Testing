package com.constructor.practice;

public class BasicConstructor {
//	construction is hidden -> Default constructor
//	memory allocation
	public BasicConstructor()
	{
		System.out.println("inside default constructor");
	}

	public static void main(String[] args) {
		BasicConstructor obj = new BasicConstructor();
	}

}
