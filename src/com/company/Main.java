package com.company;
import java.io.FilterOutputStream;
import java.util.Arrays;

public class Main {





    // modtage en char og returnere en int
    public int bogstavTilNummer(char bogstaverChar) {

        char[]  alfabet = {'0', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
            'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'Æ', 'Ø', 'Å'};

        int[] resultatInt = new int[alfabet.length];

        int i;
        for (i = 0; i < alfabet.length; i++) {
            resultatInt[i] = resultatInt[i] - '0';
            return i;
        }
        System.out.println(i);
        return -1;
    }

        public static void main (String[]args){

            Main obj = new Main();

            char charLetter = 'A';

            obj.bogstavTilNummer(charLetter);


        }
    }


