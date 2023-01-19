package com.assignment.practice;

public class FibonacciSeries {
	public void fibonacci()
	{
		int a=0, b=1;
		System.out.println(+a);
		System.out.println(+b);
		
		int c;
		for (int i=1; i<=10; i++)
		{
			c=a+b;
			System.out.println(""+c);
			a=b;
			b=c;
		}
	}
	public static void main(String[] args)
	{
		FibonacciSeries xyz=new FibonacciSeries();
		System.out.println("Fibonacci Series");
		xyz.fibonacci();
	}

}
