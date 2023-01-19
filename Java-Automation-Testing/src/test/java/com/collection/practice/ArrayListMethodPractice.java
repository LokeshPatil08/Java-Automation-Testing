package com.collection.practice;

import java.util.ArrayList;

public class ArrayListMethodPractice {
	public void test() {
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(1);
		ar1.add(2);
		ar1.add(3);
		ar1.add(4);
		System.out.println("ar1:");
		for(Integer i : ar1) {
			System.out.println(i);
		}
		
		ArrayList<Integer> ar2 = new ArrayList<Integer>();
		ar2.add(5);
		ar2.add(6);
		ar2.add(7);
		ar2.add(8);
		System.out.println("ar2:");
		for(Integer i : ar2) {
			System.out.println(i);
		}
		
		//string substring
		String str = "Garden";
		System.out.println(str.substring(1,4));
		
		System.out.println("**************");
		
		//sublist
		System.out.println(ar1.subList(1, 3));
		System.out.println("******************");
		
		//retain all
		ar1.retainAll(ar2);
		for(Integer i : ar1) {
			System.out.println(i);
		}
		System.out.println("***********");
		
		//remove all
		ar1.removeAll(ar2);
		for(Integer i : ar1) {
			System.out.println(i);
		}
		
	}
	
	
	public static void main(String[] args) {
		ArrayListMethodPractice obj = new ArrayListMethodPractice();
		obj.test();
	}

}
