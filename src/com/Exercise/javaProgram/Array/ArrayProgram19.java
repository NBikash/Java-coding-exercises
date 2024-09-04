 package com.Exercise.javaProgram.Array;

//WAJP to merge two integer array that element should need to arrange one after another from different array(Interleave elements from both arrays)
//e.g Array 1={10,20,30}, Array 2={40,50,60}, outputArray={10,40,20,50,30,60}
public class ArrayProgram19 {
	public static void main(String[] args) {
		int[] array1={10,20,30};
		int[] array2={40,50,60};
		int[] outputArray=new int[array1.length+array2.length];
		int a=0; // a holds index of array1 and array2
		int b=0; // b holds index of outputArray
		while(b<array1.length || b<array2.length) {
			outputArray[b]=array1[a];
			b++;
			outputArray[b]=array2[a];
			a++;
			b++;
		}
		while(a<array1.length) {
			outputArray[b]=array1[a];
			a++;
			b++;
		}
		while(a<array2.length) {
			outputArray[b]=array2[a];			
			a++;
			b++;
		}
		for(int j=0;j<outputArray.length;j++) {
			System.out.println(outputArray[j]);
		}
	}

}
