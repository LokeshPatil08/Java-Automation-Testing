package com.encapsulation.practice;

public class Parent1 {
	public void addition() {
		int a = 10 , b=20;
		int sum = a+b;
		int c = 50;
		sum = sum + c;
		System.out.println("parents class - addition");
	}
	public void subtraction() {
		System.out.println("subtraction - parents class");
	}
	private int test() {
		System.out.println("test");
		return 10;
	}

}
