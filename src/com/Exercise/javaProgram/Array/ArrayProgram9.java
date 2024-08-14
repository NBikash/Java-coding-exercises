package com.Exercise.javaProgram.Array;

import java.util.Scanner;

//WAJP to create a String Array and store Five names then print all names (User Defined)
public class ArrayProgram9 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=5;
		String names[]=new String[size];
		System.out.println("Enter Five Names");
		for(int i=0;i<names.length;i++) {
		    names[i]=s.nextLine();
		}
		System.out.println("Entered Names are as Mentioned below..");
		for(int j=0;j<names.length;j++) {
			System.out.println(names[j]);
		}
	  
	}

}
