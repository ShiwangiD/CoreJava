package com.basic.java;

public class Class40 {
	void display(int n) {
		for(int i=0; i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Class40 obj = new Class40();
		obj.display(5);
	}

}
