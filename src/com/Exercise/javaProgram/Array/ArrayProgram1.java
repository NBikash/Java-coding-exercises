package com.Exercise.javaProgram.Array;

import java.util.Scanner;

//WAJP to create an integer array and store five elements and print all elements (By taking human input)
public class ArrayProgram1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=5;
		int[] a=new int[size];
		System.out.println("Please Enter "+size+" Integers");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("Entered Elements are as follows..");
		for(int j=0;j<a.length;j++) {
			System.out.println(a[j]);
		}
	}
	

}
