package com.Exercise.javaProgram.Array;

import java.util.Scanner;

//WAJP to Merge two integer array by creating methods 
public class ArrayProgram18 {
	//Method to create array by taking size and elements of integer array
	public int[] takeData() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size Of Array");
		int size=s.nextInt();
		int[] a=new int[size];
		System.out.println("Enter int Elements");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		return a;
		
	}
	//Method to Merge Array 
	public int[] mergeArray(int[] a,int[] b) {
		int[] res=new int[a.length+b.length];
		for(int i=0;i<a.length;i++) {
			res[i]=a[i];
		}
		for(int j=0;j<b.length;j++) {
			res[a.length+j]=b[j];
		}
		return res;
	}
	public static void main(String[] args) {
		ArrayProgram18 ar=new ArrayProgram18();
		int[] array1=ar.takeData();
		int[] array2=ar.takeData();
		int[] mergeRes=ar.mergeArray(array1, array2);
		System.out.println("Merged Array Elements are: ");
		for(int i=0;i<mergeRes.length;i++) {
			System.out.println(mergeRes[i]);
		}
		
		
	}

}
