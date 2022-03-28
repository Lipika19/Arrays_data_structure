package com.Array;

public class next_permuntation {
    public static void main(String[] args){
        int[] arr = {1,3,2,6,8,7,5};
        // System.out.println(arr);
        // System.out.println(permuntation(arr));
        permuntation(arr);
    }

    static void permuntation(int[] arr){

        if(arr.length <=1 || arr == null){
            return ;
        }
        int i = arr.length - 2;
        while(i >=0 && arr[i] >= arr[i+1]){
           i--; 
        }
        if(i >= 0) {                           
            int j = arr.length - 1;              
            while(arr[j] <= arr[i]) j--;      
            swap(arr, i, j);                     
        }
        reverse(arr, i + 1, arr.length - 1); 
        // System.out.println(arr);
        for(int k = 0; k < arr.length; k++){
            System.out.print(arr[k] + " ");
        }
        // return arr;
    }
    static public void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    static public void reverse(int[] arr, int i, int j) {
        while(i < j) swap(arr, i++, j--);
    }
    
}
