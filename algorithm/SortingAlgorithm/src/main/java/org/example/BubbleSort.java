package org.example;


/*
 * This method sorts an integer array using the Bubble Sort algorithm.
 * It works by repeatedly comparing adjacent elements and swapping them
 * if they are in the wrong order (i.e., if the left element is greater
 * than the right one). After each full pass through the array, the
 * largest unsorted element "bubbles up" to its correct position.
 *
 * Time Complexity:
 * - Best Case: O(n)     (when array is already sorted)
 * - Worst Case: O(n^2)  (when array is sorted in reverse order)
 * - Average Case: O(n^2)
 */


public class BubbleSort {

    public static void main(String[] args){

        int[] arr = {3,2,6,4,5,1};
        bubbleSortAscendingOrder(arr);
        for (int i : arr) {
            System.out.print(i);
        }
        System.out.println();
        bubbleSortDescendingOrder(arr);
        for (int i : arr) {
            System.out.print(i);
        }
    }

    public static void bubbleSortAscendingOrder(int[] arr){

        for(int i = 0; i < arr.length-1 ; i++){
            for(int j = 0; j < arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j]=temp;
                }
            }
        }

    }
    public static void bubbleSortDescendingOrder(int[] arr){

        for(int i = 0; i < arr.length-1 ; i++){
            for(int j = 0; j < arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

}
