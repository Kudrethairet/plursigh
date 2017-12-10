package javaFun;

public class CalEngine {

	public static void main(String[] args) {
	/*	double[] leftVals={100.0d, 25.0d, 225.0d, 11.0d};
		double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
		char[] opcodes={'d','a','s','m'};
		double[] results = new double[opcodes.length];*/
	
		/*ClassEquatio eq = new ClassEquatio();
		eq.exceute();
		System.out.print("Test=");
		System.out.println(eq.getResult());*/
		
		String[] statements ={
				"divide 100.0 50.0",
				"add 25.0 92.0",
				"subtract 225.0 17.0",
				"multiply 11.0 3.0"
		};
		
		CalculateHelper helper = new CalculateHelper();
		for(String statement: statements)
		{
			helper.process(statement);
			System.out.println(helper);
		}
		
		
		
		
		
		
		
	/*	ClassEquatio[] eq = new ClassEquatio[4];
		eq[0]= new ClassEquatio('d', 100.0d, 50.0d);
		eq[1]=new ClassEquatio('a', 25.0d, 92.0d );
		eq[2]=new ClassEquatio( 's',225.0d, 17.0d);
		eq[3]=new ClassEquatio( 'm', 11.0d, 3.0d);
		
		for(ClassEquatio eqs:eq ){
			eqs.exceute();
			System.out.print("result = :");
			System.out.println(eqs.getResult());
		}*/
		
		
		
		/*System.out.println();
		System.out.println("Using Overloaing");
		System.out.println();

		
		double leftDouble= 9.0d;
		double rightDouble = 4.0d;
		
		int  leftInt = 9;
		int rightInt = 4;
		
		
		
		ClassEquatio equationOverloading = new ClassEquatio('d');
		
		equationOverloading.exceute(leftDouble, rightDouble);
		System.out.println("Result");
		System.out.println(equationOverloading.getResult());
		
		
		equationOverloading.exceute(leftInt, rightInt);
		System.out.println("Result");
		System.out.println(equationOverloading.getResult());
	
		equationOverloading.exceute((double)leftInt, rightInt);
		System.out.println("Result");
		System.out.println(equationOverloading.getResult());
		*/
		
		
		
		System.out.println();
		System.out.println("Using Inheritance");
		System.out.println();
		
		CalculateBase[] calculators = {
			new Divider(100.0d, 50.0d),
			new Adder(25.0d, 92.0d),
			new Subtracter(225.0d, 17.0d),
			new Multiplier(11.0d, 3.0d),
			
				
		};
		
		
		/*for(CalculateBase calculator: calculators)
		{
			calculator.calculate();
			System.out.print("result=");
			System.out.println(calculator.getResult());
		}*/
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
		
		
		//System.out.println(results);

	
	
	
	
	public static ClassEquatio create(double leftVal, double rightVal, char opCode )
	{
		ClassEquatio eq = new ClassEquatio();
		eq.setLeftVal(leftVal);
		eq.setRightVal(rightVal);
		eq.setOpCode(opCode);
		
		return eq;
		
		
	}
}
