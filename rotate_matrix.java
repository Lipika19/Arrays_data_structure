package com.Array;

public class rotate_matrix{
    public static void main(String[] args){
        int[][] arr = {{1,2,3} , {4,5,6} , {7,8,9} , {11,12,13}};
        matrix(arr);
        // System.out.println(arr.length);
    }

    // traverse the matrix

    static void matrix(int[][] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j = i; j < arr[0].length; j++){
                int temp = 0; 
                temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // reverse the matrix;

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length/2; j++){
                int temp = 0;
                temp= arr[i][j];
                arr[i][j] = arr[i][arr.length - 1 - j];
                arr[i][arr.length - 1 - j] = temp;
            }
        }

        // printing 
        
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(" " + arr[i][j]);
            }System.out.println();
        }

    }


}