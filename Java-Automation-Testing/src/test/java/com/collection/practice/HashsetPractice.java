package com.collection.practice;

import java.util.HashSet;

public class HashsetPractice {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add(null);
		hs.add("Lokesh");
		hs.add("Suraj");
		hs.add(null);
		hs.add("Vedant");
		hs.add("Punam");
		hs.add(null);
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		System.out.println("**********");
		for(String s :hs) {
			System.out.println(s);
		}
		for(String s : hs) {
			try {
				if(s.equals("Vedant")) {
					break;
				}
			}catch(NullPointerException e) {
				System.out.println(s);
			}
		}
		System.out.println("************");
	}

}
