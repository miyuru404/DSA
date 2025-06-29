package org.example;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {5, 1, 3, 6, 2, 4};
        selectionSortAscendingOrder(arr);
        for (int i : arr) {
            System.out.print(i);
        }
        System.out.println();

        selectionSortDescendingOrder(arr);
        for (int i : arr) {
            System.out.print(i);
        }

    }


    public static void selectionSortAscendingOrder(int[] arr) {


        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

        }
    }

    public static void selectionSortDescendingOrder(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int max = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[max] < arr[j]) {
                    max = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
        }

    }
}