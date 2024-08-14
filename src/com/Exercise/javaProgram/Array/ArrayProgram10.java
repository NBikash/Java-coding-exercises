package com.Exercise.javaProgram.Array;

import java.util.Scanner;

//WAJP to create a character array and store five characters then print all characters
public class ArrayProgram10 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);		
		int size=5;
		char ch[]=new char[size];
		System.out.println("Enter five Characters");
		for(int i=0;i<ch.length;i++) {
			ch[i]=s.next().charAt(0);
		}
		System.out.println("Entered Characters are..");
		for(int j=0;j<ch.length;j++) {
			System.out.println(ch[j]);
		}
			
	}

}
