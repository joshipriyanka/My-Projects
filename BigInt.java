package com.company;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BigInt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BigInteger bigNum = BigInteger.valueOf(1);

        while (n >= 1) {
             
            bigNum = bigNum.multiply ( BigInteger.valueOf ( n ) );
            n--;
        }
        System.out.println(bigNum);

    }
}
