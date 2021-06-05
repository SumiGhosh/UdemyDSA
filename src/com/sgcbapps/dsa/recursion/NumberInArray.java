package com.sgcbapps.dsa.recursion;

import java.util.Arrays;

public class NumberInArray {
    public static int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    //Check in the first index, check sub array
    public static boolean isNumberInArray(int[] arr, int length, int x) {
        if (length == 0) {
            return false;
        }

        if (arr[0] == x)
            return true;

        return isNumberInArray(Arrays.copyOfRange(arr, 1, arr.length), length - 1, x);
    }

    //check sub array 1st, then 1st index
    public static boolean isNumberInArraySolution2(int[] arr, int length, int x) {
        if (length == 0)
            return false;

        boolean hasNumber = isNumberInArraySolution2(
                Arrays.copyOfRange(arr, 1, length),
                length - 1,
                x);

        if (hasNumber)
            return true;

        if (arr[0] == x)
            return true;
        else
            return false;
    }

    //Check from end, last index first then sub array
    public  static boolean solution3(int[] arr,int length, int x){
        if(length==0)
            return false;

        if(arr[length-1]==x)
            return true;

        return solution3(arr,length-1,x);
    }
}
