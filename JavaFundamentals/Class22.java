package com.basic.java;

public class Class22 {
	void meth1() {
		int a = 10; 
		System.out.println(a); // 10
		System.out.println(++a); //11
		System.out.println(a++);//11
		System.out.println(a); //12
		
		int b = 15;  // b = 15
		System.out.println(b++);
		b++;
		System.out.println(b--);
		System.out.println(++b);
		b--;
		System.out.println(b++);
		System.out.println(--b);
		b++;
		System.out.println(b--);
		b--;
		--b;
		System.out.println(b++);
		System.out.println(b);
		
		System.out.println("############### Operation ##############");
		
		 int c = 10;
		 int d = c++;
		 System.out.println(c);
		 System.out.println(d);
	}
	public static void main(String args[]) {
		new Class22().meth1();
	}

}








/* ############### Operators ##################

1. Increment Operator Or  Decrement Operator 
  ========== Increment (++) =======
   i) Pre-Increment (before operation)
   ii) Post-Increment(after operation)
   
   =========== Decrement (--) =========
   i) pre-Decrement(before)
   ii) post-decrement(after)
   
   
   
2. Arithmetic Operator 
3. Relational Operator 
4. Logical Operator 

*/
