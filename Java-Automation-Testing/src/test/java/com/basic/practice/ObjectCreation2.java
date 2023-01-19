package com.basic.practice;

public class ObjectCreation2 {
	int x = 10;
	int y = 20;
	float a = 20.20f;
	
public static void main(String[] args) {
	int z = 100;
	float b = 10.10f;
	ObjectCreation2 loki = new ObjectCreation2();
	
//	int addition
	
	int sum = loki.x + loki.y + z;
	System.out.println("sum ="+z);
	System.out.println("sum ="+sum);
	
//	flaot addition
	
	float sumf = loki.a + b;
	System.out.println("sumf ="+sumf);
	System.out.println("float b ="+b);
	
			
	
			
}
}
