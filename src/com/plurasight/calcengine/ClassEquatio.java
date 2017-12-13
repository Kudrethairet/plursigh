package com.plurasight.calcengine;

public class ClassEquatio {

	private double leftVal;
	private double rightVal;
	private  char opCode=0;
	private double result;
	
	public double getLeftVal(){return leftVal;}
	public void  setLeftVal(double leftVal){this.leftVal=leftVal;}
	public double getRightVal(){return rightVal;}
	public void setRightVal(double rightVal){this.rightVal=rightVal;}
	public char getOpCode(){return opCode;}
	public void setOpCode(char opCode){this.opCode=opCode;}
	
	public double getResult(){return result;}

	
	public ClassEquatio(){
		
	}
	
	public ClassEquatio(char opCOde)
	{
		this.opCode=opCOde;
	}
	
	public ClassEquatio(char opCode, double leftVal, double rightVal)
	{
		this(opCode);
		this.leftVal=leftVal;
		this.rightVal=rightVal;
		
	}
	
	
	
	public void exceute(double leftVal, double rightVal){
		
		this.leftVal=leftVal;
		this.rightVal=rightVal;
		
		exceute();
		
		
	}
	
	public void exceute(int leftVal, int rightVal){
		
		this.leftVal=leftVal;
		this.rightVal=rightVal;
		
		exceute();
		
		
		result = (int)result;
		
	}
	
	
	public void exceute()
	{

		
		switch(opCode) {
		case 'a':
		result = leftVal + rightVal;
		break;
		case's': 
		result = leftVal- rightVal;
		break;
		case 'd':
		result = rightVal!=0.0d? leftVal / rightVal: 0.0d;
		break;
	 
		case 'm':
		result=leftVal*rightVal;
		break;
	default:
		System.out.println("Error ~ invalid opCode");
		result= 0.0d;
		break;
		}


	}
	
	
	
}
