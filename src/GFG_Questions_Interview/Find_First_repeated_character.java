package GFG_Questions_Interview;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class Find_First_repeated_character {

    public static void main(String[] args) {
        System.out.println(firstRepChar("geeksforgeeks"));
    }

    static String firstRepChar(String s) {
//        HashSet set = new HashSet();

//        for (int i = 0 ; i< s.length();i++){
//            set.add(s.charAt(i));
//        }
//        String str = "";
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                return String.valueOf(s.charAt(i + 1));
//            if (set.contains(s.charAt(i))){
//             return String.valueOf(s.charAt(i));
            }
        }
        return "-1";

//        ******************************** Another Approach ***************************

//        HashMap<Character,Integer> sh = new HashMap<>();
//
//    }

    }
}
