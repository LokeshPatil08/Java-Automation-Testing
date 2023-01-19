package com.loop.practice;

public class WhileLoopProgram {
	public void abc()
	{
		int i=10;
		while(i<20) 
		{
			System.out.println(i);
			i++;	
		}
		System.out.println("i value");
		System.out.println("i="+i);
		
	}
	public static void main(String[] args)
	{
		WhileLoopProgram xyz = new WhileLoopProgram();
		System.out.println("start");
		xyz.abc();
		System.out.println("end");
				
	}

}
