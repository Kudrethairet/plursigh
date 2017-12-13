package com.plurasight.calcengine;

public class Passenger {

	
	int  freeBags;
	int checkBags;
	public Passenger()
	{
		
		
		
	}
	public Passenger(int freeBegs){
		this.freeBags = freeBegs;
		
		
	}
	public Passenger(int freeBags, int checkedBags)
	{
		this(freeBags);
		this.checkBags= checkedBags;
	}
	
	
	
}
