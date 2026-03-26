package com.basic.java;

public class Class26 {
	int x= 10;   // instance variable
	static int y=20; // static variable 
	void meth1() {
		System.out.println("instance variable =="+x);
		System.out.println("static variable =="+y);
		
	}
	static void meth2() {
		System.out.println("instance variable ===>"+new Class26().x);
		System.out.println("static variable ===>"+y);
		
	}
	public static void main(String[] args) {
		Class26 obj = new Class26();
		obj.meth1();
		System.out.println("=========================");
		obj.meth2(); // accessing with class object
		meth2(); // accessing with method name 
		Class26.meth2(); // accessing with class name 
		
//		Class26.meth1(); // compile time error because instance method can be called  with the help of class 
	}

}



/* final variable are constant it can not changed the value 
 * for final static variable ,JVM will be not provided 
 * any default values, it is responsibility of programmer
 * to initialized them.
 * 
 * final static variable 100 %  they should be initialized, weather we are using it or not,
 * otherwise we will be getting compile time error.
 * 
 * Static Method :=
 * a method which is declared as static with static keyword as static method 
 */
 