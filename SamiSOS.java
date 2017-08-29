package com.company;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SamiSOS {
    public static void main ( String[] args ) {
        Scanner in = new Scanner ( System.in );
        String S = in.next ();

        if ( S.length () >= 1 && S.length () <= 99 ) {
            if ( S.length () % 3 == 0 ) {
                List<String> strings = new ArrayList<String> ();
                int index = 0;
                while ( index < S.length () ) {
                    strings.add ( S.substring ( index, index + 3 ) );
                    index += 3;
                }


                int i = 0;
                int counter = 0;
                while ( i < strings.size () ) {
                    String str = new String ( strings.get ( i ) );
                    boolean m = str.matches ( "SOS" );
                    if ( m == false ) {
                        char[] ch = str.toCharArray ();

                        if ( ch[ 0 ] != 'S' ) {
                            counter++;
                        }
                        if ( ch[ 1 ] != 'O' ) {
                            counter++;
                        }

                        if ( ch[ 2 ] != 'S' ) {
                            counter++;
                        }

                    }
                    i++;
                }
                System.out.println ( "We print the number of changed letters, which is " + counter );
            }
        }
    }
}
