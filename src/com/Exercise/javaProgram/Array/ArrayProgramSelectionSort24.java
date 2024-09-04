package com.Exercise.javaProgram.Array;


//WAJP to sort an int array elements in ascending order using selection sort 
public class ArrayProgramSelectionSort24 {
	// Method to perform selection sort
    public static void selectionSort(int[] array) {
        int n = array.length;
        
        // Traverse through all array elements
        for (int i = 0; i < n - 1; i++) {
            // Find the index of the minimum element in the unsorted portion
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            
            // Swap the found minimum element with the first element of the unsorted portion
            if (minIndex != i) {
                int temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
            }
        }
    }

    // Method to print an array
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Main method to test the selection sort
    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};
        
        System.out.println("Original array:");
        printArray(array);
        
        selectionSort(array);
        
        System.out.println("Sorted array:");
        printArray(array);
    }

}
