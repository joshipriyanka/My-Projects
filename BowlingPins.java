package com.company;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class BowlingPins {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner ( System.in );
        int T = in.nextInt ();
        int N = in.nextInt ();
        String S= in.next();

        List<String> strings = new ArrayList<String> ();
        int index = 0;
        while ( index < S.length () ) {
            strings.add ( S.substring ( index, index + 2 ) );
            index += 2;
        }

        if(N%2 == 0){
            int i=0;
            int count=0;
            while ( i < strings.size () ) {
                String str = new String (strings.get(i) );
                boolean m = str.matches ( "II" );
                if(m == true){
                    count ++;
                }
                else{
                    boolean m1 = str.matches ( "XX" );
                    if(m1 == false){
                        count ++;
                    }
                }
                i++;
                //    char[] ch = str.toCharArray ();
                //    for(int i=0; i < ch.length; i++){
            }
            if(count % 2 == 0){
                System.out.println("LOSE");
            }
            else {
                System.out.println("WIN");
            }

        }
        else{
            int mediam = N+1 / 2;
            int oddCount = 0;
            String str = new String(S);
            char[] ch = str.toCharArray();
            if(ch[mediam] == 'I'){
                oddCount ++;
            }

        }
    }
}

