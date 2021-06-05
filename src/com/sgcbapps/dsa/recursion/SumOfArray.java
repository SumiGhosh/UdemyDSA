package com.sgcbapps.dsa.recursion;

import java.util.Arrays;

public class SumOfArray {
    public static int[] arr2 = {1,2,3,4,5,6,7,8,9};

    public static int sumOfArray(int[] arr,int length){
        if(length==1)
            return arr[0];
        return arr[0] + sumOfArray(Arrays.copyOfRange(arr,1,arr2.length),length-1);
    }
}
