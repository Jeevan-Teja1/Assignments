/*9)	Read the highest count of duplicates from array of integers*/

package com.sonata;

public class HighestCountDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,1,2,1};
		int maxCounter = 0;
		 int element=0;
		 for (int i = 0; i <a.length ; i++) {
		 int counter =1;
		 for (int j = i+1; j <a.length ; j++) {
		 if(a[i]==a[j]){
		 counter++;
		 }
		 }
		 if(maxCounter<counter){
		 maxCounter=counter;
		 element = a[i];
		 }
		 }
		 System.out.println("Element repeating maximum no of times: " + element + ", maximum count: " + maxCounter);
		 }
	}