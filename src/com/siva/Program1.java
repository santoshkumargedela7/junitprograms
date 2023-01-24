package com.siva;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the string:");
			String str = sc.nextLine();
			int l = str.length();
			String str1 = "";
			String str2 = "";
			
			if(l%2==0) {
				str1 = str.substring(0, l/2);
				str2 = str.substring(l/2, l);
				System.out.println(str1+" ,  "+str2);
			}
			else {
				System.out.println("The given string cannot be divided into two equal parts");
			}
		}
	}

}
