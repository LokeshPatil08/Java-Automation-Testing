package com.wrapper.practice;

public class StringToIntViceVersa {
	public static void main (String[] args) {
		String value = "123";
		int intvalue = Integer.valueOf(value);
		System.out.println("intvalue=" +intvalue);
		
		String newstring = String.valueOf(intvalue);
		System.out.println("newstring=" +newstring);
		
		int intvalue1 = Integer.parseInt(value);
		System.out.println(+intvalue1);
		
		Float ff = Float.parseFloat(value);
		System.out.println(ff);
		
		Byte b = Byte.parseByte(value);
		System.out.println(b);
		
		Double d = Double.parseDouble(value);
		System.out.println(d);
		
		Long l = Long.valueOf(value);
		System.out.println(l);
		
	}

}
