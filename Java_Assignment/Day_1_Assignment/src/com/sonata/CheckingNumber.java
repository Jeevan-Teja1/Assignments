/*5)	Write a java program to test if an array contains a specific value*/

package com.sonata;

public class CheckingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5,6};
		int x=5;
		int l=0;
		for (int i=0;i<=a.length;i++)
		{
			if (a[i]==x)
			{
				break;
			}
			l++;
		}
		if (l==a.length)
		{
			System.out.println("Element not found");
		}
		else 
		{
			System.out.println("Elemrnt found at "+l+"th position");
		}

	}

}
