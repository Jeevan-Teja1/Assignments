/*3)	Write a java program to display the cube of the given number for ex: if given number is 2 then cube of it is 8*/

package com.sonata;

import java.util.Scanner;

public class Cube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int x = sc.nextInt();
		System.out.println(Math.pow(x, 3));
		sc.close();

	}

}
