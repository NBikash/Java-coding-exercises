package com.Exercise.javaProgram.Array;

//WAJP to print only values of Even Index Number
public class ArrayProgram5 {
	public static void main(String[] args) {
		int[] a= {7,14,25,22,74,5};
		System.out.println("Let's Print Even index value..");
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				System.out.println(a[i]);
			}
		}
	}

}
