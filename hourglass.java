package com.company;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class hourglass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        int sum =0;
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<4; i++){
            for(int j=0; j<4 ; j++){
                sum = sum + arr[i][j]+ arr[i][j+1] +arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                System.out.println ( "i:" + i + "j:" + j );
                if(maxSum < sum){
                    maxSum = sum;
                }

                    sum =0;

            }

        }
        System.out.println(maxSum);


    }
}
