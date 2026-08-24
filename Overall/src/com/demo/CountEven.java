package com.demo;

import java.util.Scanner;

public class CountEven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any N number");
		int n=sc.nextInt();
		int evenCount=0;
		for( int i=1;i<=n;i++)	
		{
			
			if(i%2==0)
			{
				System.out.print(i+" ");
				evenCount++;
				
			}
			
			
		}
		System.out.println("\nTotal count of even numbers is = "+evenCount);
		sc.close();

	}




	}




