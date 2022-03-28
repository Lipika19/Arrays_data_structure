package com.Array;

import java.util.ArrayList;

public class kadanes_algorithm {
    public static void main(String[] args){
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        
        // System.out.println(Max_sum(arr));
        System.out.println(kadanes(arr));

    }
    // brute force approach

    static int Max_sum(int[] arr){
        ArrayList<Integer> subarray = new ArrayList<>();
        int max_sum = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j< arr.length; j++){
                int sum = 0;
                for(int k = i; k<=j; k++){
                    sum += arr[k];
                    if(sum > max_sum){
                        subarray.clear();
                        max_sum = sum;
                        subarray.add(i);
                        subarray.add(j);

                    }
                }
            }
        }
        System.out.println("The maximum subarray is: ");
        for(int i = subarray.get(0); i<= subarray.get(1); i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return max_sum;
    }
    // we can further optimised the above solution using only two loops
    
    // kadanes's algorithm
    static int kadanes(int[] arr){
        ArrayList<Integer> subarray = new ArrayList<>();
        int meh = 0, s = 0;
        int msf = arr[0];
        for(int i = 0; i<arr.length; i++){
            meh += arr[i];
            if(meh > msf){
                subarray.clear();
                msf = meh;
                subarray.add(s);
                subarray.add(i);

            }

            if(meh < 0){
                meh = 0; 
                s = i + 1;
            }
        }
        for(int i = subarray.get(0); i<= subarray.get(1); i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return msf;
    
    }
}
