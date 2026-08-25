package com.demo.set1;

public class FirstTenEvenOdd {

	public static void main(String[] args) {
		System.out.println("First ten even and odd numbers");
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+ " is even number");
			}
			else
			{
				System.out.println(i+" is odd number");
			}
		}
		
		
	}
}
