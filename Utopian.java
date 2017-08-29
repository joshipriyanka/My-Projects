package com.company;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by Priyanka Joshi on 7/17/2017.
 */
public class Utopian {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int h =1;
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            h =1;
            for (int i =1 ; i<= n ; i++){
                if(i % 2 == 0){
                    h = h + 1;
                }
                else h = h + h;

            }
            System.out.println(h);
        }
    }
}
