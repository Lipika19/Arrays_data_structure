package com.Array;

public class Partition_subset_sum {
    
    public static void main(String[] args){
        int arr[] = {1,5,1};
        int n = arr.length;
        
        if(partition(arr, n) == false){
            System.out.println("Can't obtain subset");
        }
        else
            System.out.println("can obtain subset");

        // System.out.println(recursion(arr, sum, n));
    }

    static boolean recursion(int[] arr, int sum, int n){
        // base condition..... we'll check if the sum is 0, then we'll return true
        if(sum == 0)    return true;
        
        // check if n is zero and sum is not equal to zero
        if(n == 0 && sum != 0) {
            return false;
        }
        
        // Now we'll check if the last element is greater than sum
        if(arr[n-1] > sum){
            return recursion(arr, sum, n-1);
        }

        // if last element is not greater than sum then we'll check whether by including or excluding last element we're able to obtain the result or not
        return recursion(arr, sum, n-1) || (recursion(arr, sum-arr[n-1], n-1));

    }

    //  now in the partition function we'll check if the array can be divided into two equal half with equal sum
   static boolean partition(int[] arr, int n) {
        int sum = 0;
        for(int i : arr){
            sum += i;
        }

        // checking if the given sum is even or not
        if(sum %2 != 0) return false;

        return recursion(arr, sum/2, n);
   }
}
