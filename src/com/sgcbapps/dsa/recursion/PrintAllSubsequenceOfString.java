package com.sgcbapps.dsa.recursion;

public class PrintAllSubsequenceOfString {

    public static void printSubSequence(String input, String output){
        if(input.length()==0){
            System.out.println(output);
            return;
        }
        printSubSequence(input.substring(1),output+input.substring(0,1));
        printSubSequence(input.substring(1),output);
    }

}
