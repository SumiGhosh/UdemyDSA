package com.sgcbapps.dsa.recursion;

public class FindIndexOfTheElement {
    public static int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static int getIndexForTheElement(int[] arr,int length,int element,int index){
        if(length==index)
            return -1;

        if(arr[index]==element)
            return index;

        return getIndexForTheElement(arr,length,element,index+1);
    }

}
