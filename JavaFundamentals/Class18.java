package com.basic.java;

public class Class18 {
	void meth1(int a) { // start main 
		
		System.out.println(30);   
		if(a<10) {
		System.out.println(10);
		return;
		}
		else {
		System.out.println(20);
		return;
		}
		
		
	}
	int meth2() {
		System.out.println(" meth2() called =====>");
		return 10;
//		System.out.println("java is awesome!");  // compile time error 
	}
	
String meth3(int a) {
	System.out.println("meth3() called =====> ");
	if(a>10) {
		System.out.println("execute the block");
		return "hiii";
	}
	else {
		System.out.println("not execute the method");
		return "helloo";
	}
}
	public static void main(String[] args) {
		System.out.println("Start");
		Class18 obj1 = new Class18();
		obj1.meth1(20);
		System.out.println("======>"+obj1.meth2());
		System.out.println("meth3() called =====>"+obj1.meth3(10));
		
		System.out.println("end");
	}

}
