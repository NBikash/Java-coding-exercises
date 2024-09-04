package com.Exercise.javaProgram.Array;

//WAJP to find number missing in between 1 to 10 in an integer array 
public class ArrayProgram26 {
	public static void main(String[] args) {
		int a[]= {1,3,4,5,7,9};
		System.out.println("Missing Numbers in between 1 to 10 are: ");
		for(int start=1;start<=10;start++) {
			int count=0;
			for(int j=0;j<a.length;j++) {
				if(start==a[j]) {
					count++;
					break;
				}
			}
			if(count==0) {
				System.out.println(start);
			}
				
		}
	}

}
