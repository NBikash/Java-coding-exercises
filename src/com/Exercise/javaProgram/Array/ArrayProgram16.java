package com.Exercise.javaProgram.Array;

import java.util.Arrays;

//WAJP to print Second largest number present in an integer array
public class ArrayProgram16 {
	public static void main(String[] args) {
		int[] num= {20,50,24,74,55};
		Arrays.sort(num);
		System.out.println("Second Largest Number in this Integer Array is "+num[num.length-2]);
	}

}
