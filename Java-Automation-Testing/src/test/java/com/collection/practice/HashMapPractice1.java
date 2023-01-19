package com.collection.practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapPractice1 {
	public static void main(String[] args) {
		HashMap<String,String> lp = new HashMap<String,String>();
		lp.put("name", "Lokesh");
		lp.put("city", "Mumbai");
		lp.put("mobile no", "9588424593");
		lp.put("email", "loki@gmail.com");
		
		System.out.println(lp);
		System.out.println();
		Set<String> kn = lp.keySet();
		System.out.println("kn="+kn);
		
		System.out.println("***for each****");
		for(String str : kn) {
			System.out.println(str);
		}
		System.out.println("***loop end here");
		
		
		System.out.println(lp.values());
		System.out.println("*************");
		
		
		Iterator<String> itr = kn.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("1**********");
		
		System.out.println(lp.toString());
		System.out.println("2**********");
		
		String str = lp.get("name");
		System.out.println(str);
		System.out.println("3**********");
		
		System.out.println("name=" +lp.get("city"));
		
		System.out.println("map size="+lp.size());
		System.out.println();
		
		Collection<String> obj = lp.values();
		System.out.println(obj);
		ArrayList<String> ss = new ArrayList<String>(obj);
		System.out.println(ss);
		
		System.out.println(ss.isEmpty());
		System.out.println(ss.listIterator());
		System.out.println();
		for(String i : ss) {
			System.out.println(i);
		}	
	}
}
