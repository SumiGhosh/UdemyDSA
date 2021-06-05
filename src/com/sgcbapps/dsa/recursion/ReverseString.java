package com.sgcbapps.dsa.recursion;

import java.util.Arrays;

public class ReverseString {

    public static void printArray(char[] input){
        if(input.length==0)
            return;

        printArray(Arrays.copyOfRange(input,1,input.length));
        System.out.print(input[0]);
    }
}
