package com.sgcbapps.dsa.recursion;

public class CheckPalindrome {

    public static int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9,9};

    public static boolean checkPalindrome(int[] arr,int start,int end){
        if(start>end)
            return true;

        if(arr[start]==arr[end])
            return checkPalindrome(arr,start+1,end-1);
        else
            return false;
    }
}
