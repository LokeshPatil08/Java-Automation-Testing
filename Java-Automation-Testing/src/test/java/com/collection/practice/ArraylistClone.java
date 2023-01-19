package com.collection.practice;

import java.util.ArrayList;

public class ArraylistClone {
	public static void main(String[] args) {
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(1);
		ar1.add(2);
		ar1.add(3);
		ar1.add(4);
		System.out.println("ar1:");
		for(Integer i : ar1) {
			System.out.println(i);
		}
		System.out.println("*******");
		ArrayList<Integer> ar2 = new ArrayList<Integer>();
		Object obj = ar1.clone();
		System.out.println("obj="+obj);
		ar2 = (ArrayList)ar1.clone();
		System.out.println(ar2);
		System.out.println("***********");
		System.out.println("ar2:");
		for(Integer i : ar2) {
			System.out.println(i);
		}
		

	}

}
