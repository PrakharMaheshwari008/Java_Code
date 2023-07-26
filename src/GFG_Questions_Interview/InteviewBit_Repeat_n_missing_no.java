package GFG_Questions_Interview;

import java.util.*;

public class InteviewBit_Repeat_n_missing_no {
    public static void main(String[] args) {
        ArrayList<Integer> repe = new ArrayList<>(Arrays.asList(3,1,2,5,3));
        System.out.println(repeatedNumber(repe));
    }
    public static ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        ArrayList<Integer> repe = new ArrayList<>();

        Map<Integer, Boolean> numberMap
                = new HashMap<>();

        int max = A.size();

        for (Integer i : A) {

            if (numberMap.get(i) == null) {
                numberMap.put(i, true);
            }
            else {
               repe.add(i);
            }
        }
        for (int i = 1; i <= max; i++) {
            if (numberMap.get(i) == null) {
                repe.add(i);
            }
        }

        return repe;
    }
}
