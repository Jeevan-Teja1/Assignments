/*8)	Write a program to identify duplicate values in an array*/

package com.sonata;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,1,2};
		for (int i=0;i<a.length;i++)
		{
			for (int j=0;j<i;j++)
			{
				if(a[j]==a[i])
				{
					System.out.println(a[j]);
				}
			}
		}

	}

}
