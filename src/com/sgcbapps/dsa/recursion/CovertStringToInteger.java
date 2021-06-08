package com.sgcbapps.dsa.recursion;

import java.util.Arrays;

public class CovertStringToInteger {

    public static int toInteger(char[] input){
        if(input.length==0){
            return 0;
        }

        int value = toInteger(Arrays.copyOfRange(input,0,input.length-1));
        return value*10 + input[input.length-1] - '0';
    }
}
