package leetCode;

import java.util.Arrays;

public class LongestSubstringwithAtLeast_K_RepeatingCharacters {
    public static void main(String[] args) {
        String str = "ababbc";
        int temp = str.charAt(0);
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        System.out.println(ch);
        for (int i = 0 ; i< ch.length;i++)
        {
//            if (ch[])
        }
    }
    public static int longest_string(String str,int k)
    {
        int temp = str.charAt(0);
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        System.out.println(ch);
//        for (int i  = 0 ;i< str.length();i++)
//        {
//
//        }
        return temp;
    }
}

