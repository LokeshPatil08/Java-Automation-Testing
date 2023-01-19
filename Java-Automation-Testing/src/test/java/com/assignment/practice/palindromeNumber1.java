package com.assignment.practice;


public class palindromeNumber1 {
	public void palindromeNumber()
	{
		int no = 121;
		int temp = no;
		int rev = 0, rem;
		while(temp !=0)
		{
			rem = temp%10;
			rev = rev*10+rem;
			temp = temp/10;
		}
		if(no==rev)
		{
			System.out.println(no);
			System.out.println("is palindrome number");
		}
		else
		{
			System.out.println(no);
			System.out.println("is not palindrome number");
		}
	}
	public void palindromeString() {
		String str ="Radar", revstr="";
		int l =str.length();
		for(int i =(l-1); i>=0; --i) {
			revstr = revstr+str.charAt(i);
		}if(str.toLowerCase().equals(revstr.toLowerCase())) {
			System.out.println(str);
			System.out.println("is palindrome string");
		}else {
			System.out.println(str);
			System.out.println("is not palindrome strings");
		}
	}
	public static void main(String[] args) {
		palindromeNumber1 pn = new palindromeNumber1();
		pn.palindromeNumber();
		pn.palindromeString();
	}

}
