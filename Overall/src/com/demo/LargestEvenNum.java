package com.demo.set1;

import java.util.Scanner;

public class LargestEvenNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any N number");
		int n=sc.nextInt();
		int large=0;
		for( int i=1;i<=n;i++)	
		{
			
			if(i%2==0 && i>large)
			{
				System.out.print(i+" ");
				large=i;
				
			}
			
			
		}
		System.out.println("LargerEvenNum is="+large);
		sc.close();

	}




	}




