package com.oop.quicksort;

import java.util.Random;
import java.util.Scanner;

public class Driver { public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("How many numbers you want to sort??");
	int totNum = in.nextInt();
	
	Random ran = new Random();
    int[] array = new int[totNum];

    for(int i=0;i<array.length;i++){
        array[i] = ran.nextInt(100);
    }

    System.out.println("Numbers before sorting: ");
    printArray(array);

    quickSort(array);

    System.out.println("\nNumbers after Sorting: ");
    printArray(array);
}

private static void quickSort(int[] arr){
    quickSort(arr, 0, (arr.length -1));
}

private static void quickSort(int[] arr, int lowIndex, int highIndex){

    if(lowIndex >= highIndex){
        return;
    }

    int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
    int pivot = arr[pivotIndex];
    swap(arr, pivotIndex, highIndex);

    int lowPointer = partition(arr, lowIndex, highIndex, pivot);

    quickSort(arr, lowIndex, lowPointer -1);
    quickSort(arr, lowPointer +1, highIndex);
}

private static int partition(int[] arr, int lowIndex, int highIndex, int pivot) {
	int lowPointer = lowIndex;
    int highPointer = highIndex;

    while(lowPointer < highPointer){

        while(arr[lowPointer] <= pivot && lowPointer < highPointer){
            lowPointer++;
        }

        while(arr[highPointer] >= pivot && lowPointer < highPointer){
            highPointer--;
        }


        swap(arr, lowPointer, highPointer);
    }


    swap(arr, lowPointer, highIndex);
	return lowPointer;
}

private static void swap(int[] arr, int index1, int index2){
    int temp = arr[index1];
    arr[index1] = arr[index2];
    arr[index2] = temp;
}

private static void printArray(int[] arr){
    for(int j=0;j<arr.length;j++){
        System.out.println(arr[j]);
    }
}	
}
