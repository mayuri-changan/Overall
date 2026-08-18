package com.demo;

public class Exception {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int i;
		try
		{
			 i=12/0;
			 
			 
		}
		catch(ArithmeticException e )
		{
			System.out.println("cant divide by 0");
			
	
		}	
	}
}


