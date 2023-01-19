package com.collection.practice;

import java.util.ArrayList;

public class ArrayListPractice2 {
	public static void main(String[] args) {
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(10);
		ar1.add(Integer.valueOf(5));
		ar1.add(20);
		ar1.add(12);
		System.out.println(ar1);
		
		for(Integer i : ar1) {
			System.out.println(i);
		}
		System.out.println("***************");
//		ar1.remove(20);  //this is index
//		ar1.remove(200);
//		ar1.remove(Integer.MAX_VALUE);
		
		for(Integer i : ar1) {
			System.out.println(i);
		}
		
		// contains
		if(ar1.contains(12)) {
			System.out.println("presrent");
		}else {
			System.out.println("not present");
		}
		
		//is empty
		if(ar1.isEmpty()) {
			System.out.println("empty");
		}else {
			System.out.println("not empty");
		}
		
	}

}
