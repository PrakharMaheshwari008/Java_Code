package GFG_Questions_Interview;

import java.util.HashSet;

public class Duplicate_String_remove {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.println(removeDuplicates(str));
    }
    static String removeDuplicates(String str) {

        char[] ch = str.toCharArray();
        HashSet<Character> hesh = new HashSet<>();
        String str1 = "";

        for(char i : ch){
            if(!hesh.contains(i)){
                hesh.add(i);
                str1+=i;
            }
        }
        return str;

    }
}
