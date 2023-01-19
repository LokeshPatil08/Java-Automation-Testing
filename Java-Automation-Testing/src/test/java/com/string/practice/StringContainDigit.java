package com.string.practice;
import java.util.Scanner;

public class StringContainDigit {
	
	public static void main(String[] args) 
	{	
		Scanner cs=new Scanner(System.in);
		String str;
		int c =0,i;
		System.out.println("Enter your String:");
		str=cs.nextLine();
		for(i=0;i<str.length();i++)
		{
			if(str.charAt(i) >= '0' && str.charAt(i) <= '9')
			{
				
			    i++;
		    }
	    }
		if(c==str.length()) {
			
		System.out.print("String contains only digits.");
		} else {
			  System.out.print("String does not contains only digits.");
		}
		cs.close();
	}

}
