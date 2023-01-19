package com.basic.practice;

public class ObjectCreation 
{
//	global variable
	int x = 10;
	int y = 20;
	
	/*access_specifier return_type method_name(arguments) { 
	 } */
	public static void main(String[] args) {
		
//		local variable
		int z = 30;
		
//		synta for creating an object
//		class_name reference_name = new class name();
		ObjectCreation xyz = new ObjectCreation();
		System.out.println(xyz.x);
		System.out.println(xyz.y);
		
		int sum = xyz.x + z ;
		System.out.println("sum ="+sum);
		
		int sumA = xyz.y + z;
		System.out.println("sumA ="+sumA);
		System.out.println("sum ="+sumA);
	}
}
