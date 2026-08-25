package com.demo.set1;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println(num + " is even num");
			//show output like 2  is even num
			//show output like 5 is odd num
			
		}
		else
		{
			System.out.println(num + " is odd num");
			
		}
		sc.close();
	
		
		

	}

}
