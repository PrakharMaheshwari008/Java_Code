package Recursion_Hoga;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class permutation_by_recursion {

    public static void main(String[] args) {
//        permutations("","abc");
        ArrayList<String> ans = permutationList("", "abc");
        System.out.println(ans);
//        pratice();
//        permutations("","abc");
//        pratice();
    }

// ---------------------------- Recursive method --------------------------------
    static void permutations(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutations(f + ch + s, up.substring(1));
        }
    }
//    ----------------------------------- ArrayList_Iterative method ----------------------------------
    static ArrayList<String> permutationList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        //local to this call;
        int count = 0;
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            count++;
            ans.addAll(permutationList(f + ch + s, up.substring(1)));
        }
        System.out.println(count);
        return ans;
    }

    static void pratice() {
        String str[] =
                {
                        "Praveen Kumar",
                        "Yuvraj Singh",
                        "Harbhajan Singh",
                        "Gurjit Singh",
                        "Virat Kohli",
                        "Rohit Sharma",
                        "Sandeep Singh",
                        "Milkha Singh"
                };

        String surName = "Singh";
        int surNameSize = surName.length();

        int size = str.length;

        for (int j = 0; j < size; j++) {
            int length = str[j].length();
            // extracting the surname
            String subStr = str[j].substring(length - surNameSize);

            // checks whether the surname is equal to "Singh" or not
            if (subStr.equals(surName)) {
                System.out.println(str[j]);
            }
        }
    }
}