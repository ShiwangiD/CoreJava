package com.basic.java;

public class Class27 {
	static int t = Class27.meth3();
	static int meth3() {
		System.out.println("main() called ");
		return 100;
	}
	final static int x;
	static {
		x = 50;
		System.out.println("1st static block!" +x);
	}
	public static void main(String[] args) {
		System.out.println("main() called");
	}
	static {
		System.out.println("2nd static block!"+x);
	}
	static String meth4() {
		System.out.println("this is fourth static block!");
		return "java is awesome";
	}
	static String data =meth4();
		
	static {
		System.out.println("this is fourth static block!" + data);
		
	}

}


/* Static block :=
 * 
 * 
 */
