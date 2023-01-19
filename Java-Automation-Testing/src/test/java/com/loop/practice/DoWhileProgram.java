package com.loop.practice;

public class DoWhileProgram {
	public void abc()
	{
		char i= 'A';
		do {
			System.out.println(i);
			i++;
		} while(i<='F');
	}
	public static void main(String[] args)
	{
		System.out.println("start");
		DoWhileProgram xyz = new DoWhileProgram();
		xyz.abc();
		System.out.println("end");
	}

}
