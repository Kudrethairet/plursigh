package datatype;

import java.net.Inet4Address;

public class Stringprac {

	public static void main(String[] args) {
		/*
		 * String s1= "i am"; s1 +=" Kudret"; // System.out.println(s1);
		 * 
		 * String s2= "i"; s2 += " am Kudret"; // System.out.println(s2);
		 * 
		 * if(s1==s2) { System.out.println("same=="); } else if(s1.equals(s2)) {
		 * System.out.println("equal"); }
		 * 
		 * 
		 * 
		 * String s3 = s1.intern(); // System.out.println(s3);
		 * 
		 * String s4 = s2.intern();
		 * 
		 * if(s3==s4) { System.out.println("intern"); }
		 * 
		 */

		/*
		 * int iVal = 100; String sVal= String.valueOf(iVal);
		 * System.out.println(sVal);
		 */

/*		StringBuilder sb = new StringBuilder(40);
		String location = "Florida";
		int myFlight = 175;

		sb.append("I flew to ");
		sb.append(location);
		sb.append(" on ");
		sb.append(myFlight);

		System.out.println(sb);
		
		String flynum = String.valueOf(myFlight);
		int time = 9; 
		int pos = sb.length()-" on ".length() - flynum.length();
		System.out.println(pos);
		sb.insert(pos, " at ");
		sb.insert(pos+4, time);
		System.out.println(sb);
*/
	
		/*Integer a = 100;
		int b = a ;
		Integer c = b;
		
		Integer d = Integer.valueOf(b);
		int e = d.intValue();
		Integer f = Integer.valueOf(e);
		
		String s = "87. 44";
		double s1 = Double.parseDouble(s);
		Double s2 = Double.valueOf(s);*/
		
		
		
		Integer i1000A = 10*10*10;
		Integer I1000B = 100*10;
		
		if(i1000A==I1000B)
		{
			System.out.println("fine");
		}
		
		
		Integer i8A = 4*2;
		Integer i8B = 2*2*2;
		
		if(i8A == i8B)
		{
			System.out.println("something");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	}

}
