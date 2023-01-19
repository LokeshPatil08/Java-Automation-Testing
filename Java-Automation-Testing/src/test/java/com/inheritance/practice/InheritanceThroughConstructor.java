package com.inheritance.practice;

//inheritance happens through chain of constructor
//default constructor is by default hidden
//this() -> for calling same class constructor
//this. -> for calling same class nonstatic global variable
//super() -> for calling super parents class constructor
// super. ->


// super() -> should be always 1st statement of constructor
//this() -> should be alwasy 1st statement of constructor
//eithr super() or this() used in constructor

class B
{  
	public B()
	{
		//default constructor
//		super();  by default hidden
		System.out.println("B const");	
	}
	int a=10 , b= 20;
	public void test1()
	{
		System.out.println("test1");
	}
}
public class InheritanceThroughConstructor extends B {
	public InheritanceThroughConstructor() {  //default constructor
		super();
		System.out.println("child constructor");
	}

	public static void main(String[] args) {
		InheritanceThroughConstructor obj = new InheritanceThroughConstructor();
		B a = new B();
		a.test1();

	}

}
