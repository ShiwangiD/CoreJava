package com.basic.java;

public class Class25 {
	static int count; // instance variable  then jvm automatically provide default value here 0 then +1
	int x;
	Class25(){
		
		count++; 
		x++;
		System.out.println("static varible ==="+count);
		System.out.println("instance variable ==="+x);
	}
	public static void main(String[] args) {
		new Class25();
		new Class25();
		new Class25();
	}

}
/*
 *Understanding static keywords ====>
 * static keyword in java it is used for memory management.
 * static declared in three way ==> 1. varible, 2. method, 3.block.
 * 
 *Static Variable ==>
 *1.static variable will be initialized at the time of class loading .
 *2.memory for the static variables will be assign at the time of class loading not at the time running.
 *3. there will be only one copy of  static variable available for the entire program
 *### ClassLoader ===> loading ,linking and initializing. 
 *
 *Instance variable :==>
 *for every instance object separate copy will be mainteneted
 */
