package com.company;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 * Created by Priyanka Joshi on 7/10/2017.
 */
public class WordArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<Character, Integer> map = new HashMap<Character,Integer>();
        int[] h = new int[26];
        int i=0;
        for(int h_i=0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        map.put ( 'a', h[i] );
        map.put ( 'b', h[i +1] );
        map.put ( 'c', h[i+2] );
        map.put ( 'd', h[i+3]);
        map.put ( 'e', h[i+4] );
        map.put ( 'f', h[i+5] );
        map.put ( 'g', h[i+6] );
        map.put ( 'h', h[i+7] );
        map.put ( 'i', h[i+8] );
        map.put ( 'j', h[i+9] );
        map.put ( 'k', h[i+10] );
        map.put ( 'l', h[i+11] );
        map.put ( 'm', h[i+12] );
        map.put ( 'n', h[i+13] );
        map.put ( 'o', h[i+14] );
        map.put ( 'p', h[i+15] );
        map.put ( 'q', h[i+16] );
        map.put ( 'r', h[i+17] );
        map.put ( 's', h[i+18] );
        map.put ( 't', h[i+19] );
        map.put ( 'u', h[i+20] );
        map.put ( 'v', h[i+21] );
        map.put ( 'w', h[i+22] );
        map.put ( 'x', h[i+23] );
        map.put ( 'y', h[i+24] );
        map.put ( 'z', h[i+25] );

        String s = new String ( word );
        int maxHeight =0;
        char[] ch = s.toCharArray();
        for(int j =0; j<ch.length; j++){

                int height = map.get ( ch[ j ] );
                if ( maxHeight < height ) {
                    maxHeight = height;

            }
        }
        int area = maxHeight * ch.length;
        System.out.println(area);


    }
}
