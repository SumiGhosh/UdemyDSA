package com.sgcbapps.dsa.recursion;

import java.util.Arrays;

public class CheckArraySorted {

    public static int[] arr1 = {1,2,3,4,5,6,7,8,9};
    public static int[] arr2 = {21,12,32,14,25,46,75,81,92};

    public static boolean checkArraySorted(int[] arr,int length){
        if(length==0 || length==1)
            return true;
        if(arr[0]>arr[1])
            return false;

        boolean isSorted = checkArraySorted(Arrays.copyOfRange(arr,1,arr.length), length-1);

        return isSorted;
    }
}
