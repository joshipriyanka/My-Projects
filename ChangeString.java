package com.company;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ChangeString {
    public static void main(String[] args) {
        Scanner in = new Scanner ( System.in );
        String s = in.next ();
        String t = in.next ();
        int k = in.nextInt ();
        int count=0;
        if(s.equals(t)) {
            System.out.print ( "Yes" );
        } else {
            for(int i=0; i< s.length () && i < t.length (); i++){
                if(s.charAt ( i )== t.charAt ( i )){
                    count++;
                }
                else{
                    break;
                }
            }
            int total_s = s.length ()-count;
            int total_t = t.length ()-count;
            int total = total_s + total_t;
            if (count == 0 && k > total) {
                System.out.println("Yes");
            }
            else if(k == total){
                System.out.println("Yes");
            }
            else if (k < total){
                System.out.println("No");
            }
            else if(k > total ){
                if(((total-k) % 2) == 0){
                    System.out.println ( "Yes" );
                }
                else{
                    System.out.println ( "No" );
                }
            }
        }



    }
}

/*
        if((s.length ()-t.length ())==0){
            range = s.length();
        }
        else if((s.length ()-t.length ())<0){
            range = t.length ();
        }
        else{
            range = s.length ();
        }
        for(int i = 0; i < range; i++){
                if(s.charAt ( i ) == ' '){
                    sb = sb.append ( t.charAt ( i ) );
                    count++;

                }
                else if(t.charAt ( i )==' '){
                    sb.deleteCharAt ( i );
                    count++;
                }

               else if ( s.charAt ( i ) != t.charAt ( i ) ) {
                   sb.deleteCharAt ( i );
                   count++;
                   sb = sb.append( t.charAt ( i ));
                   count++;
                }
                else if(count != k){
                    if(sb.length ()==0){
                        count++;
                    }
                }

        }
        if(count == k){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
*/