package com.Exercise.javaProgram.Array;

import java.util.Arrays;

//WAJP to sort second half of a array element
public class ArrayProgram22 {
	public static void main(String[] args) {
		int[] a= {10,25,41,103,96,4};
		System.out.println("Before Sort");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			
		}
		System.out.println("After Sort");
		Arrays.sort(a,a.length/2,a.length);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			
		}
	}

}
