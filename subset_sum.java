package com.Array;

// import practise.sum;

// import java.util.ArrayList;

// by recursion and backtracking

public class subset_sum {
    public static void main(String[] args){
        int[] set = {2,2,3};
        int n = set.length;
        int sum = 5;
        System.out.println(recursion(set, n, sum));
        System.out.println(dp(set, n, sum));

    }

    static boolean recursion(int[] set, int n, int sum ){

        // ArrayList<Integer> result = new ArrayList<>();

        // base cases
        if(sum == 0){
            return true;
        }
        if(n == 0 && sum != 0){
            return false;
        }

        // checking if the last element id greater then the sum then ignore it.
        if(sum < set[n-1]){
            return recursion(set, n-1, sum);
        }
        //  And if the first statement is not true, then check whether by including or excluding the last element can we acquire the desire result or not

        else{
            
            return recursion(set, n-1, sum) || recursion(set, n-1, sum - set[n-1]);
        }

    }
    // by dynamic programming

    static boolean dp(int[] set, int n, int sum){
        boolean subset[][] = new boolean[sum+1][n+1];

        for(int i = 0; i<= n; i++){
            subset[0][i]= true;
        }
        for(int i = 0; i<= sum; i++){
            subset[i][0]= false;
        }

        // fill the subset in bottom up manner 
        for(int i = 1; i<=n; i++){
            for(int j=1; j<=sum; j++){
                subset[i][j] = subset[i][j-1];
                if(i >= set[j-1]){
                    subset[i][j] = subset[i][j] || subset[i - set[j - 1]][j - 1];
                }
            }
        }
        return subset[sum][n];
    }
}
