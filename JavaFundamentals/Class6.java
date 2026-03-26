package com.basic.java;

public class Class6 {
	void meth1() {
		System.out.println(40);
		System.out.println(64);
		System.out.println("End");
	}
	int meth2(int a, int b, int c) {
		System.out.println(a);
		Class6 obj = new Class6();
		String s = obj.meth5(100, "java awesome");
		System.out.println(s);
		return a-b;
	}
	String meth3(String s,int b, int d) {
		System.out.println(b+d);
		return s;
	}
	int meth4(int c, int k) {
		Class6 obj = new Class6();
		int result = obj.meth2(50,50,50);
		System.out.println(result);
		return k+10;
	}
	String meth5(int a , String L) {
		System.out.println(a+a);
		Class6 obj = new Class6();
		String s = obj.meth3("hii",15,10);
		System.out.println(s);
		return L;
	}
	public static void main(String[] args) {
		Class6 obj = new Class6();
		System.out.println("start");
		int result = obj.meth4(20,10);
		System.out.println(result);
		obj.meth1();
	}

}
