package com.basic.java;

public class Class7 {
	int meth1(int a,int b, char c) {
		System.out.println(c);
		int result = new Class7().meth2("java full stack",100,'Y');
		return a+10+result;
	}
	int meth2(String s, int a,char c) {
		System.out.println(s);
		System.out.println(a);
		return 20;
	}
	public static void main(String[] args) {
		int i = new Class7().meth1(10, 20, 'x');
		System.out.println(i);
	}

}
