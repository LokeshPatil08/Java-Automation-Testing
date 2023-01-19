package com.lamda.practice;
interface interf1{
	public int findLengthOfString(String s);
}
interface interf2{
	public void test1();
}
interface interf3{
	public void addition(int a, int b);
}
public class Lamdaex1 {
	public static void main(String[] args) {
		interf1 obj = (str)-> str.length();
		int length = obj.findLengthOfString("lokesh");
		System.out.println(length);
		
		interf2 ss = ()->
		System.out.println("hello");
		ss.test1();
		
		interf3 xz = (a,b)->
		System.out.println(a+b);
		xz.addition(10, 20);
	}

}
