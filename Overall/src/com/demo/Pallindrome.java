package com.demo.set2;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num");
		int num=sc.nextInt();
		int rev=0;
		int original=num;
		
		while(num!=0)
		{
			int digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		if(original==rev)
		{
			System.out.println("pallindrome");
		}
		else
		{
			System.out.println("not pallindrome");
		}
		sc.close();

	}

}
