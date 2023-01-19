package com.collection.practice;

import java.util.ArrayList;

public class SyntaxForCollection {
	public static void main(String[] args)
	{
		ArrayList<String> studName = new ArrayList<String>();
		studName.add("Akshay");
		studName.add("lokesh");
		studName.add("suraj");
		studName.add("punam");
		studName.add("vedant");
		studName.add(null);
		System.out.println(studName);
		
		//to calculate specific name
		String studName3 = studName.get(3);
		System.out.println("studname3="+studName3);
		
		String studName5 = studName.get(5);
		System.out.println(studName5);
		
		//to calculate size
		int studnames = studName.size();
		System.out.println(studnames);
		
		System.out.println("***************");
		
		// normal for loop
		for(int i= 0; i<studnames; i++)
		{
			if(studName.get(i).equals("suraj"))
			{
			   break;
			}
			System.out.println(studName.get(i));
		}
		System.out.println("****************");
//		for each loop
		for(String lp: studName) {
//			if(lp== null || lp.equals("suraj")) {
//				continue;
//			}
			if(lp.equals("punam")) {
				break;
			}
			System.out.println(lp);
		}
		System.out.println("****************");
		SyntaxForCollection obj = new SyntaxForCollection();
		System.out.println(obj.toString());
	}

}
