package com.exceptionHandling.practice;

public class PracticeProgramEx1 {
	public void div(int a , int b) {
		System.out.println("division start here");
		try {
			int div = a/b;
			System.out.println("div="+div);
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("divsion end here");
		try {
			System.out.println("inside try block");
			String str = "Lokesh";
			for(int i=0; i<=6; i++) {
				System.out.println(str.charAt(i));
			}
		}catch(StringIndexOutOfBoundsException e) {	
			System.out.println("inside catch block");
			e.printStackTrace();
			System.out.println("exit catch block");
		}
	}
	public static void main(String[] args) {
		PracticeProgramEx1 rv = new PracticeProgramEx1();
		System.out.println("program start here");
		rv.div(10, 0);
		System.out.println("program end here");
	}

}
