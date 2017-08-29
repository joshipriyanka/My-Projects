package com.company;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Binary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = 0;
        n = s.nextInt();
        int[] a = new int[10];
        int count = 0;
        int i =0;
        while(n > 0){


                a[0] = n % 2;
                n = n / 2;
                if(a[0] == 1) count = count +1;
            while(i < a.length-1) {
                a[0] = n % 2;
                n = n / 2;
                if(a[i] == a[i+1]){
                    if(a[i] == 1)
                    count = count + 1;
                    i++;
                }
                else i++;
            }
        }
        System.out.println(count);
        s.close();
    }

}
