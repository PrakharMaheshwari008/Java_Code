package CSES_fi_.Basic_ques;

import java.util.Arrays;
import java.util.Scanner;

public class Missing_Num {
    //    static int count = 0;
//    static int index = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long index = sc.nextLong();
        long[] arr = new long[(int) index];

        for (int i = 0; i < index-1; i++) {
            arr[i] = sc.nextLong();
        }
        long in = arr[0];
        System.out.println(missing(arr,in));

    }

    public static int missing(long[] arr,long index) {
//        Arrays.sort(arr);
//        int count= arr[0];
//        if (arr[index] != count)
//        {
//            return count;
//        }
//        index++;
//        count++;
//
//        return missing(arr);
//
//
//    }
        long count = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != count) {
                return (int) count;
            }
            count++;
        }
        return (int) count;
    }
}
