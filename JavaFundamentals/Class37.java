package com.basic.java;

public class Class37 {
	void meth1() {
		for(int a=1; a<=10;a++)
		{
			System.out.println("a value ======"+a);
		}
		System.out.println("--------meth1() executed-------");
	}
	void meth2() {
		System.out.println("---------meth2()------------");
		for(int a=10;a>=5;a--) {
			System.out.println("a value ======"+a);
		}
		System.out.println("------------meth2() executed--------------");
	}
	void meth3() {
		System.out.println("----------meth3()---------------");
		int i = 1;
		for(;i<=10;i++) {
			System.out.println("i value ==="+i);
			i++;
			i++;
			}
		System.out.println("----------meth3() executed----------");
	}
	void meth4() {
		System.out.println("----------meth4() called---------");
	}
	int meth5() {
		System.out.println("--------meth5() called----------");
		return 1;
		
	}
	void meth6() {
		System.out.println("-----------------");
	}
	void meth7() {
//		int i = new Class37().meth5();
		
		int i = 1;
		for(System.out.println("----------------------");i<=5;){
			System.out.println("i value =====>"+i);
			i++;
		}
		System.out.println("---------meth7() executed-------------");
	}
	void meth8() {
		Class37 obj= new Class37();
		System.out.println("----------meth8()------------");
		for(int i=obj.meth5();i<=5;obj.meth6())
		{
			System.out.println("i value ==="+i);
			i++;
		}
		System.out.println("---------meth8() executed-------");
	}void meth9(){
		for(int i=1;i<=5;i++) {
			System.out.println("i value is ===="+i);
		}
		System.out.println("---------meth9() executed-------------");
	}
	void meth10() {
		System.out.println("--------meth10()----------");
		for(int i=1;true;i++) {
			System.out.println("i value is ==="+i);
		}
//		System.out.println("---------meth10() executed --------------"); // c.e unreachable code 
	}
	void meth11() {
		System.out.println("--------meth11()-----------");
		for(int i=1;i<=10;) {
			System.out.println("i value is ==="+i);
		}
		System.out.println("---------meth11() executed------------");
	}
	
	public static void main(String[] args) {
		Class37 obj = new Class37();
//		obj.meth1();
//		obj.meth2();
//		obj.meth3();
//		obj.meth7();
//		obj.meth8();
//		obj.meth9();
		
		
	}

}
