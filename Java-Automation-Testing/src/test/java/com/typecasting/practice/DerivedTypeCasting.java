package com.typecasting.practice;
class A{
	public void  test1() {
		System.out.println("test1");
	}
}
class B extends A{
	public void test2() {
		System.out.println("test2");
	}
}

public class DerivedTypeCasting extends B {
	public static void main(String[] args)
	{
		DerivedTypeCasting c = new DerivedTypeCasting();
		c.test1();
		c.test2();
		c.test3();
		System.out.println("*****************");
		
		B b1 = (B)c; //explicite upcasting
		//B b1 = c;  // implicite upcasting
		b1.equals(c);
		b1.test1();
		b1.test2();
		//b1.test3();
		
		
	}
	public void test3() {
		System.out.println("test3");
	}

}
