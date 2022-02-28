package com.company;
import java.util.Arrays;
// Prototype - de mindste dele

public class Main {

//en metode til at konvertere et enkelt bogstav om til et tal – altså så A er 1, B er 2, C er 3 og så videre.
//en metode til at konvertere et enkelt tal om til et bogstav – så 1 bliver til A, 2 til B, 3 til C og så videre.


    char[] bogstaver = {'0','A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X','Y', 'Z', 'Æ', 'Ø', 'Å' };
    char[] bogstav2 = new char[29];

    public void konvertereBogstavTilTal(){

        for (int i = 0; i < bogstaver.length ; i++) {
            System.out.println(i);

        }
    }

    public static void main(String[] args) {

        Main obj = new Main();

        obj.konvertereBogstavTilTal();


    }
}
