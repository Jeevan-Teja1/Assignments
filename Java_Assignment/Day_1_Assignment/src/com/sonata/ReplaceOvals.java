/*7)	Read the String and replace Ovals with dollar symbol program*/

package com.sonata;

import java.util.Scanner;

public class ReplaceOvals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.nextLine();
        char ch[]=s.toCharArray();
        for (int i = 0; i < ch.length; i++)
        {
               if (ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
               {
                ch[i]='$';
               }   
        }
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }
        sc.close();
	}

}
