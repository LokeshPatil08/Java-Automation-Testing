package com.string.practice;

public class StringUpperAndLowerCase {
	public void az()
	{
		String str ="There is a garden";
		System.out.println("str= "+str);
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
	}

	public static void main(String[] args) {
		StringUpperAndLowerCase obj = new StringUpperAndLowerCase();
		obj.az();

	}

}
