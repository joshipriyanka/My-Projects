package com.company;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class NonDivisible {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner ( System.in );
        int n = s.nextInt ();
        int arr[] = new int[n];
        int k = s.nextInt ();

        int totalCount =n;
        for(int arr_i =0; arr_i <n; arr_i++){
            arr[arr_i] = s.nextInt ();
        }
        int temp=0;
        int tempNum =0;

        for(int i=0; i< n-1; i++){
            int count=0;
            for(int j=i+1; j< n;j++){
                int sum = arr[i]+arr[j];
                if(sum %k == 0) {
                    count++;
                    temp=j;
                    if(i == tempNum) count=0;
                    else if(temp == tempNum){
                        count =0;
                    }

                }
            }
            if(count > 0 ){
                totalCount--;
                tempNum=temp;
            }

        }
        System.out.println(totalCount);
    }
}
