package com.argument.practice;

import java.util.Scanner;

public class ArgumentMethodUsingScanner 
{
	public static void main(String[] args)
	{
		System.out.println("start");
		ArgumentMethodUsingScanner obj = new ArgumentMethodUsingScanner();
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter int a=");
		int a = scn.nextInt();
		System.out.println("Enter float b=");
		float b = scn.nextFloat();
		scn.close();
		obj.addition(a, b);
		System.out.println("end");
	}
	public void addition(int a , float b)
	{
		float sum = a+b;
		System.out.println(sum);
	}

}
