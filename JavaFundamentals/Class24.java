package com.basic.java;

public class Class24 {
	void meth1(int a) {
		if(a!=10)
		{
			System.out.println("if block is executed");
		}
		else {
			System.out.println("else block is executed ");
		}
		
	}
	
	void voteEligibility(int age) {
		if(age>=18) {
			System.out.println("you are eligible for vote !");
		}
		else {
			System.out.println("you are not eligible for vote!");
		}
		
	}
	void examEligibility(int age) // 23 to 35
	{ 
//		if(age>=23 && age<=35)  // t && f
		if(age>=23 || age <=35) // if any condition is true then o/p is true 
	
		if(!(age>=23 || age <=35))	// alter the conditions
		{ 
			
			System.out.println("qualified for exam !");
		}
		else   {
			System.out.println("not qualified for exam !");
		}
	}
	public static void main(String[] args) {
		Class24 obj = new Class24();
		obj.meth1(50);
		obj.voteEligibility(20);
		obj.examEligibility(40);
//		new Class24().meth1(10);
//		new Class24().voteEligibility(20);
	}

}
