package no.kristiania;

public class ToRomanConverter {
    static String[] rn_M = {"", "M", "MM", "MMM"};
    static String[] rn_C = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    static String[] rn_X = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    static String[] rn_I = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

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

        public static void tesToRoman(int num){

            System.out.println(rn_I[num]);



        }
    }
