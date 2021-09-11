package no.kristiania;

public class ToRomanConverter {

    public static String ToRoman(int number) {
        int romanResult = number;
        String output = "";

        if (romanResult >= 1 ){
            output += "I";
            romanResult = romanResult -1;
        }


     return output;
    }
}
