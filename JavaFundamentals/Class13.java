package com.basic.java;

public class Class13 extends Object{
	void meth1() {
		int a= 10;
		int b= 20;
		int c = a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		Class13 obj = new Class13();
		obj.meth1();
		
		obj.hashCode();
		
		// hashCode present in object class and every java class by default child of object class
		// all child class method is access object parent class no need to extends object class because its predefine class
	}

}
