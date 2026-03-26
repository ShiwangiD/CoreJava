package com.basic.java;

public class Class34 {
	void meth1(int a) {
		System.out.println("------------meth1()-------------");
		if(a<=5) // 4<=5 the condition is true
		{
			System.out.println("if block is executed !");
		}
		System.out.println("meth1() executed");
	}
	void meth2(int a) {
		
		System.out.println("-----------meth2()----------");
		if(a<10)
//			int x = 90; //c.e we should be not write any declarative statement
			System.out.println("hi");
		System.out.println("meth2() executed");
	}
	
	void meth3(int a) {
		System.out.println("-----------meth3()-------------");
		if(!(a==10))
		{
			System.out.println("if block is executed !");
		}
		else {
			System.out.println("else block is executed !");
		}
		System.out.println("meth3() ececuted !");
	}
	
	int meth4(int a) {
		System.out.println("-------------meth4()-----------");
		if(a<5)
			return a+10;
		    return a-10;
//		    System.out.println("meth4() executed"); c.e because it is unreachable code 
		
	}
	
	void meth5(int a) {
		System.out.println("--------------meth5()--------------");
		if(a<10)
			System.out.println("hi");
		else
			System.out.println("hello");
		System.out.println("meth5() executed ");
	}
	
	void meth6(int a) {
		System.out.println("-----------meth6()--------------");
		if(false) 
		{
			System.out.println("if block executed !"); // dead code 
		}
		else {
			System.out.println("else block is executed !");
		}
		System.out.println("meth6() executed !");
	}
	
	void meth7(int a) {
		System.out.println("-------------------meth7()----------------");
		if(a>0)
		{
			System.out.println(a+"number is possitive");
		}
		else if(a<0)
		{
			System.out.println(a+"is negative number");
		}
		else
		{
			System.out.println(a+"is equal to 0");
		}
		System.out.println("meth7() executed");
	}
	void meth8(int a,int b, int c) {
		System.out.println("---------------meth8()--------------");
		System.out.println("---------nexted if else----------");
		if(a<10) {
			if(b>10)
			{
			 System.out.println("b :"+ b+" is grater than 10");	
			}
			else
			{
				System.out.println("b :" +b+" is less than 10");
				
			}
		}
		else
		{
			if(c>10)
			{
			 System.out.println("c :" +c+" is grater than 10");	
			}
			else
			{
				System.out.println("c :" +c+" is less than 10");
				
			}
			
		}
	}
	public static void main(String[] args) {
		Class34 obj = new Class34();
		obj.meth1(4);
		obj.meth2(50);
		obj.meth3(50);
		obj.meth4(3);
		int result = obj.meth4(30);
		System.out.println("meth4()  is returning ====>"+result);
		obj.meth5(50);
		obj.meth6(40);
		obj.meth7(-5);
		obj.meth8(9, 9, 5);
	}

}

/*
 * Control statements :=
 * control flow statement, change or break the flow of execution by implementation.
 * decision making,looping and branching your program to execution particular.
 * blocks of code based on the  conditions.
 * 
 * 
 * Selection Statements :=
 * java selection statement allows the flow of program executions based upon conditions
 * know only during run time.
 * 
 * java provide four types :--
 * 1. if 
 * 2.else-if
 * 3.if-else-if
 * 4. switch
 * 
 * if(Condition) // true/false
 * {
 *   ----;
 *   ----;
 * }
 * 
 */
