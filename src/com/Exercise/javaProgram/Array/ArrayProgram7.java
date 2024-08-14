package com.Exercise.javaProgram.Array;

//WAJP to print sum of all Even numbers present in an array
public class ArrayProgram7 {
	public static void main(String[] args) {
		int[] a= {7,14,25,22,74,5};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				sum=sum+a[i];
			}			
		}
		System.out.println("Sum of All Even Numbers is "+sum);
	}
}
