package com.sgcbapps.dsa.recursion;

public class CountOccurenceOfAnElement {

    public static int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9,9};

    public static int getOccurrenceCount(int[] arr,int element, int length,int count){
        if(length==-1)
            return count;

        if(arr[length]==element)
            count++;

        return getOccurrenceCount(arr,element,length-1,count);
    }

}
