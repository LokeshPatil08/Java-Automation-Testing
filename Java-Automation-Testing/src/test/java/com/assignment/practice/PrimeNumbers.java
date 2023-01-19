package com.assignment.practice;

public class PrimeNumbers 
{
	public void primenumber()
	{
		int temp=0;
		for(int no=1;no<=40;no++)
		{
			for(int i=2; i<=no-1; i++)
			{
				if(no%i==0)
				{
					temp=temp+1;
				}
			}
			if(temp==0)
			{
				System.out.println(no);
			}
			else
			{
				temp=0;
			}
		}
	}
	public static void main(String[] args)
	{
		PrimeNumbers xyz = new PrimeNumbers();
		System.out.println("prime numbers");
		xyz.primenumber();
		
	}

}
