package leetCode;

public class PercentageofLetter_inString {
    public static void main(String[] args) {
        System.out.println(percentageLetter("sgawtb",'s'));
    }
    public static int percentageLetter(String s, char letter) {

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (letter == s.charAt(i)) {
                count++;
            }
        }
        int len = s.length();
//        if (count >=1) {
//                 float result = ( (float)count /(float)len ) * 100;
//                 int res = (int) Math. ceil (result);
//                 return res;
//        }
            return (count *100 ) / len;
        }
    }
