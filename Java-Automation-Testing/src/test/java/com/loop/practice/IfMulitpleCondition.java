package com.loop.practice;

public class IfMulitpleCondition {
	public void ifmc()
	{
		int a=10; int b=110;
		if(a==10)
		{
			System.out.println("if a="+a);
			if(b==20)
			{
				System.out.println("if b="+b);
			}else
			{
				System.out.println("else b="+b);
			}
		}else
		{
			System.out.println("else a="+a);
		}
		
	}
	public static void main(String[] args)
	{
		IfMulitpleCondition c = new IfMulitpleCondition();
		c.ifmc();
	}

}
