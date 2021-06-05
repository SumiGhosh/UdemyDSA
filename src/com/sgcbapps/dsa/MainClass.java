package com.sgcbapps.dsa;

import com.sgcbapps.dsa.recursion.*;

import java.util.Arrays;
import java.util.Vector;

public class MainClass {

    public static void main(String[] args){

        char[] input = {'d','a','b','c'};
        RemoveCharacter.removeCharArray(input);
        print(Arrays.toString(input));



    }

    static void print(String value){
        System.out.println(value);
    }
}
