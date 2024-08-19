package com.Exercise.javaProgram.Array;

//WAJP to reverse an Integer Array   (Approach-1)
public class ArrayProgram15_1 {
	public static void main(String[] args) {
		int[] num= {10,20,30,40,50};
		 int left = 0;
	        int right = num.length - 1;
						        
	        System.out.println("After Reversing");
	        
	        // Reverse the array
	        while (left < right) {
	            // Swap elements at left and right indices
	            int temp = num[left];
	            num[left] = num[right];
	            num[right] = temp;
	            
	            // Move indices towards the center
	            left++;
	            right--;
	        }
	        
	        // Print the reversed array
	        for (int j = 0; j < num.length; j++) {
	            System.out.println(num[j]);
	        }
	}


}
