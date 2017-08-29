package com.company;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by Priyanka Joshi on 7/27/2017.
 */
public class Xoring {
    public static void main ( String[] args ) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner ( System.in );
        int t = s.nextInt ();

        for ( int i_t = 0; i_t < t; i_t++ ) {
            int x1 = 0;
            int n = s.nextInt ();
            int[] arr = new int[ n ];
            for ( int i_arr = 0; i_arr < n; i_arr++ ) {
                arr[ i_arr ] = s.nextInt ();
            }
            if ( n % 2 == 0 ) {
                x1 = 0;
            } else {
                x1 = arr[ 0 ];
                for ( int i = 2; i < n; i = i + 2 ) {
                    x1 = x1^arr[i];
                }
            }
            /*
            for(int i =0; i<n;i++){
                x1 = arr[i]^x1;

            }
            while(n!=0) {
                System.out.println ( n );
                for(int i_x=0; i_x <n-1;i_x++ ) {
                    int x2 = arr[ i_x ];
                    for ( int j = i_x; j < n - 1; j++ ) {
                        x2 = x2 ^ arr[ j + 1 ];
                    }
                    x1 = x1 ^ x2;
                }
                n--;
                }

            */


            System.out.println ( x1 );
        }
    }
}

