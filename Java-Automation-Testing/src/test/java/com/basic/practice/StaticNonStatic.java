package com.basic.practice;

public class StaticNonStatic {
	int a=10;
	int b=20;
	static int c=30;
	static int d=40;
	
	public void test1() {
		System.out.println("test1 method");
	}
    public static void test2() {
    	System.out.println("test2 method");
    }
    public static void main(String[] args) {
    	System.out.println("program start here");
    	
//    	directly call static from class using class name
    	System.out.println("c="+StaticNonStatic.c);
    	System.out.println("d="+StaticNonStatic.d);
    	StaticNonStatic.test2();
    	System.out.println("*******");
    	
//    	object creation for non static from class to main method
    	StaticNonStatic obj = new StaticNonStatic();
    	System.out.println("non static start here");
    	System.out.println("OBJ1="+obj.a);
    	System.out.println("OBJ2="+obj.b);
    	obj.test1();
    	System.out.println("all end here");
    	
    	
       }
    
    
    
    
}

