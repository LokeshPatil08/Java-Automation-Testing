package com.loop.practice;

public class BreakingInWhileFor {
	public void b()
	{
		int i=1;
		while(i<=10)
		{
			if(i==5)
			{
				break;
			}
			System.out.println(i);
			i++;
		}
		System.out.println("*********");
		for(int j=1; j<11; j++)
		{
			if(j==5)
			{
				break;
			}
			System.out.println(j);
		}
	}
	public static void main(String[] args)
	{
		BreakingInWhileFor a = new  BreakingInWhileFor();
		a.b();
	}
	

}
