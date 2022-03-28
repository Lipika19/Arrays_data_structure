package com.Array;

public class sort_0_1_2 {
    public static void main(String[] args){
        int[] nums = {1,0,0,1,2,2};
        sort(nums);
    }
    // here we are using three pointer approach
    // this algorithm is also known as dutch national flag algorithm
    
    static void sort(int[] nums){
        int low = 0, mid = 0;
        int high = nums.length-1;
        int temp; 
        while (mid <= high) { 
            switch (nums[mid]) { 
                case 0: { 
                    temp = nums[low]; 
                    nums[low] = nums[mid]; 
                    nums[mid] = temp; 
                    low++; 
                    mid++; 
                    break; 
                } 
                case 1: 
                    mid++; 
                    break; 
                case 2: { 
                    temp = nums[mid]; 
                    nums[mid] = nums[high]; 
                    nums[high] = temp; 
                    high--; 
                    break; 
                }
            }
        }
        for(int i = 0 ; i<nums.length; i++){
            System.out.print(" " + nums[i]);
        }
    }
}
