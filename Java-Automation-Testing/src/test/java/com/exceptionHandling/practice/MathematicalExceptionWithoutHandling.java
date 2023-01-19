package com.exceptionHandling.practice;

public class MathematicalExceptionWithoutHandling {
	public void add(int a , int b) {
		int add = a+b;
		System.out.println("additon="+add);
	}
	public void sub(int a , int b) {
		int sub =a-b;
		System.out.println("subtraction="+sub);
	}
	public void div(int a , int b) {
		int div = a/b;
		System.out.println("division="+div);
	}
	public static void main(String[] args) {
		MathematicalExceptionWithoutHandling ss = new MathematicalExceptionWithoutHandling();
		ss.add(10, 20);
		ss.sub(10, 5);
		ss.div(10, 0);  // exception occur without try catch block
		
	}

}
