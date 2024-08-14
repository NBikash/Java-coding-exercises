package com.Exercise.javaProgram.Array;

//WAJP to print only even number present inside an integer array
public class ArrayProgram3 {
	public static void main(String[] args) {
		int[] a= {7,14,25,22,74,5};
		System.out.println("Even Numbers are as follows..");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
			
		}
	}

}
