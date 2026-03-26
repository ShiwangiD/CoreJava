package com.basic.java;

public class Class32 {
	void implicit() {
		byte b = 10;
		System.out.println("byte value is ==>"+b);
		short s=b;
		System.out.println("short value is ===>"+s);
		s++;
		int i=s++;
		System.out.println("int value is ===>"+i);
		System.out.println("short value is ===>"+s);
		long l = i;
		System.out.println("long value is ===>"+(--l));
		float f = l;
		System.out.println("flaot value is ===>"+(f+l));
		double d = (--f);
		System.out.println("double values is ===>"+d);
		show();
		if(!(d==f)) {
			System.out.println("equal");
		}
		else {
			System.out.println("not equal");
		}
	}
	public static void main(String[] args) {
		Class32 obj = new Class32();
		obj.implicit();
		
	}
	static void show() {
		char c ='A';
		int a = ++c;
		System.out.println(a);
		Class32 obj = new Class32();
		String s = obj.meth1();
		System.out.println(s);
	}
	String meth1() {
		String S= "Implicit casting is done by the compiler automatically";
		return S;
	}

}
