package com.constructor.practice;

public class DefaultParametrizedConstr {
	public DefaultParametrizedConstr()
	{
		System.out.println("default");
	}
	public DefaultParametrizedConstr(int a) {
		System.out.println("parameterized");
	}

	public static void main(String[] args) {
		DefaultParametrizedConstr z = new DefaultParametrizedConstr(40);
		

	}

}
