package Coding_challenages;

public class reverse_Number {
    public static void main(String[] args) {
        String str =  "1 2 3";
        System.out.println(num(str));

    }
    public static String num(String str) {
        String strNew = "";

        int len = str.length()-1;
        for(int i  = len;i<=0; i--){
//            strNew = str.charAt(i);
        }
        return strNew;
    }
}
