/*1)	Declare three number variables with value as 12,25,89 find the greatest number and display.*/

package com.sonata;

public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		a=12;
		b=25;
		c=89;
		if ((a>b) && (a>c))
		{
			System.out.println(a+" is the greatest number");
		}
		else if (b>c)
		{
			System.out.println(b+" is the greatest number");
		}
		else
		{
			System.out.println(c+" is the greatest number");
		}

	}

}
