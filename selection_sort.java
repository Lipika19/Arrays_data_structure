package com.Array;

public class selection_sort {

    public static void main(String[] args){
        int[] arr = {3,2,6,4,9,1};
        sorting(arr);
    }
    static void sorting(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n; i++){
            int min_index = i;
            for(int j = i+1; j<n; j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
            }

            // swaping the indexes
            int temp;
            temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
        print(arr, n);
    }

    static void print(int[] arr, int n){
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
