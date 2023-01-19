package com.abstracts.practice;
abstract class MathOperation2{
	public void add() {
		int a = 10, b = 20;
		int sum = a+b;
		System.out.println("sum=" +sum);
	}
	abstract public void sub(int a , int b); 
		
	
}

public class AbstractMethodAndClassInheritance extends MathOperation2{
	public static void main ( String [] args) {
		 AbstractMethodAndClassInheritance obj = new  AbstractMethodAndClassInheritance();
		 obj.add();
		 obj.sub(20 , 15);
	}

	@Override
	public void sub(int a , int b) {
		int sum = a-b;
		System.out.println("sub="+sum);
		
	}
	

}
