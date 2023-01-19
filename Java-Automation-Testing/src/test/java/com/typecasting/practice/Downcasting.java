package com.typecasting.practice;
class A1{
	public void test1(){
		System.out.println("test1");
	}
}
class B1 extends A1{
	public void test2(){
		System.out.println("test2");
	}
}
class C1 extends B1{
	public void test3(){
		System.out.println("test3");
	}
}

public class Downcasting {
	public static void main(String[] args) {
		A1 objA = new C1();   // parents class object with child class
		                      // constructor/ memory means up casting
	//	B1 objB = ObjA;       // implicit not support
		objA.test1();
		System.out.println("************");
		
		B1 objB = (B1)objA;
		objB.test1();
		objB.test2();
		System.out.println("************");
		
		C1 objC = (C1)objB;
		objC.test1();
		objC.test2();
		objC.test3();
		System.out.println("************");
		
		Downcasting obj = new Downcasting();
		obj.test4();
	}
	public void test4() {
		System.out.println("test4");
	}

}
