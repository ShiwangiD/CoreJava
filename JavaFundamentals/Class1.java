package com.basic.java;

public class Class1 {
	public void meth1() {
		System.out.println("meth1() called ");
	}
	public static void main(String[] args) {
		Class1 obj = new Class1();
		obj.meth1();// case 1
		new Class1().meth1(); //case 2
	}

}
