package com.assignment.practice;

public class StarPyramid2 {
	public void star()
	{
		for(int i=1; i<=3; i++)
		{
			for(int j=3; j>=i; j--)
			{
				System.out.println(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.println(" *");
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		StarPyramid2 xyz=new StarPyramid2();
		xyz.star();
	}

}
