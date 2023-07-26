package GFG_Questions_Interview;

import java.util.HashSet;

public class find_pair_given_differsnce {
    public static void main(String[] args) {
        int[] arr = {1,2,6,3,4};
        System.out.println(findPair(arr,arr.length,0));
    }
    public static boolean findPair(int arr[], int size, int n) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        for (int i : arr) {
            int temp = n +i;
            if (set.contains(temp)){
                return true;
            }
        }
        return false;
    }
}

