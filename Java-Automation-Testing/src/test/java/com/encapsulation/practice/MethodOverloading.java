package com.encapsulation.practice;

public class MethodOverloading {
	public void addition() {
		System.out.println("method 1");
	}
	public void addition(int a , int b) {
		System.out.println(a+b+"=sum");
	}
	public void addition(int a , float b) {
		System.out.println("int & float");
	}
	public void addition(float a , int b) {
		System.out.println("float & int");
	}

}
