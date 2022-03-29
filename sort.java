package com.Array;

class sort{
    public static void main(String[] args){
        int[] arr = {2,4,3};
        int[] arr2 = {1,2,4};
        sorting(arr, arr2);
    }

    static void sorting(int[] arr, int[] arr1){
        // int start = arr1[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > arr1[0]){
                // int temp = 0;
                int temp = arr[i];
                arr[i] = arr1[0];
                arr1[0] = temp;
            }

            // int key = arr1[0];
            // for(int k = 1; k<arr1.length; k++){
            //     int current = arr1[k];
            //     int j = k-1;
            //     while(j >=0 && arr1[j] > current){
            //         arr[j+1] = arr[j];
            //         j--;
            //     }
            //     arr[j+1] = current;
            // }
            

            int first = arr1[0];
            int k;
        // insertion sort is used here
            for (k = 1; k < arr1.length && arr1[k] < first; k++) {
                arr1[k - 1] = arr1[k];
            }
            arr1[k - 1] = first;
        }
        
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }System.out.println();

        for(int i = 0; i<arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }System.out.println();


    }
}