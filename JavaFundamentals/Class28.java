package com.basic.java;

public class Class28 {
	static int y = 10;
	public static void main(String[] args) {
		Class28 t1 = new  Class28();
		Class28 t2 = new Class28();
		
		t1.y = 20;
		System.out.println(y + " ");
		System.out.println(t2.y);
		
		int x = 20;
		System.out.println(x);
	}
	static {
		int x = 10; // local variable 
		System.out.print(x + " ");
	}

}
