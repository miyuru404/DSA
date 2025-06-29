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

    public static int[] addValueToEnd(int[] arr , int value){

        //creating a new array with old array size + 1
        int[] newArray = new int[arr.length+1];

        // add old arrays value to new arry
        for(int i=0; i<arr.length;i++){
            newArray[i] = arr[i];
        }
        // add new value at end of new array
        newArray[newArray.length-1] = value;

        System.out.print("old array: ");
        printArray(arr);
        System.out.println();
        System.out.print("new array: ");
        printArray(newArray);

        return newArray;


    }

    public static int[]addValueAtFirst(){return null;}

    public static int[] addValueAtMiddle(){return null;}







}