package com.basic.java;

public class Class20 {
	void meth1() {
		System.out.println("meth1() called");
	}
	private Class20(String s){
		System.out.println(s);
	}
	Class20(){
		System.out.println("default constructor!");
	}

}


// for the default constructor provided by compiler we can have two access modifier(public and default).
// for the default constructor provided by the programmer we can have  all the four access modifier.
//Just like void method we can write return statement inside a constructor without returning anything.
//If we want to restrict accessing our class methods in other classes then make all our class
// constructor as private .
// Constructor overloading possible  but overriding is not possible .

//Q. what is different between a constructor and methods 

//1.  constructor is use to initialized the object 
// method is used to expose the behavior of an object.
//2. constructor have no return type but method have return type 
//3. constructor is invoke the implicitly and method method is invoke explicitly.
// 4.the java complier provided a default constructor if you don't have any constructor 
// method is not provided by compiler in any case.
//5. constructor name must be  same as  the class name.
// method name may or may not be same as class name.
