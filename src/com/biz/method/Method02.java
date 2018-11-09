package com.biz.method;

public class Method02 {
	
	public static void main(String[] args) {
		
		addVar();
		addVar(20,30);
		addVar(50,100);
		System.out.println(addVarReturn(50,20));
		
		int intVas=addVarReturn(5,8);
		System.out.println(intVas);
	}
	
	public static void addVar() {
		
		int intNum1=20;
		int intNum2=30;
		int intSum=intNum1+intNum2;
		System.out.println(intSum);
		
	}
	
	public static void addVar(int intNum1, int intNum2) {
		
		int intSum=intNum1+intNum2;
		System.out.println(intSum);
	}
	
	public static int addVarReturn(int intNum1, int intNum2) {
		
		int intSum=intNum1+intNum2;
		return intSum;
		
	}

}
