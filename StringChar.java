package com.company;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class StringChar {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
 /*       Scanner s = new Scanner ( System.in );
        int N = s.nextInt ();
        for(int i=0; i< N; i++){
            String str = s.next ();
            char[] ch = str.toCharArray ();
            for(int j =0 ; j< ch.length; j++){
                if(j%2 == 0){
                    System.out.print(ch[j]);
                }

            }
            System.out.print(" ");
            for(int j =0 ; j< ch.length; j++){
                if(j%2 != 0){
                    System.out.print(ch[j]);
                }

            }
        }

    }
*/
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        for(int j = (n-1); j>=0 ; j--){
            System.out.print(arr[j] + " ");
        }
        in.close();
    }
}
