package com.exceptionHandling.practice;

public class WithoutCatchBlockTryFinallyEx {
	public void test ()
	{
		try {
			int a =10, b = 0;
			int div= a/b;
			System.out.println("div="+div);
//		}catch(Exception e) {
//			System.out.println("inside catch block");
		}finally {
			System.out.println("inside finally block");
			//conn.close();
		}
	}	
	public static void main(String[] args) {
		WithoutCatchBlockTryFinallyEx sk = new WithoutCatchBlockTryFinallyEx();
		sk.test();
	}

}
