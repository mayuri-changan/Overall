package com.demo;

public class MultipleException {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int i;
		try
		{
			 i=12/0;
			 i = Integer.parseInt("abc");
			 
		}
		catch(ArithmeticException e )
		{
			System.out.println("cant divide by 0");
			
		}
		catch( NullPointerException n)
		{
			System.out.println("error");
			
		}
		catch(NumberFormatException t)
		{
			System.out.println("format not found");
			
		}
		
	}

}

