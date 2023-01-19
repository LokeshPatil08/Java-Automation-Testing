package com.constructor.practice;
class c{
	int a=10, b= 20;
	public void test() {
		System.out.println("test");
	}
}

public class UseOfSuper extends c {
	public void ctest() {
		int sum = super.a+super.b;
		System.out.println("super.="+sum);
	}
	public static void main (String[] args) {
		UseOfSuper obj = new UseOfSuper();
		obj.ctest();
		obj.test();
		
	}

}
