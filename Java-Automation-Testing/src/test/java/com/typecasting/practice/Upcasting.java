package com.typecasting.practice;
class A2{
	public void  test1() {
		System.out.println("test1");
	}
}
class B2 extends A2{
	public void test2() {
		System.out.println("test2");
	}
}

public class Upcasting extends B2 {
	public static void main(String[] args)
	{
		Upcasting c = new Upcasting();
		c.test1();
		c.test2();
		c.test3();
		System.out.println("*****************");
		
		B2 b1 = (B2)c; //explicit up casting
		//B b1 = c;  // implicit up casting
		b1.test1();
		b1.test2();
		//b1.test3();
		System.out.println("*************");
		
		A2 a = c;
		a.test1();
		System.out.println("**********");
		
		A2 a1 = new Upcasting();
		a1.test1();	
	}
	public void test3() {
		System.out.println("test3");
	}
}
