package com.basic.java;

public class Class3 {
	public int meth1(int a) {
		System.out.println("hii");
		return 100+a; // a = 200
	}
	public void meth2() {
		System.out.println("hello");
	}
	public static void main(String[] args) {
		Class3 obj = new Class3();
		 obj.meth2();
		int result = obj.meth1(100);
		System.out.println(result);
	
	}

}
