package com.Array;

import java.util.Arrays;

class Lcs{

    public static void main(String[] args){
        int arr[]={100,5,200,1,2,3,4};
        int lon=lcs(arr);
        System.out.println("The longest consecutive sequence is "+lon);
    }

    static int lcs(int[] nums){
        if(nums == null || nums.length == 0){
            return 0;
        }

        Arrays.sort(nums);

        int ans = 1;
        int cur = 1;
        int prev = nums[0];

        for(int i = 0; i<nums.length; i++){
            if(nums[i] == prev+1) cur++;
            else if(nums[i] != prev) cur = 1;
            prev = nums[i];
            ans = Math.max(ans, cur);
        }

        return ans;

    }
}