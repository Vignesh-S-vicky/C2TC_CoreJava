package com.tnsif.Day_6.usingfinal;
public class FinalVariable {



	final int x = 100;

	final static int Y;


	final static int Z = 10;


	void change() {
		x = 30; // final variables can't be reassigned
		Y = 200; // final static variables can't be reassigned
	}

	@Override
	public String toString() {
		return "FinalVariable [x=" + x + ", Y" + Y + "]";
	}

	// Declare a static block to initialize the final static variable.
	static {
		Y = 20;
		Z = 100; 
		System.out.println("Value of Y: " + Y);
	}

	
}