package com.collection.practice;

import java.util.HashSet;
import java.util.Iterator;
public class SetPracticeIterator {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
//		hs.add(null);
		hs.add("Lokesh");
		hs.add("Suraj");
//		hs.add(null);
		hs.add("Vedant");
		hs.add("Punam");
//		hs.add(null);
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		System.out.println("**********");
		for(String s :hs) {
			System.out.println(s);
		}
		System.out.println("************");
		
		//iterator
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext()) {
			String str = itr.next();
			System.out.println("itr="+itr.hasNext());
			System.out.println("*********");
			if(itr.next().equals("Vedant")) {
				itr.remove();
			}
			
			System.out.println("str="+str);
		}
		
	}

}
