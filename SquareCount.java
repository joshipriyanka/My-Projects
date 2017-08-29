package com.company;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SquareCount {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner s = new Scanner(System.in);
        int t = s.nextInt ();

        for(int i=0; i<t; i++){
            int n1 = s.nextInt ();
            int n2 = s.nextInt ();
            int count =0;
            int test =0;
            for(int j = n1; j<= n2; j++){
                test = (int) Math.sqrt ( j );
            //    System.out.println(test*test);
              if( test*test == j){
                    count ++;
                    break;
                }

            }
            for(int k=1;;k++){
                if((test + k)*(test+k)<=n2){
                    count++;
                }
                else{
                    break;
                }
            }
           System.out.println(count);
        }
    }
}

