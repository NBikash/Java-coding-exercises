package com.Exercise.javaProgram.Array;

import java.util.Arrays;

//Sort array elements using inbuit method 
public class ArrayProgram20 {
	public static void main(String[] args) {
		int[] a= {140,20,70,51,85};
		System.out.println("Before Sorting");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			
		}
		System.out.println("After Sorting");
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			
		}
	}

}
