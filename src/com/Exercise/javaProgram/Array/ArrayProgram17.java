package com.Exercise.javaProgram.Array;

//WAJP to Merge two integer array
public class ArrayProgram17 {
	public static void main(String[] args) {
			
	int a[]= {10,20,30};
	int[] b= {40,50,60};
	int[] res=new int[a.length+b.length];
	//Adding a Array elements to res
	for(int i=0;i<a.length;i++) {
		res[i]=a[i];
	}
	//Adding b Array elements to res
	for(int j=0;j<b.length;j++) {
		res[a.length+j]=b[j];
	}
	System.out.println("After Merging");
	for(int k=0;k<res.length;k++) {
		System.out.println(res[k]);
	}
	}
		

}
