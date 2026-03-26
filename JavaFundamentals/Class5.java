package com.basic.java;

public class Class5 {
	public int meth1(int a, int b) {
		System.out.println(40);
		Class5 obj = new Class5();
		System.out.println(45);
		int x = obj.meth2(30,"lovely");
		System.out.println(x+1);
		return a+b;
			}
	public int meth2(int a, String s) {
		System.out.println(a+a);
		System.out.println(a);
		System.out.println(s);
		return a;
		
	}
	public static void main(String[] args) {
		System.out.println("Start");
		System.out.println(new Class5().meth1(10,20)+100);
		System.out.println("end");
		
	}

}
