package com.argument.practice;

public class ReturnArgument {

	public static void main(String[] args) {
		ReturnArgument obj = new ReturnArgument();
		obj.add(10,15);
		System.out.println("addition =");
		
		obj.a();
		
//	    float sub = obj.sub(sum, 15);
//		System.out.println("subtracton ="+sub);
}
	public int add(int a, int b)
	{
		int sum = a+b;
		return sum;
	}
	public float sub(float a , int b)
	{
		float sum = a-b;
		return sum;
	}
	public void a () {
		int sum = 10+20;
	}
}

