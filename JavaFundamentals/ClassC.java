package com.basic.java;

public class ClassC {
	void meth1() {
		int a = 10;
		System.out.println("a value is :"+a);
		System.out.println(a+90);
		System.out.println(a-90);// 10-90= -80
		
		ClassC obj = new ClassC();// create an object
		obj.meth2();  // calling method 2 in method 1
		System.out.println(1000);
	}
	void meth2() {
		int a = 99; // variable
		System.out.println("meth2 calling");
		System.out.println("Addition value ======>" +(a+1));
	}
	public static void main(String[] args) {
		System.out.println("program is executed");
		ClassC obj = new ClassC();//create an object
		obj.meth1();//calling a method
		System.out.println("end");
		
				
		
	}

}
