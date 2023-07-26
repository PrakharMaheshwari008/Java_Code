package Recursion_Hoga.Substring_subset_string;

import java.util.ArrayList;
import java.util.List;

public class Subsequence_permutaition {
    public static void main(String[] args) {
        subseq("","ABC");
        System.out.println(subseqReturn("", "abc"));
        subseqAscii("", "abc");
        System.out.println("************************************");
        System.out.println(subseqReturnAscii("", "abc"));
        System.out.println("***********************************");
        int arr[] = {1,2,3,4};
        List<List<Integer>> list = subSet(arr);
        System.out.println(list);
    }
    static void subseq(String processed, String unprocessed)
    {
        if (unprocessed.isEmpty())
        {
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        subseq(processed+ ch, unprocessed.substring(1));
        subseq(processed,unprocessed.substring(1));
    }

//     By Arraylist : ->
    static ArrayList<String> subseqReturn(String p, String up){
        if (up.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseqReturn(p + ch,up.substring(1));
        ArrayList<String> right = subseqReturn(p, up.substring(1));
        left.addAll(right);
        return left;
    }
    static void subseqAscii(String processed, String unprocessed)
    {
        if (unprocessed.isEmpty())
        {
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        subseq(processed+ ch, unprocessed.substring(1));
        subseq(processed,unprocessed.substring(1));
        subseq(processed + (ch+0),unprocessed.substring(1));
    }
    static ArrayList<String> subseqReturnAscii(String p, String up){
        if (up.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseqReturn(p + ch,up.substring(1));
        ArrayList<String> right = subseqReturn(p, up.substring(1));
        ArrayList<String> Ascii = subseqReturn(p + (ch+0), up.substring(1));
        left.addAll(right);
        left.addAll(Ascii);
        return left;
    }

//    List method..
    static List<List<Integer>> subSet(int[] arr)
    {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num: arr)
        {
            int n = outer.size();
            for (int i = 0 ;i<n ;i++)
            {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;

//        Time Complexity of the same:-
//        O(N * 2^n)        n --> no. of subsets

//        Space complexity of the program
//        0(2^n * N)       2^n --> Total no of subset  && N --> space taken by each subset:O(N);


    }
}
