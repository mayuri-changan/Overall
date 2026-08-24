package com.demo;

import java.util.Scanner;

public class DivisibleBy2and5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any N number");
		int n=sc.nextInt();
		
			
			if(n%2==0 && n%5==0)
			{
				System.out.println("dividible by 2 and 5");				
			}
			else
			{
				System.out.println("not dividible by 2 and 5");
				
			}
			
			
		
	
		sc.close();

	}




	}




