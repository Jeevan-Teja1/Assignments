/*4)	Write a java program to sum values of an array. For example a[5] ={1,2,3,4,5,6} the sum of the values is 21.*/

package com.sonata;

public class SumofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6};
		int x= 0;
		for (int i=0;i<=a.length;i++)
		{
			x=x+i;
		}
		System.out.println(x);
	}

}
