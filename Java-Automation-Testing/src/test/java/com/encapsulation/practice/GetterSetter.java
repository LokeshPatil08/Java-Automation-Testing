package com.encapsulation.practice;

class d{
	private int a = 10;
	public int getA() {
		return a;
	}
	public void setA() {
		this.a=20;
	}
}

public class GetterSetter extends d {
	public static void main(String[] args)
	{
		d obj=new d();
		obj.setA();
		System.out.println(obj.getA());
		obj.getA();
		System.out.println(obj.getA());
	
	}

}
