package com.demo.set1;

import java.util.Scanner;

public class EvenOddFrom1ToN {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any N number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)	
		{
			
			if(i%2==0)
			{
				System.out.print("\n"+i+" even\n");
				
			}
			else
			{
				System.out.print("\n"+i+" odd");
			}
		}
		sc.close();

	}

}
