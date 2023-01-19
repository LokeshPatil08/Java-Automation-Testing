package com.basic.practice;

public class ForLoop {
	public void forloop()
	{
		for(int a=100; a<=120; a++)
		{
			System.out.println(+a);
		}
		System.out.println("********");
		for(int b=200; b>=180; b--)
		{
			System.out.println(+b);
		}
	}
	public static void main(String[] args) {
		ForLoop f = new ForLoop();
		f.forloop();
	}
}
