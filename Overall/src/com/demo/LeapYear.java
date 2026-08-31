package com.demo.set2;
import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num1");
		int num1=sc.nextInt();
		if(num1%4==0||num1%400==0&&num1%100!=0)
		{
			System.out.println("leap year");
			
		}
		else
		{
			System.out.println("not leap year");
		}
		sc.close();

	}

}
