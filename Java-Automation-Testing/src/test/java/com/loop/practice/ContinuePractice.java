package com.loop.practice;

public class ContinuePractice {
	public void continuep()
	{
		for(int i=1; i<11; i++)
		{
			if(i==5 || i==7)
			{
				continue;
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args)
	{
		ContinuePractice j = new ContinuePractice();
		j.continuep();
	}

}
