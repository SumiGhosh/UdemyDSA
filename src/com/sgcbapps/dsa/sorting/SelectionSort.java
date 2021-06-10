package com.sgcbapps.dsa.sorting;

import java.util.Arrays;

public class SelectionSort {

    private int[] array = {7,5,3,6,8};

    public SelectionSort(){
        sortArray();
    }
    /**
     * Pointer at initial index
     * Find smallest element on RHS, swap the index*/
    public void sortArray(){
        for(int x=0;x<array.length-1;x++){
            int smallestIndex = x;
            for(int y = x +1;y<array.length;y++){
                if(array[smallestIndex]>array[y]){
                    smallestIndex = y;
                }
            }

            if(smallestIndex!=x){
                int temp = array[smallestIndex];
                array[smallestIndex] = array[x];
                array[x] = temp;
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
