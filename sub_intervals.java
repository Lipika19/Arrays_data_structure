package com.Array;
// import java.util.*;
import java.util.ArrayList;
// import java.util.Collection;
import java.util.Collections;

class pair{
    int x, y;
    pair(int x, int y){
        this.x = x;
        this.y = y;
    }

}

public class sub_intervals {
    public static void main(String[] args){
        ArrayList < pair > arr = new ArrayList < > ();
        arr.add(new pair(1, 3));
        arr.add(new pair(2, 4));
        arr.add(new pair(2, 6));
        arr.add(new pair(8, 9));
        arr.add(new pair(8, 10));
        arr.add(new pair(9, 11));
        arr.add(new pair(15, 18));
        arr.add(new pair(16, 17));
        ArrayList < pair > ans = merge(arr);
        System.out.println("Merged Overlapping Intervals are ");
        for (pair it: ans) {
            System.out.println(it.x + " " + it.y);
        }
    }

    static ArrayList<pair> merge(ArrayList<pair> arr){

        // sorting array wrt x
        int n = arr.size();
        Collections.sort(arr, (a, b) -> a.x - b.x);
        ArrayList<pair> ans = new ArrayList<>();
        
        for(int i = 0; i<n; i++){
            int start = arr.get(i).x;
            int end = arr.get(i).y;

            if(!ans.isEmpty()){
                if(start <= ans.get(ans.size()-1).y){
                    continue;
                }
            }

            for (int j = i + 1; j < n; j++) {
                if (arr.get(j).x <= end) {
                    end = arr.get(j).y;
                }
            }
            ans.add(new pair(start, end));

        }
        return ans;
        
    }
    
}
