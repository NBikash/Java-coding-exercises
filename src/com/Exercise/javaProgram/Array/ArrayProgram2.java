package com.Exercise.javaProgram.Array;

//WAJP to print sum of all integers present in an integer array 
public class ArrayProgram2 {
	public static void main(String[] args) {
		int a[]= {10,20,30,40};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println("Sum of All integers present inside Array is ="+sum);
	}

}
