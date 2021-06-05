package com.sgcbapps.dsa.recursion;

public class FindTheLastIndexOfTheElement {
    public static int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static int getLastIndex(int[] arr,int length,int element,int index){
        if(index==-1)
            return -1;

        if(arr[index]==element)
            return index;

        return getLastIndex(arr,length,element,index-1);
    }
}
