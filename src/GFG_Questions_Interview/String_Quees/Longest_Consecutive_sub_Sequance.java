package GFG_Questions_Interview.String_Quees;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Longest_Consecutive_sub_Sequance {
    public static void main(String[] args) {
//        int[] arr ={6, 6, 2, 3, 1, 4, 1, 5, 6, 2, 8, 7, 4, 2, 1, 3, 4, 5, 9, 6};
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
//        long num = sc.nextLong();
        int[] arr = new int[index];
        for (int i = 0 ; i < index;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(findLongestConseqSubseq(arr,arr.length));
    }

    static int findLongestConseqSubseq(int arr[], int N)
    {
//        Arrays.sort(arr);
//        HashSet<Integer> hash = new HashSet<>();
//        for(int p : arr){
//            if(!hash.contains(p)){
//                hash.add(p);
//            }
//        }
//        int num = arr[0];
//        int count = 0;
//        for(int i = 0 ; i < hash.size();i++){
//            if(hash.contains(num)){
//                count++;
//                num++;
//            }
//            else{
//                return count;
//            }
//        }
//        return count;

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