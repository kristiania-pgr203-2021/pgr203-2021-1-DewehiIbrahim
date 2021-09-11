package no.kristiania;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number you would like to convert to RomanNumeral");
        int scanNumber = scanner.nextInt();

        if (scanNumber <= 1 || scanNumber > 3999){
            System.out.println(" Pliz type in a number between 1 and 3999");

        } else {
            ToRomanConverter.tesToRoman(scanNumber);
            scanner.close();
        }


    }
}
