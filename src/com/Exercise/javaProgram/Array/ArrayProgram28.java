package com.Exercise.javaProgram.Array;

public class ArrayProgram28 {
	public static void main(String[] args) {
		int[] a= {10,20,50,10,80,50};
		boolean[] b=new boolean[a.length];
		
		for(int i=0;i<a.length;i++) {
			if(b[i]==false) {
			int count=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
					b[j]=true;
				}
			}
			System.out.println("Frequency of "+a[i]+": "+count);
		}
		}
	}

}
