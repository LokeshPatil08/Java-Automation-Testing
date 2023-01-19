package com.collection.practice;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {
	public static void main(String[] args) {
		ArrayList<Integer> az= new ArrayList<Integer>();
		az.add(10);
		az.add(15);
		az.add(20);
		az.add(5);
		az.add(25);
		System.out.println(az);
		System.out.println("*********");
		
		for(Integer i : az) {
			System.out.println(i);
		}
		System.out.println("after accending sorting");
		Collections.sort(az);
		
		for(Integer i : az) {
			System.out.println(i);
		}
		
		System.out.println("after reverse sorting");
		Collections.reverse(az);
		for(Integer i : az) {
			System.out.println(i);
		}
	}

}
