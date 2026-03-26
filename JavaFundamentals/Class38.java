package com.basic.java;

public class Class38 {
	void meth1() {
		int arr[] = {10,20,30,40,50};
		System.out.println("array length value ===  "+arr[2]);
//		System.out.println("array length value :"+arr[5]);// array index out of bound for the length
		//we can pass the elements into the array and 
		//we can retrieve the element from the array with the help of index values.
		
		System.out.println("Retriving the elements from an array using for-loop");
		for(int i=0;i<5;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Retriving the elements in reverse array using for-loop");
		{
			for(int i=4;i>=0;i--) {
				System.out.println(arr[i]);
			}
		}
		System.out.println("retrive the elements using of for each loop");
		for(int x:arr) {
			System.out.println(x);
	}
	
	}
	void meth3() {
		System.out.println("----------meth3()--------");
		for(int a = 1;true;a++) {
			System.out.println("a value is ==="+a);
			
		}
//		System.out.println("-------meth3() will be executed-------");
	}
	public static void main(String[] args) {
		Class38 obj= new Class38();
		obj.meth1();
		obj.meth3();
	}

}

/*for loop will be working of index value 
 * for each loop working of streaming data 
 * in for each loop no semicolon
 * for each also know as enhanced for loop
 * for each loop we cannot working on length */
