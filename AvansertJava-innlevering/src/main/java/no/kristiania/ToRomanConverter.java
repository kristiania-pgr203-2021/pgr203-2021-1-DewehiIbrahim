package no.kristiania;

public class ToRomanConverter {

    public static String ToRoman(int number) {
        int romanResult = number;
        String output = "";

        if (romanResult >= 4){
            output += "IV";
            if  (romanResult >= 6){
                output +="VI";
                romanResult = romanResult -1;
            }
            romanResult = romanResult -1;
        } else if (romanResult >= 1 ){
            output += "I";
            romanResult = romanResult -1;
        }


     return output;
    }
}
