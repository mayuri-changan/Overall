package com.demo.set2;

import java.util.Scanner;

public class PrimeNumFrom1ToN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter N num");
		int n=sc.nextInt();
		int total=0;
		for(int num=2;num<=n;num++)
		{
			int count=0;
		
		for(int i=1;i<=num;i++)
		{
		if(num%i==0)
		{
			count++;
		}
		}
		
		if(count==2)
		{
			System.out.println(num);
			total++;
		}
		
		}
		System.out.println("there are total prime numbers are "+total);
		sc.close();
		

	}

}
