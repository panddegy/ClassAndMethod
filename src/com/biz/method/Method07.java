package com.biz.method;

public class Method07 {
	
	public static void main(String[] args) {
		
		int intNum1 =100;
		System.out.println("a: "+intNum1);
		addVar(100);
		System.out.println("b: "+intNum1);
		addVar(intNum1);
		System.out.println("c: "+intNum1);
		intNum1=addVar(intNum1);
		System.out.println("d: "+intNum1);
	}
	
	public static int addVar(int intNum1) {
		
		intNum1 += 200;
		
		return intNum1;
	}

}
