package com.basic.java;

public class ClassD {
	void meth1(int a) {
		System.out.println(" meth1() called");
		System.out.println("a value is :"+a);
	}
	void meth2(int a, String s) {
		System.out.println("meth2() called " );
		System.out.println("a value is :"+a);
		System.out.println("s value is : "+s);
		
	}
	public static void main(String[] args) {
		ClassD obj = new ClassD();
//		obj.meth1();// c.e 
		obj.meth1(50);
		
		// obj.meth2();
//		obj.meth2("java is awesome",10000);// c. e
		obj.meth2(10,"lovely");
	}

}
