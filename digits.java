package com.company;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class digits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for(int a0 = 0; a0 < t; a0++){
            int count =0;
            int n = in.nextInt();
            int n1 = n;
            while( n1 >0 ){
                int digit = n1 % 10;
               if(digit != 0) {
                   if ( n % digit == 0 ) {
                       count = count + 1;
                   }
               }
               n1 = n1 / 10;
            }
            System.out.println(count);
        }

    }
}
