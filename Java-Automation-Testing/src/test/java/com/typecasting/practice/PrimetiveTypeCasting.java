package com.typecasting.practice;

public class PrimetiveTypeCasting {
	public static void main(String[] args) {
		byte a = 8;
		short s = a;  //automatic widning
		System.out.println(+s);
		
		int i= 32768; //40000; //65536;
		System.out.println(i);
		short ss= (short)i;   //-32768 to 37767
		System.out.println(ss);
		
		int j = 129;
		float f = (float)j; // automatic narrowing
		System.out.println(f);
	}

}
