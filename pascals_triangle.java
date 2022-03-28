package com.Array;
import java.util.*;
public class pascals_triangle {
    public static void main(String[] args){
        System.out.println(pascal(5));
    }

    static List<List<Integer>> pascal(int numrows){
        List<List<Integer>>result = new ArrayList<>();
        List<Integer> row = null;
        List<Integer> pre = null;


        for(int i = 0; i < numrows; i++){
            row = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i){
                    row.add(1);
                }

                else{
                    row.add(pre.get(j-1) + pre.get(j));
                }
            }
            pre = row;
            result.add(row);

        }
        return result;
    }
}
