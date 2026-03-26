package com.basic.java;

public class Class19 {
	void meth1() {
		System.out.println("meth1() called ");
	}
	Class19(){
		System.out.println("non para metrized constructor");
	}
	Class19(String s){
		System.out.println("parameterised constructor");
	}
	public static void main(String[] args ) {
		Class19 obj = new Class19();
		Class19 obj1 = new Class19("hello parameterised constructor ");
		obj.meth1();
		
	}

}

// ############## Key Point ###############

// 1. We need to initialized  class and object  with available in class ===> constructor
// 2. default constructor and parameterized constructor is also same 
// for the constructor provided by programmer

// 3. Default constructor ====> Compiler  non parameterized constructor ====> Programmer
//4.  if we are not providing any constructor in our program (i.e.., either parameterized
//or  non- parameterized constructor ) then compiler will automatically provide our
//program with a default constructor .

