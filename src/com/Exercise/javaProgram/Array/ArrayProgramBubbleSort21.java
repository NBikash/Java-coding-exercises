package com.Exercise.javaProgram.Array;

//Sort array element using Bubble sort 
public class ArrayProgramBubbleSort21 {
	public static void main(String[] args) {
		int[] a= {140,20,70,51,85};
		int n=a.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("After Sorting");
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
		
	}

}
