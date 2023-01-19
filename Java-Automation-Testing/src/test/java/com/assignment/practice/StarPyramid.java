package com.assignment.practice;

public class StarPyramid {
	public void stars()
	{
		for(int i=1; i<=3; i++)
		{
			for(int j=3; j>=1;j--)
			{
				if(j>i)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(" *");
				}
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args)
	{
		StarPyramid xyz = new StarPyramid();
		xyz.stars();
	}

}
