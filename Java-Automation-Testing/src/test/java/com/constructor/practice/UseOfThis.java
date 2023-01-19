package com.constructor.practice;

public class UseOfThis {
	int a, b, sum;
	public UseOfThis(int a, int b)
	{
		System.out.println("this.a="+this.a);
		System.out.println("this.b="+this.b);
		this.a=a;
		this.b=b;
		System.out.println(+a);
		System.out.println(+b);
		System.out.println("this.a="+this.a);
		System.out.println("this.b="+this.b);
	}
	public void add()
	{
		sum=a+b;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		UseOfThis obj = new UseOfThis(12 , 10);
		obj.add();
		

	}

}
