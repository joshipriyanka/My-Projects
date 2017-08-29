package com.company;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Factorial {

    public static void main(String[] args) {
        Scanner s = new Scanner ( System.in );
        int n = s.nextInt ();
        int result = fact(n);
        System.out.println ( "result:" + result );

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
    private static int fact(int n){
            if(n > 1){
                return n * fact ( n-1 );
            }
            else{
                return n;
            }
    }
}