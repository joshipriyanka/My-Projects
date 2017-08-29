package com.company;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CounterGame {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner ( System.in );
        int t = s.nextInt ();
        int round = 1;
        for(int i=0 ; i< t ; i++){
            long count = s.nextLong ();
            round = 0;
            while(true) {

                 if ( (count & (count - 1)) == 0 ) {
                    count = count / 2;
                    round ++;
                }
                else {
                    count = count - largestPow(count);
                    round ++;
                }

                if (count == 1) {
                     break;
                }
            }
            if(round %2 == 0){
                System.out.println("Richard");
            }
            else {
                System.out.println("Louise");
            }
        }
    }

    static long largestPow (long count){
        long res = 2;
        while(res < count){
            if((2 * res) < count) {
                res *= 2;
            }
            else {
                break;
            }
        }
        return res;
    }
}
