package com.exceptionHandling.practice;

public class MultipalCatchBlock {
	public void div(int a , int b) {
		System.out.println("division start");
		try {
			System.out.println("inside try block");
			int div = a/b;
			System.out.println("division="+div);
			
			System.out.println("**********");
			
			String str = "lokesh";
			for(int i= 0; i<=6; i++) {
				System.out.println(str.charAt(+i));
			}
			int arr[]= new int[3];
			System.out.println(arr[4]);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch(ArithmeticException e) {
			System.out.println("inside catch block");
			e.printStackTrace();
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("inside catch block");
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		System.out.println("program start here");
		MultipalCatchBlock lp = new MultipalCatchBlock();
		lp.div(10, 0);
		System.out.println("program end here");
	}

}
