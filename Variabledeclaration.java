package com.company;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Variabledeclaration {
    public static void main(String[] args) {
        // write your code here
        int i = 4;
        double d = 14.0;
        String s = "Priyanka";
        Scanner scan = new Scanner ( System.in );
                /* Declare second integer, double, and String variables. */
        int i2 = scan.nextInt ();
        double d2 = scan.nextDouble ();
        scan.nextLine();
        String s2 = scan.nextLine ();
        System.out.println ( i + i2 );
        System.out.println ( d + d2 );
        System.out.println ( s + s2 );
    }
}
