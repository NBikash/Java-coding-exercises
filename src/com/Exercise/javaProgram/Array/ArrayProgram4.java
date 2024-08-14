package com.Exercise.javaProgram.Array;

//WAJP to verify whether a number is even or odd , that also print with numbers as e.g. 10 is a even number
public class ArrayProgram4 {
	public static void main(String[] args) {
		int[] a= {7,14,25,22,74,5};
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]+" is an Even Number");
			}
			else
				System.out.println(a[i]+" is a Odd Number");
			
		}

}
}
