package com.constructor.practice;

public class ParaConstr1 {
	int a=11, b=55, sum;
//	default constructor
	public ParaConstr1()
	{
//		System.out.println("default");
	}
//	parameterized constructor
	public ParaConstr1(int x, int y)
	{
		a = x;
		b = y;
	}
	public void add()
	{
		sum=a+b;
		System.out.println(+sum);
	}
	

	public static void main(String[] args) {
		ParaConstr1 obj = new ParaConstr1(30,40);
		obj.add();
		
		ParaConstr1 obj2 = new ParaConstr1(500,600);
		obj2.add();
		
		ParaConstr1 z = new ParaConstr1();
		z.add();

	}

}
