package com.encapsulation.practice;

public class MethodOverRiding  extends Parent1{
	public void addition() {
		int a = 10 , b=20;
		int sum = a+b;
		System.out.println("sum="+sum);
	}
	public static void main(String[] args) {
		MethodOverRiding obj = new MethodOverRiding();
		obj.addition();
		obj.subtraction();
	}

}
