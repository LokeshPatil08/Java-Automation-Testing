package com.assignment.practice;

import java.util.Scanner;

public class AreaFindOut {
	public void circle()
	{
		double radius, area;
		Scanner c = new Scanner(System.in);
		
		System.out.println("enter the radius of circle");
		radius=c.nextDouble();
		c.close();
		
		area=Math.PI*radius*radius;
		System.out.println("area of circle is="+area);
		
	}
	public void square()
	{
		double side,area;
		System.out.println("enter square side");
		Scanner s = new Scanner(System.in);
		side=s.nextInt();
		s.close();
		area=side*side;
		System.out.println("area of square is="+area);
		
	}
	public static void main(String[] args)
	{
		AreaFindOut xyz = new AreaFindOut();
		xyz.circle();
	    xyz.square();
		
	}

}