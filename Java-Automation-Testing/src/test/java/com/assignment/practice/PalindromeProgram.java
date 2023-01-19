package com.assignment.practice;

public class PalindromeProgram {
	public void palindromeNumber() {
		int n = 12321, rev=0,rem,temp;
		temp=n;
		for(;n!=0; n/=10) {
			rem=n%10;
			rev=rev*10+rem;
		}
		//palindrome if temp and sum are equal
		if(temp==rev) {
			System.out.println(temp+ "is a palindrome");
		}else {
			System.out.println(temp+ "is not palindrome");
		}
	}
	public static void main(String[] args) {
		PalindromeProgram pn = new PalindromeProgram();
		pn.palindromeNumber();
	}

}
