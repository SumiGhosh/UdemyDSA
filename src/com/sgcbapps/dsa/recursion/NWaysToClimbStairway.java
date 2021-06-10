package com.sgcbapps.dsa.recursion;

public class NWaysToClimbStairway {

    public static int nWays(int n){
        if(n==2)
            return 2;
        else if(n==0 || n==1)
            return 1;

        return nWays(n-1) + nWays(n-2) + nWays(n-3);
    }
}
