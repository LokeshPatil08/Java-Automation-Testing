package com.assignment.practice;

public class PrimeNum 
{
	
	public void primenum()
	{
		int ct=0,n=0,i=1,j=1;  
		while(n<15)
		{
			j=1;  
			ct=0;  
			while(j<=i)
			{
				if(i%j==0)  
					ct++;  
					j++;
			}
			if(ct==2)
			{
				System.out.printf("%d ",i);  
				n++;
			}
			i++;
	    }
    }
	public static void main(String[] args)
	{
		PrimeNum xyz = new PrimeNum();
		System.out.println("prime numbers");
		xyz.primenum();
	}
}	
