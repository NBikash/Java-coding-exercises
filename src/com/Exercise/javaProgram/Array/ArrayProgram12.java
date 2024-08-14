package com.Exercise.javaProgram.Array;

//WAJP to find the largest number present in an Integer Array
public class ArrayProgram12 {
	public static void main(String[] args) {
		int[] a= {7,14,25,22,74,5};
		int small=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]<small) {
				small=a[i];
			}
		}
		System.out.println("Smallest Number Present in this Integer array is "+small);
		
	}

}
