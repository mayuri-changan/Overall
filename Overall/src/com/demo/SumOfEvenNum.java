package com.demo.set1;

import java.util.Scanner;

public class SumOfEvenNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any N number");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)	
		{
			
			if(i%2==0)
			{
				System.out.print(+i+"+");
				sum=sum+i;
				
			}
			
			
		}
		System.out.println("="+sum);
		sc.close();

	}




	}


