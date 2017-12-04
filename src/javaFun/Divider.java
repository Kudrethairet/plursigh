package javaFun;

public class Divider extends CalculateBase {
 
	
	public Divider(){
		
	}
	public Divider(double leftVal, double rigthVal){
		super(leftVal, rigthVal);
	}
	
	
	@Override
	public void calculate()
	{
		double value = getLeftVal()/getRightVal();
		setResult(value);
	}
}

