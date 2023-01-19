package com.abstracts.practice;
//abstract = incomplete
//abstract keyword should be written as class label.
//abstract class may contain incomplete methods
//abstract class may contain all incomplete methods.
//abstract class may contain both complete and incomplete methods

abstract class abc1{
	public void test1() {
		System.out.println("test1");
	}
}
abstract class abc2{
	abstract public void test2();
}
abstract class abc3{
	public void test3() {
		
	}
	abstract public void test4();
}

public class BasicAbstract {
	public void test() {
		System.out.println("test");
	}
	public static void main(String[] args) {
		BasicAbstract obj = new BasicAbstract();
		obj.test();
	}
	
}
