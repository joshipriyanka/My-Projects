package com.company;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 * Created by Priyanka Joshi on 6/26/2017.
 */
public class SuperReduce {
    static String super_reduced_string ( String s ) {
        String str = new String ( s );
        StringBuilder sb = new StringBuilder ( s );
        int i = 0;
     //   int j = 1;
        //  char last = '\0';
        while ( i < sb.length () - 1 ) {
            //      char next = sb.charAt ( i );
        //    for ( j = 1; j < s.length (); j++ ) {
            if ( sb.length () == 0 ) {
                String newS = "String is empty";
                return newS;
            }
             else if ( sb.charAt ( i ) == sb.charAt ( i+1 ) ) {

                    //        if(next == last){
                    //           int index1 = str.lastIndexOf ( next );
                    //           int index2 = str.indexOf ( last );
                    sb.delete ( i, i+2 );
                    i = 0;
                    //     }
                } else {
                    i++;
                    //     last = next;
                }

          //  }
        }

            //String str = new String();

             return String.valueOf ( sb );
            // Complete this function

    }

    public static void main ( String[] args ) {
        Scanner in = new Scanner ( System.in );
        String s = in.next ();
        String result = super_reduced_string ( s );
        System.out.println ( result );
    }
}
