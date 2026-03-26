package com.basic.java;

public class Class2 {
	public void meth1(int a) {
		System.out.println(a);
	}
	public void meth2(String s) {
		System.out.println(s);
	}
	public static void main(String[] args) {
		Class2 obj = new Class2();
		
		obj.meth1(100);
		obj.meth2("java is best programming language");
		
		new Class2().meth1(100);
		new Class2().meth2("java is the best programming language ");
	}

}
