package com.sgcbapps.dsa.recursion;

import java.util.Arrays;

public class RemoveCharacter {

    public static void removeCharArray(char[] arr){
        if(arr.length==0)
            return;

        if(arr[0]!='a'){
            removeCharArray(Arrays.copyOfRange(arr,1,arr.length));
        } else {
            for(int index=0;index<arr.length-1;index++){
                arr[index] = arr[index+1];
            }
            removeCharArray(arr);
        }
    }
}
