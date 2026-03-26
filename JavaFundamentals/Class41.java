package com.basic.java;

public class Class41 {
	void meth1() {
		for(int i=1;i<=10;i++) {
			if(i==5) {
				break;
			}
			System.out.println("i value ="+i);
		}
		System.out.println("compiler come the for loop ");
	}
	void meth2() {
		for(int j=1;j<=10;j++) {
			if(j==5) {
				continue;
			}
			System.out.println("j vlaue ="+j);
		}
		System.out.println("compiler come the for loop");
	}
	void meth3() {
		for(int k=1;k<=10;k++) {
			if(k==5) {
				return;
			}
			System.out.println("k value ="+k);
		}
		System.out.println("compiler come the for loop");
	}
	public static void main(String[] args) {
		Class41 obj = new Class41();
		obj.meth1();
		System.out.println("----------meth1() is ended --------");
		obj.meth2();
		System.out.println("--------meth2() is ended---------- ");
		obj.meth3();
		System.out.println("-----meth3() is ended--------");
	}

}
