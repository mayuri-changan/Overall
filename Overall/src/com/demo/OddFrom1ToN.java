package com.demo.set1;

import java.util.Scanner;

public class OddFrom1ToN {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any N number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)	
		{
			
			if(i%2!=0)
			{
				System.out.print(i+" ");
				
			}
			
		}
		sc.close();

	}




	}


