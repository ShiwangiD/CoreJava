package com.basic.java;

public class Class33 {
	void meth1() {
		int i = 50;
		Integer ival = Integer.valueOf(i);
		System.out.println("primitive datatype value :"+i);
		System.out.println("wrapper class object value :"+ival);
		long l = 100L;
		Long lval=Long.valueOf(l);
		System.out.println("PDT value :"+l);
		System.out.println("WCO value :"+lval);// autoboxing 
		
		Integer ival2=Integer.valueOf("500");
		System.out.println("=================");
		System.out.println("Integer WCO  value=========>"+ival2);
		Character cval = Character.valueOf('j');
		System.out.println("character WCO value :"+cval);
	}
	void meth2() {
		Integer ival=new Integer(50);
		Byte bval = new Byte((byte)100);
		Boolean booleanval = new Boolean("trUE");
		Boolean booleanval1 = new Boolean("lovely"); // except true and false compiler given default value of boolean false
		Boolean booleanval2 = new Boolean("false");
		
		
	int x = ival.intValue();
	byte y = bval.byteValue();
	boolean flag =booleanval.booleanValue();
	
	System.out.println("Integer WCO value ===="+ival);
	System.out.println("Byte WCO value ===="+bval);
	System.out.println("boolean WCO value ===="+booleanval);
	System.out.println("boolean WCO value ==="+booleanval1);
	System.out.println("boolean WCO value ==="+booleanval2);
	
	System.out.println("------------------");
	
	System.out.println("int PDT value ==="+x);
	System.out.println("byte PDT ==="+bval);
	System.out.println("boolean PDT ===="+flag);
	
	
	}
	public static void main(String[] args) {
		Class33 obj = new Class33();
		obj.meth1();
		obj.meth2();
	}

}


/*length of array start with one and index of array start with zero
 * collection of multiple similar type elements in continuous block of memory.
 * draw back of array :=
 * 1.the length of array is fixed.
 * 2. Accept only homogeneous datatypes.
 * 3. there is no method support.
 * 
 */
