package com.sgcbapps.dsa.recursion;

import java.util.Arrays;

public class LengthRecursively {

    public static int getLength(char[] arr){
        if(arr.length==0)
            return 0;

        return 1 + getLength(Arrays.copyOfRange(arr,1,arr.length));
    }
}
