package com.demo.test;

import com.demo.search.SearchingServices;

public class Test {

	public static void main(String[] args) {
		int[] arr= {19,4,5,23,2,11,51};
		int pos=SearchingServices.sequentialSearch(arr, 11);
		if(pos!=-1)
				System.out.println("number found at : "+pos);
		else
			System.out.println("not found");
		
		int[] arr1= {3,7,12,15,26,31,33,34,38,56,67,77,78,89};
		pos=SearchingServices.binarySearchNonRecurssive(arr1, 12);
		if(pos!=-1)
			System.out.println("number found at : "+pos);
	else
		System.out.println("not found");

		
		pos=SearchingServices.binarySearchRecurssive(arr1, 31,0,3);
		if(pos!=-1)
			System.out.println("number found at : "+pos);
	else
		System.out.println("not found");

	}

}