package com.wrapper.practice;

public class BoxingAndUnboxing {
	public void test() {
		int a = 10;
		Integer lp = 10;
		Integer lp1 = a;
		Integer lp2 = new Integer(20);
		System.out.println("lp="+lp);
		System.out.println("lp1="+lp1);
		System.out.println("lp2="+lp2);
		
		System.out.println("*********************");
		
		int b= lp1.intValue();
		int b1 = lp1;
		System.out.println("b="+b);
		System.out.println("b1="+b1);
		
		float f = lp1.floatValue();
		System.out.println(f);
		
		char aa= 'A';
		Character c = aa;
		char ac = c.charValue();
		System.out.println(ac);
		
		short as = 5;
		Short s = as;
		short sa = s.shortValue();
		System.out.println(sa);
		
	}
	public static void main(String[] args) {
		BoxingAndUnboxing ss = new BoxingAndUnboxing();
		ss.test();
	}

}
