package com.Exercise.javaProgram.Array;

//WAJP to find key element i an integer array i.e. 30 is present in integer array or not , HERE 30 is key value 
public class ArrayProgramLinearSearch23 {
	public static void main(String[] args) {
		int[] a= {10,20,30,40,50};
		int  key=30;
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==key) {
				count++;			
				break;
			}
		}
			if(count==1) {
				System.out.println("Key Element is present");
			}
			else
				System.out.println("Key Elemnt is not present");
		}
	

}
