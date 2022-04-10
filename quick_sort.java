package com.Array;

public class quick_sort {
    public static void main(String[] args){
        int[] arr = {2,6,4,1,7,9,5};
        int n = arr.length;
        sort(arr, 0, n-1);
    }

    static void sort(int[] arr, int low, int high){

        // here we'll take a partionaing index (the index which has already come to its place) then we'll apply quick sort to subarray
        if(low<high){

            int partionIndex = partion(arr, low, high);
            sort(arr, low, partionIndex-1); // sorting left side array
            sort(arr, partionIndex+1, high); //sorting right side array
        }
        print(arr);

    }

    static void print(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static int partion(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low + 1;
        int j = high; 
        do{
            while(arr[i] <= pivot){
                i++;
            }

            while(arr[j] > pivot){
                j--;
            }

            if (i<j) {
             int temp = arr[i]   ;
             arr[i] = arr[j];
             arr[j] = temp;
            }
        }while(i<j);

        // swap pivot{arr[low]} to arr[j]
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }

}
