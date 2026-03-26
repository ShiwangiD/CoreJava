package com.basic.java;

public class Class29 {
	static int x = 10;
	static int y = 20;
	
	static {
		System.out.println("--- Test11 SBI called----");
		System.out.println("X :"+x);
		System.out.println("Y :"+y);
	}
	static void m1() {
		int x =100;
		System.out.println("static method called!");
		System.out.println("X :"+x);
		System.out.println("Y :"+y);
	}
	public static void main(String[] args) {
		m1();
	}
	static {
		System.out.println("--- Test11 SBI2---");
		System.out.println("X :"+x);
		System.out.println("Y :"+y);
	}

}
