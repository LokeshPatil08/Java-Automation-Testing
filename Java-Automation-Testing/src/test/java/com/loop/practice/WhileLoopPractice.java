package com.loop.practice;

public class WhileLoopPractice {
	public void loop()
	{
		System.out.println("inside while method");
		int i=50;
		while(i<=53)
		{
			System.out.println(i);
			i++;
		}
		System.out.println("after while loop");
		System.out.println("i =" +i);
	}
	public static void main(String[] args)
	{
		WhileLoopPractice obj = new WhileLoopPractice();
		obj.loop();
	}

}
