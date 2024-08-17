package com.Exercise.javaProgram.Array;

import java.util.Scanner;

//WAJP to read n product prices from user and store it in a container then find average value/price
public class ArrayProgram13 {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int n=5;
		int sum=0;
		System.out.println("Enter "+n +"Product Prices");
		int price[]=new int[n];
		for(int i=0;i<price.length;i++) {
			price[i]=s.nextInt();
		}
		
		for(int j=0;j<price.length;j++) {
			sum=sum+price[j];
		}
		int average=sum/n;
		System.out.println("Average price of all entered amounts is: "+average);
	}

}
