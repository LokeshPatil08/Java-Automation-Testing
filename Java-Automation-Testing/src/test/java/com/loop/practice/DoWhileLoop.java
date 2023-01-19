package com.loop.practice;

public class DoWhileLoop {
	public void loop()
	{
		int i=50;
		do
		{
			System.out.println(i);
			i++;
		}while(i<=55);
		{
			System.out.println("after while i="+i);
		}
		
	}
	

	public static void main(String[] args) {
		DoWhileLoop obj = new DoWhileLoop();
		obj.loop();

	}

}
