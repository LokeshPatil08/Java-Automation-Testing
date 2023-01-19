package com.basic.practice;

import java.util.Scanner;

public class ScannerCreation {
	public static void main(String[] args)
	{
		int a;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number:");
		a=scn.nextInt();
		System.out.println("Enter number is :"+a);
		String str = "";
		System.out.println("Enter city:");
		str= scn.next();
		System.out.println(str);
		scn.close();
	}

}
