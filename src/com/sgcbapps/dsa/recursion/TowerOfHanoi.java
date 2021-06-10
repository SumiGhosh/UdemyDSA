package com.sgcbapps.dsa.recursion;

public class TowerOfHanoi {


    //no of steps = 2^n - 1
    public static int printNoOfSteps(int n){
        if(n==0)
            return 0;

        return printNoOfSteps(n-1) + 1 + printNoOfSteps(n-1);
    }

    public static void printSteps(int n,char s,char d,char h){
        if(n==0)
            return;

        printSteps(n-1,s,h,d);
        System.out.println("Moving disc "+n + "From "+ s + "  to "+d);
        printSteps(n-1,h,d,s);
    }
}
