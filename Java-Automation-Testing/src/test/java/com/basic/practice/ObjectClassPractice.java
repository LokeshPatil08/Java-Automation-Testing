package com.basic.practice;

import com.array.com.ArrayPractice;

public class ObjectClassPractice extends ArrayPractice
{
	public void array() 
	{
		int[]arr = new int[5];
	    arr[0]= 15;
	    arr[1]= 1;
//	    arr[2]= 10;
	    arr[3]= 5;
	    for(int i=0; i<arr.length; i++) 
	    {
	    	System.out.println(arr[i]);
	    }
	}
	public static void main (String[] args)
	{
		ObjectClassPractice obj = new ObjectClassPractice();
		obj.array();
	}
	
	
	

}
