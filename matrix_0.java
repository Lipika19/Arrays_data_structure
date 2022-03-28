package com.Array;

import java.util.Arrays;

// Brute Force approach

// Given a matrix if an element in the matrix is 0 then you will have to set its entire column and row to 0 and then return the matrix.

public class matrix_0 {
    public static void main(String[] args){
        int arr[][] = {{1,2,3},{4,0,6},{7,8,9}};
        // matrix(arr);
        // matrix_02(arr);
        setZero(arr);
    }

    static void matrix(int[][] arr){
        int n = arr.length;
        for(int i = 0; i<n; i++){
            for(int j = 0; j< n; j++){
                if(arr[i][j] == 0){
                    int ind = i - 1;
                    while(ind >= 0){
                        if(arr[ind][j] != 0){
                            arr[ind][j] = -1;
                        }
                        ind --;
                    }
                     ind = i + 1;
                    while(ind < n){
                        if(arr[ind][j] != 0){
                            arr[ind][j] = -1;
                        }
                        ind ++;
                    }
                     ind = j - 1;
                    while(ind >= 0){
                        if(arr[i][ind] != 0){
                            arr[i][ind] = -1;
                        }
                        ind --;
                    }
                     ind = i +1;
                    while(ind < n){
                        if(arr[i][ind] != 0){
                            arr[i][ind] = -1;
                        }
                        ind ++;
                    }
                }
            }
        }
        for(int i =0; i<n; i++){
            for(int j = 0; j < n; j++){
                if(arr[i][j] <= 0){
                    arr[i][j]=0;
                }
            }
        }

        //printing
        for(int i =0; i<n; i++){
            for(int j = 0; j<n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }



    // optimised approach

    static void matrix_02(int[][] arr){
        int row = arr.length;
        int cols = arr[0].length;
        int[] dummy1 = new int[row];
        int[] dummy2 = new int[cols];
        Arrays.fill(dummy1, -1);
        Arrays.fill(dummy2, -1);
        for(int i = 0; i<row; i++){
            for(int j = 0; j<cols; j++){
                if(arr[i][j] == 0){
                    dummy1[i]=0;
                    dummy2[j]=0;
                }
            }
        }

        for(int i = 0; i<row; i++){
            for(int j = 0; j<cols; j++){
                if(dummy1[i] == 0 || dummy2[j] == 0){
                    arr[i][j] = 0;
                }
            }
        }
        for(int i = 0; i<row; i++){
            for(int j = 0; j<cols; j++){
                System.out.print(arr[i][j]);
            }System.out.println();
        } 
    }

    // more optimised approach
    // we'll make first row and column of the matrix as dummy matrix


    static void setZero(int[][] arr){
        int col0 = 1;
        int row = arr.length;
        int col = arr[0].length;
        for(int i = 0; i<row; i++){
            if(arr[i][0] == 0) col0 = 0;
            for(int j = 0; j<col; j++){
                if(arr[i][j] == 0){
                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }
            }
        }

        // traversing from backwards
        for(int i = row - 1; i>= 0; i--){
            for(int j = col -1 ; j>=0; j--){
                if(arr[i][0] == 0 || arr[0][j] == 0){
                    arr[i][j] = 0;
                }
            }
            if(col0 == 0) arr[i][0] = 0; 
        }

        // Printing

        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                System.out.print(arr[i][j]);
            }System.out.println();
        } 

    }
}
