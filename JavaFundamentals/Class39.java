package com.basic.java;

public class Class39 {
	void meth1(int num) {
		System.out.println("----------meth1()------------");
		for(int i=1;i<=0;i++)
			System.out.println(num+"*"+i+"="+(num*i));
		System.out.println("printing the value of num "+num);
		System.out.println("--------meth1() executed method ");
			
	}
	public static void main(String[] args) {
		new Class39().meth1(2);
	}

}
