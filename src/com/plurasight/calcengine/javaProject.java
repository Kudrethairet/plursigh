package com.plurasight.calcengine;

public class javaProject {
	
	
	public static void main(String[] args) {
		
		double val1=100;
		double val2=50;
		double result;
		
		char opCode='d';
		
		if(opCode =='a')
			result = val1+val2;
		else if(opCode=='s')
		result=val1-val2;
		else if(opCode=='d')
			result=val1/val2;
		else if(opCode=='m')
			result=val1*val2;
		else 
			System.out.println("Error");
			result=0.0d;
		System.out.println(result);
		
		
		
		
		
		
	}
	
	

}
