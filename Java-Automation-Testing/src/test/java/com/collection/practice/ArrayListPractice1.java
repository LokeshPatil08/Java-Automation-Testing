package com.collection.practice;

import java.util.ArrayList;

public class ArrayListPractice1 {
	public static void main(String[] args) {
		ArrayList<String> ss = new ArrayList<String>();
		ss.add("lokesh");
		ss.add("suraj");
		ss.add("punam");
		ss.add("vedant");
		ss.add(null);
		
		int sn = ss.size();
		System.out.println(sn);
		
		System.out.println("****************");
		
//		for each loop
		System.out.println("for each loop");
		for(String lp: ss) {
			System.out.println(lp);
		}
		System.out.println("**************");
		
		
		for(int i = 0; i<sn; i++) {
			System.out.println(ss.get(i));
		}
		boolean flag = ss.contains("amar");
		System.out.println(flag);
		
		boolean flag1 = ss.contains("vedant");
		System.out.println(flag1);
		
		if(ss.contains(null)) {
			System.out.println("is presetnt");
		}else {
			System.out.println("is not present");
		}
		System.out.println("*********************");
		for(int j = 0; j<sn; j++) {
			if(ss.get(j).equals("punam")) {
				break;
			}
			System.out.println(ss.get(j));
		}
	}

}
