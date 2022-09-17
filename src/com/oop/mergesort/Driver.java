package com.oop.mergesort;

import java.util.Random;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
        int[] array = new int[100];

        for(int i = 0; i<array.length; i++){
            array[i] = ran.nextInt(1000);
        }

        System.out.println("Numbers before sorting.");
        printArray(array);


        mergeSort(array);


        System.out.println("\nNumbers after sorting.");
        printArray(array);
	}
	
	public static void mergeSort(int[] array){
        int arrLength = array.length;

        if(arrLength < 2){                 // if array contain only one number
            return;
        }

        int midPointArr = arrLength / 2;   // finding the mid point
        int[] leftArr = new int[midPointArr]; // left array 
        int[] rightArr = new int[arrLength - midPointArr]; // right array

         for(int i= 0; i<midPointArr; i++){ // populating array with left elements
            leftArr[i] = array[i];
         }

         for(int j= midPointArr; j<arrLength; j++){ // populating array with right elements
            rightArr[j - midPointArr] = array[j];
         }

         mergeSort(leftArr); // recursion call until leftarray broke into single element
         mergeSort(rightArr); // recursion call until rightarray broke into single element


        marge(array,leftArr,rightArr); // calling marge method
    }

    private static void marge(int[] array, int[] leftHalf, int[] rightHalf){
        int leftLength = leftHalf.length;
        int rightLength = rightHalf.length;

        int i = 0, j = 0, k = 0;

        while(i < leftLength && j < rightLength){
            if(leftHalf[i] <= rightHalf[j]){  //checking the elements of left array and right array
                array[k] = leftHalf[i]; // assigning value in the marged array
                i++;
            }else{
                array[k] = rightHalf[j]; // assigning value in the marged array
                j++;
            }

            k++; // incrementing index of marged array after the assignment
        }

        while(i< leftLength){  // considering the remaining elements in left array
            array[k] = leftHalf[i];
            i++;
            k++;
        }

        while(j< rightLength){  // considering the remaining elements in right array
            array[k] = rightHalf[j];
            j++;
            k++;
        }
    }

    private static void printArray(int[] arr){
        for(int j=0; j<arr.length; j++){
            System.out.println(arr[j]);
        }
    }

}
