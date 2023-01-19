package com.basic.practice;

public class UpdatingValue {
	int a =10;
	int b =20;
	static int c =30;
	static int d =40;
	
public void test1() {
	System.out.println("test1");
}
public static void test2() {
	System.out.println("test2");
}
public static void main(String[] args) {
	UpdatingValue obj = new UpdatingValue();
	System.out.println("a="+obj.a);
	UpdatingValue.test2();
	obj.a =100;
	obj.test1();
	System.out.println("updateted a="+obj.a);
	
	
	
}

	
	
}
