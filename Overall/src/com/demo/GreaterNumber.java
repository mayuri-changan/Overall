package com.demo.set2;

import java.util.Scanner;

public class GreaterNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num1");
		int num1=sc.nextInt();
		System.out.println("enter num2");
		int num2=sc.nextInt();
		if(num1>num2)
		{
			System.out.println("num1 is greater");
		}
		else if(num2>num1)
		{
			System.out.println("num2 is greater");
		}
		else
		{
			System.out.println("both are equal");
		}
		
		
		sc.close();
		
		

	}

}
