package GFG_Questions_Interview;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Chocolate_Distribution_Problem {
    public static void main(String[] args) {
        ArrayList<Long> arr1 = new ArrayList<>(Arrays.asList(3L, 4L, 1L, 9L, 56L, 7L, 9L, 12L));
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(3, 4, 1, 9, 56, 7, 9, 12));
        System.out.println(findMinDiff(arr,8,5));
    }
    public static long findMinDiff(ArrayList<Integer> a, long n, long m)
    {
        // your code here
        Collections.sort(a);

        long maxValue=Long.MAX_VALUE;
        long x=m-1;

        for(int i=0;x<n;i++)
        {
            long val=a.get((int)x) - a.get((int)i);


            if(val<maxValue)
                maxValue=val;
            x++;
        }
        return maxValue;

    }
}