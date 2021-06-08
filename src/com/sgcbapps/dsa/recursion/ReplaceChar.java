package com.sgcbapps.dsa.recursion;

import java.util.Arrays;

public class ReplaceChar {

    public static void replaceChar(char[] arr){
        if(arr.length==0)
            return;

        if(arr[0]=='a')
            arr[0] = 'x';

        replaceChar(Arrays.copyOfRange(arr,1,arr.length));
    }
}
