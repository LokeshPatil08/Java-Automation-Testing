package com.string.practice;

public class StringSplitAndReplace {
	public void az()
	{
		String str = "There is a garden";
		System.out.println(str);
		String [] arr = str.split(" ");
		System.out.println("arr size :"+arr.length);
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}	
		System.out.println(str.replace("garden", "bird"));
	}
	public static void main(String[] args)
	{
		StringSplitAndReplace obj = new StringSplitAndReplace();
		obj.az();
	}

}
