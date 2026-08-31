package com.demo.set2;

import java.util.Scanner;

public class PositiveNegativeZeroNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int num=sc.nextInt();
		if(num<0)
		{
			System.out.println("negetive");
			
		}
		else if(num==0)
		{
			System.out.println("zero");
			
		}
		else
		{
			System.out.println("positive");
		}
		
		sc.close();
	}
}
