package com.basic.java;

public class Class23 {
	public static void main(String[] args) {
		int  i = 4;
		int j = 21;
		
		int k = ++i * 7 + 2 - j--;
		System.out.println("k = "+k);
		
		int a = 1;
		int b = 2;
		int c;
		int d;
		 c= ++b;
		 d = a++;
		 c++;
		 System.out.println("a = " +a);
		 System.out.println("b = " +b);
		 System.out.println("c = " +c);
		 System.out.println("d = " +d);
	}

}
