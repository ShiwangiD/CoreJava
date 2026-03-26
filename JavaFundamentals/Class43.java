package com.basic.java;
import java.util.Scanner;

public class Class43 {
	Scanner sc =new Scanner(System.in);
	void meth1() {
		
		System.out.println("enter the first number:");
		int a=sc.nextInt();
		System.out.println("enter the second number");
		int b=sc.nextInt();
		System.out.println("a:"+a);
		System.out.println("b:"+b);

		System.out.println("Addition value :"+(a+b));
	}
	int meth2() {
		System.out.println("meth2() called");
		System.out.println("please enter the number to return from the mood ");
		return sc.nextInt();
	}
	void meth3(int a,int b) {
		System.out.println("---------meth3() called---------");
		System.out.println("multification value :"+(a*b));
	}
	public static void main(String[] args) {
		Class43 obj=new Class43();
		obj.meth1();
		System.out.println("---------");
		System.out.println("meth2() is returning :"+obj.meth2());
		System.out.println("please enter the two parameter for meth3()");
		obj.meth3(sc.nextInt(),sc.nextInt());
	}

}
