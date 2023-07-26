package Imutable_class_creation;

import java.util.HashMap;

public class count_no {
    public static void main(String[] args) {
        String str  = "ABCDABC";
        char [] ch1 = str.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        for (Character ch : ch1){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);

    }
}
