package org.example;

public class BubbleSort {

    public static void main(String[] args){

        int[] arr = {3,2,6,4,5,1};
        bubbleSortAscendingOrder(arr);
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
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

}
