package com.Exercise.javaProgram.Array;

//WAJP to find the largest number present in an Integer Array
public class ArrayProgram11 {
	public static void main(String[] args) {
		int[] a= {7,14,25,22,74,5};
		int large=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>large) {
				large=a[i];
			}
		}
		System.out.println("Largest Number Present in this Integer array is "+large);
	}

}
