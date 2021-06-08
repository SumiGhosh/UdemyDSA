package com.sgcbapps.dsa.recursion;

public class PermutationsOfAString {

    public static void printAllPermutation(String input, String ans){
        if(input.length()==0){
            System.out.println(ans);
            return;
        }

        for(int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            String ros = input.substring(0,i) + input.substring(i+1);
            printAllPermutation(ros,ans+ch);
        }
    }
}
