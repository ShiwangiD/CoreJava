package com.basic.java;

public class Class36 {

    void meth1(int a) {
        System.out.println("--------------meth1()---------------");
        while(a <= 10) {
            System.out.println("a value ==========" + a);
            a++;
        }
        System.out.println("meth1() executed");
    }

    void meth2(int a) {
        System.out.println("------------meth2() ---------------");
        while(a <= 20) {
            System.out.println("a value =========" + a);
            a++;
            System.out.println("meth2() executed !");
        }
    }

    void meth3(int a) {
        System.out.println("----------meth3()-----------");
        while(a<=10) {
            System.out.println("a value is ====" + a);
            a++;
        }
        System.out.println("---------meth3() executed ----------");
    }
    
    void meth4(int a) {
    	System.out.println("--------meth4()-----------");
    	do {
    		System.out.println("a value ========="+a);
    		a++;
    	}
    	while(a<=10);
    }

    public static void main(String[] args) {
        Class36 obj = new Class36();
        obj.meth1(1);
        obj.meth2(15);
        obj.meth3(4);
        obj.meth4(20);
        
    }
}