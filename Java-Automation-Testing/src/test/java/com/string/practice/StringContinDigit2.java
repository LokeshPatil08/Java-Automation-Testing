package com.string.practice;

public class StringContinDigit2 {
	public static void main(String[] args) 
	{
		String str = "abc123";
		int size = str.length();
		int i =0;
		while(i != size)
		{
			if(str.charAt(i)>='0' && str.charAt(i)<='9')
			{
				++i;
			}else
			{
				System.out.println("not an digit");
				System.exit(0);
			}
		}
		System.out.println("is digit");
	}

}
