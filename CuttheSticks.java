package com.company;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class CuttheSticks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        ArrayList<Integer> array = new ArrayList <Integer> ();
        int minStick =0;
        int j_zero=0;

        for ( int arr_i = 0; arr_i < n; arr_i++ ) {

            array.add (in.nextInt () );
        }

        Collections.sort(array);

        while(j_zero != n) {

            int sticksCut =0;

            int i =j_zero;
            minStick= array.get ( i );


            for ( int j = j_zero; j < array.size (); j++ ) {

                if ( array.get ( j ) != 0 ) {
                    int value = array.get( j ) - minStick;
                    array.set ( j,value );
                    sticksCut++;
                    if ( array.get( j ) == 0 ) {
                        j_zero++;
                    }
                }
            }

            System.out.println ( sticksCut );
            i++;
        }
    }
}

