package com.exceptionHandling.practice;

public class FinallyBlock {
	public void test (){
		try {
			int a =10, b = 0;
			int div= a/b;
			System.out.println("div="+div);
		}catch(Exception e) {
			System.out.println("inside catch block");
		}finally {
			System.out.println("inside finally block");
		}
		
		
	}
	public static void main(String[] args) {
		FinallyBlock ss = new FinallyBlock();
		ss.test();
	}

}
