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



}