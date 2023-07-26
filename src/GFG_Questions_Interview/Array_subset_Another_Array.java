package GFG_Questions_Interview;

import java.util.Arrays;
import java.util.HashSet;

public class Array_subset_Another_Array {
    public static void main(String[] args) {
        long[] a1 = {11, 1, 13, 21, 3, 7};
        long[] a2 = {11, 3, 7, 1};
        System.out.println(isSubset(a1,a2,a1.length,a2.length));
    }
    public static String isSubset(long[] a1, long[] a2, long n, long m) {



        Arrays.sort(a1);
        Arrays.sort(a2);

        if(n < m){
            return "No";
        }

        HashSet<Long> hash = new HashSet<>();
        // HashSet<Integer> hash1 = new HashSet<>();
        for(long i : a1 ){
            if(!hash.contains(i)){
                hash.add(i);
            }
        }
        for(long p : a2){
            if(!hash.contains(p)){
                return "No";
            }
        }
        return "Yes";

    }
}
