package org.example;

public class Main {
    public static void main(String[] args) {

        int[] arr = {2,5,8,1,3,4,7,6,9,};



    }
}

class ArrayOperation{


    public static void printArray(int[] arr){
        for(int num:arr){
            System.out.print(num);
        }
    }

    public static void getValueByIndex(int[] arr , int index){
        System.out.println(arr[index]);
    }

    public static void modifyValueByIndex(int[] arr ,int index ,int value){
        arr[index] = value;
        printArray(arr);
    }
    public static void deleteValueByIndex(int[] arr , int index){
        for(int i = index ; i<arr.length-1 ;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = 0;
        printArray(arr);
    }







}