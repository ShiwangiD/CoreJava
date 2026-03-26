package com.basic.java;

public class Class30 {
	static int a =0;
	int b =0;
	Class30()
	{
		a++;
		b++;
		System.out.println("Static variable ===>"+a);
		System.out.println("Instance Variable ====>"+b);
		System.out.println("==============");
		
	}
	void display() {
		System.out.println("********* Access Static variable ********");
		System.out.println(Class30.a);
		System.out.println(a);
		System.out.println(new Class30().a);
	}

	public static void main(String[] args) {
		new Class30();
		new Class30();
		new Class30();
		System.out.println("################################");
		new Class30().display();
	}
}
