package com.basic.java;

public class Class8 {
	int meth1() {
		System.out.println("hii");
		return new Class8().meth2()+10;
	}
	int meth2() {
		System.out.println("hello");
		return 10;
	}
	public static void main(String[] args) {
		System.out.println(new Class8().meth1());
		
		
		
	}

}
