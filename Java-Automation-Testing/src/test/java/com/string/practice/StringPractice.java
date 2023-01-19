package com.string.practice;

public class StringPractice 
//       String class practice length, charAt[.....]
{
	public void t1()
	{
		String str= "There is a garden and its beautiful";
		System.out.println("str="+str);
		int size = str.length();
		System.out.println(size);
		System.out.println(str.length());
		
		char a = str.charAt(0);
		System.out.println(+a);
	}

	public static void main(String[] args) {
		StringPractice obj = new StringPractice();
		obj.t1();
		

	}

}
