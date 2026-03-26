package com.basic.java;

public class Class15 {
	void meth1(){
		System.out.println("hello beautiful java program");
	}
	public static void main(String[] args) {
		Class15 obj = new Class15();
		Class15 obj1 = new Class15();
		System.out.println("obj hashCode ===>"+obj.hashCode());
		System.out.println("obj hashCode ===>"+obj1.hashCode());
		
		System.out.println(obj.equals(obj));// o/p ==> true because comparing same object 
		System.out.println(obj1.equals(obj));//false
		System.out.println(obj1.equals(obj));//false
		
		
		System.out.println("getClass method ====>"+obj.getClass());
		
		System.out.println("toString method ====>"+obj.toString());
		
	}

}


/*hashCode():-
 ---------------
 1. hashCode will provide a unique identification number for your class Object.
2.  which is use to distinguish our class object from  other objects.
3.  it will not provide the address location of the Object.
4.  hashCode () methods is a predefine methods
 
 
 
 equals():-
 ----------------
1. the return type of equals method is boolean(true/false). It returns true
2. if both object address locations are same . if returns false if address locations are 
3. different. equals() ==>methods checks the address locations.
 
 
 getClass():-
 --------------
 1. It will return the fully qualified name of our class.
 
 toString() :-
 ----------------
 1. It is used to convert an object into string represented format(HexaInterger code).
 
 
 finalize() :-
 ---------------
1. It is internally called by the garbage collector.
2. garbage collector used to remove or  destroy all unused or unreferenced
Object from the heap memory. Garbage collector will acting on our program
if there is any object eligible for destruction.
 
 
 */
