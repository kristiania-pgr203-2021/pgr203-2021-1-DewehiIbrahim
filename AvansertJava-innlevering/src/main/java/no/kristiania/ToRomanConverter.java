package no.kristiania;

public class ToRomanConverter {
    static String[] rn_M = {"", "M", "MM", "MMM"};
    static String[] rn_C = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    static String[] rn_X = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    static String[] rn_I = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};


        public static String tesToRoman(int num) {

           // System.out.println(rn_I[num]);
            //return rn_I[num];

            String output="";
            String total=String.valueOf(num);


            if (num <= 9) {

                output= rn_I[spilt(total,0,1)];


            } else if (num <= 99) {

                output= rn_X[spilt(total,0,1)]+rn_I[spilt(total,1,2)];


            } else if (num <= 999) {
                output= rn_C[spilt(total,0,1)]+rn_X[spilt(total,1,2)]+rn_I[spilt(total,2,3)];


            } else if (num <= 3999){
                output= rn_M[spilt(total,0,1)]+rn_C[spilt(total,1,2)]+rn_X[spilt(total,2,3)]+rn_I[spilt(total,3,4)];
        }
            System.out.println(num + " is " + output + " in Roman");
            return output;
 }

    public static int spilt(String Total ,int start ,int end){

            int R1 = Integer.parseInt(Total.substring(start, end));

            return R1;


}
}



