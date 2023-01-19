package com.loop.practice;

import java.util.Scanner;

public class SwitchCaseProgram {
	public void vote()
	{
		System.out.println("enter your age");
		Scanner v = new Scanner(System.in);
		int age = v.nextInt();
		v.close();
		switch(age)
		{
		case(16):
			System.out.println("not eligible");
		break;
		case(18):
			System.out.println("eligible");
		break;
		case(60):
			System.out.println("over age");
		break;
		
		}
	}
	public static void main(String[] args)
	{
		SwitchCaseProgram xyz = new SwitchCaseProgram();
        xyz.vote();
		
	
	}

}
