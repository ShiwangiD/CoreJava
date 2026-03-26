package com.basic.java;

public class Class17 {
	
	void msg(int a) {
		if(a>10) {
			System.out.println("Block of executed !");
		}
		else
		{
			System.out.println("Block are not executed!");
		}
	}
	public static void main(String[] args) {
		new Class17().msg(20);
	}

}
