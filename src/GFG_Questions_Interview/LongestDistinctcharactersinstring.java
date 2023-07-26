package GFG_Questions_Interview;

import java.util.HashSet;

public class LongestDistinctcharactersinstring {
    public static void main(String[] args) {
        String str = "aldshflasghdfasgfkhgasdfasdgvfyweofyewyrtyefgv";
        System.out.println(longestSubstrDistinctChars(str));
    }
    static int longestSubstrDistinctChars(String S){
        int count  = 0;
        HashSet<Character> arr = new HashSet<>();
        int lar = 0;
        int j =0;
        int i = 0;
        while(i<S.length()){
            if(!arr.contains(S.charAt(i))){
                arr.add(S.charAt(i));
                i++;
            }else {
                arr.remove(S.charAt(j));
                j++;
            }
            lar = Math.max(lar, arr.size());
        }
        return lar;
    }
}
