package com.company;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LibraryBookFine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d1 = in.nextInt();
        int m1 = in.nextInt();
        int y1 = in.nextInt();
        int d2 = in.nextInt();
        int m2 = in.nextInt();
        int y2 = in.nextInt();
        int fine =0;
        if(y1 != y2 && y1 > y2){
            fine =10000;
        }
        else if(y1>= y2 && m1 != m2 && m1 > m2 ) {

                fine = 500 * (m1 - m2);


        }
       else if(y1 >= y2 && m1 >= m2 && d1 != d2 && d1 > d2) {

                fine = 15 * (d1 - d2);

        }
        else{
            fine =0;
        }
        System.out.println(fine);
    }
}
