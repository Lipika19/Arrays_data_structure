package com.Array;

// bubble sort 
class bubble_sort{
    public static void main(String[] args){
        int[] arr = {2,5,1,3};
       
        // sort(arr);
        bubblesort(arr);

    }

    static void sort(int[] arr){
        int temp;
        int n = arr.length;
        for(int i = 0; i<n-1; i++){
            for(int j = 0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
       
    }
    
    // By default the bubble sort is not ada[tive in nature we can make is adaptive 
    // more optimised solution 

    static void bubblesort(int[] arr){
        int temp;
        for(int i = 0; i<arr.length; i++){
            boolean swap = false;
            for(int j = 0; j<arr.length -i-1; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }

            }
            if(swap == false){
                break;
            }
        }
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
