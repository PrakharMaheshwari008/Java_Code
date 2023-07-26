package GFG_Questions_Interview;
import java.util.Arrays;

public class Longest_Consecutive_Number {
    public static void main(String[] args) {
        int[] arr = {2,6,1,9,4,5,3};
        int N = 7;
        System.out.println(findLongestConseqSubseq(arr,N));
    }
    static int findLongestConseqSubseq(int[] arr, int N)
    {        // Sorting the given array.
        Arrays.sort(arr);
        // Storing length of longest consecutive sequence.
        int mx = 0;
        int count = 0;
        for (int i = 0; i < N; i++) {
            // Check if the previous value is consecutive to the current value.
            if (i > 0 && (arr[i] == arr[i - 1] + 1)) {
                count++;
            }
            // Skip if the current value is equal to the previous value.
            else if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            // Resetting count for next upcoming consecutive sequence.
            else {
                count = 1;
            }
            mx = Math.max(mx, count);
        }
        return mx;
    }

}
