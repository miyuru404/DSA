package org.example;

public class BubbleSort {

    public static void main(String[] args){

        int[] arr = {3,2,6,4,5,1};
        bubbleSort(arr);
        for (int i : arr) {
            System.out.print(i);
        }
    }

    public static void bubbleSort(int[] arr){

        for(int i = 0; i < arr.length-1 ; i++){
            for(int j = 0; j <arr.length-1;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i]=temp;
                }
            }
        }

    }

}
