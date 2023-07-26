package GFG_Questions_Interview;

import java.util.HashMap;

public class CountSubArrayEqualToZeroAndOne {
    public static void main(String[] args) {
      int  n = 7;
       int A[] = {1,0,0,1,0,1,1};
        System.out.println(countSubarrWithEqualZeroAndOne(A,n));
    }
    static int countSubarrWithEqualZeroAndOne(int a[], int n) {

        int ans = 0, sum = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(0, 1);
        for (int val : a) {
            if (val == 0)
                sum += -1;
            else
                sum += 1;
            if (mp.containsKey(sum)) {
                ans += mp.get(sum);
                mp.put(sum, mp.get(sum) + 1);
            } else
                mp.put(sum, 1);

        }
        return ans;
    }
}
