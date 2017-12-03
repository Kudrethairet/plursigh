package javaFun;

public class conditionalLogicOp {

	public static void main(String[] args) {

		/*
		 * int v1 = 7; int v2 = 5; int vMax = v1>v2 ? v1:v2;
		 * System.out.println(vMax);
		 */

		/*
		 * 
		 * int v1 = 10; int v2 = 10; if(v1>v2) System.out.println("v1 is bigger"
		 * ); else if(v1==v2) { System.out.println("same"); } else
		 * System.out.println("v2 is bigger");
		 */

		// block statement
		/*
		 * int v1= 10, v2=4, diff; if(v1>v2) { diff=v1-v2; System.out.println(
		 * "v1 is bigger"); System.out.println(diff); } else if(v2>v1) {
		 * diff=v2-v1; System.out.println("v2 is bigger");
		 * System.out.println(diff); } else System.out.println(
		 * "v1 and v2 are equal");
		 */
/*
		float student = 0.0f;
		float rooms = 4.0f;

		if (student > 0.0f) {

			if (rooms > 0.0f)

				System.out.println(student / rooms);
		} else
			System.out.println("no students");

		System.out.println();*/
/*
		float students = 30.0f;
		float rooms = 4.0f;
		float avg = 0.0f;
		if(rooms>0)
		{
			System.out.println(students);
			System.out.println(rooms);
			 avg = students/rooms;
		}
		
		
		System.out.println(avg);*/
		
		
		
		
		
		
		//logical operators
/*		
		
		int kVal=5;
		int factorial = 1;
		while(kVal>1)
		{
			factorial*=kVal;
			kVal-=1;
		}
		System.out.println(factorial);*/
		
		float[] values= new float[3];
		values[0]=10.0f;
		values[1]=20.f;
		values[2]=15.0f;
		
		/*float sum = 0.0f;
		
		for(int i=0; i<values.length; i++)
		{
			sum +=values[i];
		}
		System.out.println(sum);*/
		
		
		float sum=0.0f;
		for(  float f : values)
		{
			sum+=f;
		}
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
