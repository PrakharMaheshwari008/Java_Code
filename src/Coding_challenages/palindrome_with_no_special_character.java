package Coding_challenages;

public class palindrome_with_no_special_character {
    public static void main(String[] args) {
//        String str= "This#string%contains^special*characters&.";
        String str=  "Anne, I vote more cars race Rpme-to-Vienna";
        System.out.println(palidrom(str));
    }
    public static String palidrom(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(str);
        int i =  0;
        int len = str.length()-1;
//        String find = String.valueOf(true);
        while (i<len){
//            if (i == len/2 ){
//                return find;
//            }
            if (str.charAt(i) != str.charAt(len)){
                return String.valueOf(false);
            }
            i++;
            len--;
        }
        return String.valueOf(true);
    }
}