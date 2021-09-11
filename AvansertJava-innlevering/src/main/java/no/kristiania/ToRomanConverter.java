package no.kristiania;

public class ToRomanConverter {

    public static String  ToRoman(int number) {

        String output = "";
        if (number >= 9) {
            output += "IX";


        } else if (number >= 6) {
                output += "VI";

            } else if (number >= 4) {
                output += "IV";


            } else if (number >= 1) {
                output += "I";

            }

            return (output);
        }
    }
