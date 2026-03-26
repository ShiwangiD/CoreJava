package com.basic.java;

public class Class16 {
	int b = 20;
	int B = 30;
	int ClassA = 50; //highly not recommended
	int String = 90; //highly not recommended
	void meth1() {
		int a = 10;
		// String a = "java "; // duplicate field it generate compile time error
		System.out.println("Hi =====>"+a);
		System.out.println(b);
		System.out.println(B);
	}
	public static void main(String[] args) {
		Class16 obj1 = new Class16();
		obj1.meth1();
	}

}
