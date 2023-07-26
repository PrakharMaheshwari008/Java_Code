package String_Interview_Question;

//import java.lang.invoke.SerializedLambda;
//import java.util.LinkedHashSet;
//import java.util.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharactersInString {
    public static void main(String[] args) {
        String str = "programming";
        StringBuilder sb1 = new StringBuilder();
        str.chars().distinct().forEach(c-> sb1.append((char)c));
        System.out.println(sb1);
//***********************************************************************
//        StringBuilder sb2 = new StringBuilder();
//        for(int i = 0;i<str.length();i++)
//        {
//            char ch = str.charAt(i);
//            int idx = str.indexOf(ch,i+1);
//            if (idx == -1)
//            {
//                sb2.append(ch);
//            }
//            System.out.println(sb2);
//        }
////        Approach -3****************************************
        char[]  arr = str.toCharArray();
        StringBuilder sb3 = new StringBuilder();
        for (int i = 0 ; i<arr.length;i++)
        {
            boolean repated = false;
            for (int j =  i+1;j<arr.length;j++)
            {
                if (arr[i] == arr[j]){
                    repated = true;
                    break;
                }
            }
            if (!repated)
            {
                sb3.append(arr[i]);
            }
        }
        System.out.println(sb3);
// Approach - 4;***************************************************************

        StringBuilder sb4 = new StringBuilder();
        Set<Character> set = new LinkedHashSet<>();
        for (int  i = 0;i<str.length();i++)
        {
            set.add(str.charAt(i));
        }
        for (Character c: set) {
            sb4.append(c);
        }
        System.out.println(sb4);
    }
}
