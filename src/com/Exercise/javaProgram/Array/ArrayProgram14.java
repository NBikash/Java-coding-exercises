package com.Exercise.javaProgram.Array;

//WAJP to find Largest name present in a String array
public class ArrayProgram14 {
	public static void main(String[] args) {
		String[] names= {"Abhishek","Akash","Ram"};
		String large=names[0];
		for(int i=1;i<names.length;i++) {
			if(names[i].length()>large.length()) {
				large=names[i];
			}
		}
		System.out.println("Largest Name Present in this String array is: "+large);
	
	}

}
