package com.company;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JumpDan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        int maxHeight =0;
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
            if(maxHeight < height[height_i]){
                maxHeight = height[height_i];
            }
        }
        // your code goes here
        if(k < maxHeight) {
            int numDrinks = maxHeight - k;
            System.out.println(numDrinks);
        }
        else System.out.println(0);
    }
}
