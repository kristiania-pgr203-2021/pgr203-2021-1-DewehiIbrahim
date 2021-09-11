package no.kristiania;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write a number you would like to convert to RomanNumeral");
        int scanNumber = scan.nextInt();

        if (scanNumber < 1 || scanNumber > 3999){
            System.out.println(" type in a number between 1 and 3999");

        } else {
            ToRomanConverter.tesToRoman(scanNumber);
            scan.close();
        }


    }
}
