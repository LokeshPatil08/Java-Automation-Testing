package com.array.com;

public class SingleDimentionalArray extends ArrayPractice
{
	
	public static void main(String[] args) 
	{
		SingleDimentionalArray obj = new SingleDimentionalArray();
		obj.array();
		System.out.println("************");
		int [] arr = new int [5];
		arr[0] = 15;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 35;
		arr[4] = 40;
		for(int i=0; i<arr.length; i++) 
		{
			System.out.println(arr[i]);
		}
		System.out.println("******************");
		float[] arr1 = new float[5];
		arr1[0] = 1.5f;
		arr1[1] = 2.5f;
		arr1[2] = 3.5f;
		arr1[3] = 4.5f;
		for(int j=0; j<arr1.length; j++) {
			System.out.println(arr1[j]);
		}
	}

}
