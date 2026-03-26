package com.basic.java;

public class ClassB {
	public void meth() {
		System.out.println("hi");
		ClassB bObj = new ClassB();
		bObj.meth2();
	}
	public void meth2() {
		System.out.println("hello");
	}
	public static void main(String[] args) {
		ClassB bObj = new ClassB();
		bObj.meth();
		bObj.meth2();
		System.out.println("Java is Awesome!!");
	}

}
