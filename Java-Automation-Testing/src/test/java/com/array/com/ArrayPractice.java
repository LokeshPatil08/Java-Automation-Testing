package com.array.com;

public class ArrayPractice {
	public void array() 
	{
//		int, String, char, float is used in array
//		array is a homogenious set of data
		int [] a= {1 , 2, 3};
		//String b[] = {"pune","mumbai", "Nagpur"};
		//char c[] = {'A', 'B', 'C'};
		for(int i=0; i<3; i++)
		{
			System.out.println(a[i]);
			//System.out.println(b[i]);
			//System.out.println(c[i]);
		}
	}
	public static void main(String[] args)
	{
		ArrayPractice obj = new ArrayPractice();
		obj.array();
	}

}
