package com.demo.set2;

import java.util.Scanner;

public class FactorialNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num");
		int num=sc.nextInt();
		int fact=1;
		{
			for(int i=1;i<=num;i++)
			{
				fact=fact*i;
				
			}
			System.out.println(fact);
			
			
		}
		sc.close();


	}

}
