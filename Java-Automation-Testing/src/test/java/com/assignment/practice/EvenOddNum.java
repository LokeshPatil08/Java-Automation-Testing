package com.assignment.practice;

public class EvenOddNum {
	public void even()
	{
		for(int a=1; a<=40; a++)
		{
			if(a%2==0)
			{
				System.out.println(+a);
			}
		}
	}
	public void odd()
	{
		for (int b=1;b<=40; b++)
		{
			if(!(b%2==0))
			{
				System.out.println(+b);
			}
		}
	}
	public static void main(String[] args)
	{
		EvenOddNum xyz=new EvenOddNum();
		System.out.println("even numbers");
		xyz.even();
		System.out.println("odd numbers");
		xyz.odd();
	}

}
