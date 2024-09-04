package com.Exercise.javaProgram.Array;
//WAJP to find key element i an integer array i.e. 40 is present in integer array or not using binary search, HERE 40 is key value 
public class ArrayProgramBinarySearch25 {
	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		int left=0;
		int right=a.length-1;
		int key=40;
		int count=0;
		while(left<=right) {
			int mid=(left+right)/2;
			if(a[mid]==key) {
				count++;
				break;
			}
			else if(key>a[mid]) {
				left=mid+1;  // Narrow search to right half
				
			}
			else
				right=mid-1;   // Narrow search to left half
		}
		if(count==1) {
			System.out.println("Key Element Found");
		}
		else
			System.out.println("Key Element not found");
	}

}
