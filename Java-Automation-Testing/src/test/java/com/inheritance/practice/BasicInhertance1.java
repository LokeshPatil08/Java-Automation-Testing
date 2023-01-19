package com.inheritance.practice;

class A {
	int a=10, b=20;
	static int x=30;
	public void addition()
	{
		int sum = a+b;
		System.out.println(sum);
		System.out.println("addition");
	}
	public void subtraction()
	{
		int sum = a+b;
		System.out.println(sum);
		System.out.println("subtraction");
	}
	public static void t1()
	{
		A.x=40;
		System.out.println(+x);
		System.out.println("t1");
	}
}

public class BasicInhertance1 extends A {

	public static void main(String[] args) {
		A f1 = new A();
		f1.addition();
		f1.subtraction();
		A.t1();

	}

}
