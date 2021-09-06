/*10)Write a program to identify 2 large numbers in an array.*/

package com.sonata;

import java.util.Arrays;  

public class LargeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5,6};
		Arrays.sort(a);
		System.out.println("Largest num = "+a[a.length-1]+"\n Second loargest num = "+a[a.length-2]);
		

	}

}
