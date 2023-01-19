package com.assignment.practice;

import java.util.Scanner;

public class PalindromeNumbers 
{
	public void palindrome()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int no = s.nextInt();
		s.close();
		int temp = no;
		int rev = 0, rem;
		while(temp !=0)
		{
			rem = temp%10;
			rev = rev*10+rem;
			temp = temp/10;
		}
		if(no==rev)
		{
			System.out.println(no+ "is palindrome number");
		}
		else
		{
			System.out.println(no+ "is not palindrome number");
		}
	}
	public static void main(String[] args)
	{
		PalindromeNumbers xyz = new PalindromeNumbers();
		xyz.palindrome();
	}

}
