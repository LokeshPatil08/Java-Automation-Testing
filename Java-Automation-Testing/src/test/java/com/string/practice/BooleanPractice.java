package com.string.practice;

public class BooleanPractice {

	public boolean tboo() {
		String name1= "ajay";
		String name2= "vijay";
		boolean nameFlag= name1.contentEquals(name2);
		System.out.println(nameFlag);
		return nameFlag;
	}
	public static void main(String[] args)
	{
		BooleanPractice z = new BooleanPractice();
		z.tboo();
	}

}
