package com.string.practice;

public class SwitchUsingString {
	public void s()
	{
		String f= "Samosa";
		switch(f)
		{
		case "Samosa": System.out.println("samosa case");
		break;
		default: System.out.println("invalid");
		}
//		switch- int, String, char
	}
	public static void main(String[] args)
	{
		SwitchUsingString a = new SwitchUsingString();
		a.s();
	}
	

}
