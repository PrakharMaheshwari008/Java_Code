package GFG_Questions_Interview;


import java.util.HashMap;

public class SecondMostRepeated {
    public static void main(String[] args) {
        String arr[] = {"aaa", "bbb", "ccc", "bbb", "aaa", "aaa"};
//        System.out.println(secFrequent(arr,arr.length));
        secFrequent(arr,arr.length);
    }


  static void secFrequent(String arr[], int n) {

        HashMap<String, Integer> hash = new HashMap<>();
        for (String val : arr) {
            hash.put(val, hash.getOrDefault(val, 0) + 1);
        }
        int j = 0;
        System.out.println(hash.get(hash.get(0)));
//        for (int i = 0; i < arr.length; i++) {
//            if (hash.get(i) <= hash.get(i + 1)){
//
//            }
//        }
        return;
    }
}

