package com.string.practice;

public class StringDigit {
	public static void main(String[] args) {
		String str = "ab12c3";
		String num ="";
		for(int i = 0; i<str.length(); i++) {
			if(Character.isDigit(str.charAt(i))) {
				num=num+str.charAt(i);
			}
		}
		System.out.println(num);
	}

}
