package com.exceptionHandling.practice;

public class MathematicalExceptionWithHandling {
	public static void main(String[] args) {
		MathematicalExceptionWithHandling lp = new MathematicalExceptionWithHandling();
		
		lp.div(10, 0);
		lp.add(10, 20);
		lp.sub(20, 10);
	}
	// we handle exception handling bye using try catch block
	// can we use try block only :- no (but using....)
	
	//syntax 
//	try {
//		code + abnormal condition;
//	}catch(exception_type e) {    // e is user define variable
//		obj.printStackTrace();
//	}
	
	public void div(int a , int b) {
		System.out.println("inside division method");
		try {
			System.out.println("inside try block");
		    int div = a/b;
		    System.out.println("division="+div);
		}catch(ArithmeticException e) {	
			System.out.println("insude catch block");
			e.printStackTrace();
		}
	}
	public void add(int a , int b) {
		int add = a+b;
		System.out.println("additon="+add);
	}
	public void sub(int a , int b) {
		int sub =a-b;
		System.out.println("subtraction="+sub);
	}

}
