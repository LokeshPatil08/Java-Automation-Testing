package com.inheritance.practice;
//here wr see how to use of super. key

class c
{
	int a = 10, b = 20;
	public void test() {
		System.out.println("parents test");
	}
}

public class UseOfsuper extends c {
	public void ctest() {
		System.out.println("child test");
		int sum = super.a +super.b;
		System.out.println("sum="+sum);
	}
	public static void main(String[] args)
	{
		UseOfsuper obj = new UseOfsuper();
		obj.ctest();
		obj.test();
	}
	

}
