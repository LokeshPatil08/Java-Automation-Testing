package com.abstracts.practice;
// abstract class
abstract class MathOperation{
	public void addition () {
		System.out.println("addition");
	}
	public void subtraction() {
		System.out.println("subtraction");
	}
}
public class AbstractClassInheritance extends MathOperation  {
	public static void main (String[] args) {
		AbstractClassInheritance obj = new AbstractClassInheritance();
		obj.addition();
		obj.subtraction();
	}

}
