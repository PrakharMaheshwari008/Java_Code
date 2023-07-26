package leet_code_Contest;

import java.util.ArrayList;
import java.util.Arrays;

public class LargestNumberAfterDigitSwapsbyParity {
    public static void main(String[] args) {
//        System.out.println(splitViaString(35468453));
//    }
//
//    public static ArrayList<Integer> splitViaString(int number) {
//
//        ArrayList<Integer> result = new ArrayList<>();
//        String s = Integer.toString(number);
//
//        for (int i = 0; i < s.length(); i++) {
//            result.add(s.charAt(i) - '0');
//
//        }
//        System.out.println("Entire number");
//        System.out.println(result);
//
//        for (int i = 0; i < s.length()-1; i++) {
//            int first = result.get(0);
//
//            if (result.get(i) % 2 == 0) {
//                if (result.get(i + 1) > result.get(i)) {
////                    int temp = result.get(i);
//                    result.set(i + 1, result.get(i));
//                    result.set(i, result.get(i + 1));
//                }
//                System.out.println("********* Even Itration *********");
//                System.out.println(result.get(i));
//            }
//            if (result.get(i) % 2 != 0) {
//                if (result.get(i + 1) > result.get(i)) {
////                    int temp = result.get(i);
//                    result.set(i + 1, result.get(i));
//                    result.set(i, result.get(i + 1));
//                }
//            }
//            System.out.println("********* Odd Itration *********");
//            System.out.println(result.get(i));
//        }
//
//        return result;
//        ***************************************************************************************
//        int[] arr = {1,2,3,4};
//        for(int i = 0 ; i<arr.length;i++)
//        {
//            for (int j = i+1;j<arr.length;j++)
//            {
//                if(arr[i]%2 == 0)
//                {
//                    if (arr[i]<arr[j])
//                    {
//                        arr[i]=arr[j];
//                    }
//                }
//                else {
//                    if (arr[i]<arr[j])
//                    {
//                        arr[i]=arr[j];
//                    }
//                }
//            }
//        }

        int[] arr = {1,2,3,4};
        int num = 1234;
        String str = Integer.toString(num);
        int len = str.length();
        int[]arr1 = parity(arr);
        System.out.println(Arrays.toString(arr1));

    }
    public static int[] parity(int[] arr)
    {
//        int[] arr = {1,2,3,4};
        for(int i = 0 ; i<arr.length;i++)
        {
            for (int j = i+1;j<arr.length;j++)
            {
                if(arr[i]%2 == 0 && arr[j] %2 ==0)
                {
                    if (arr[i]<arr[j])
                    {
                        int temp = arr[i];
                        arr[i]=arr[j];
                        arr[j] = temp;
                    }
                    else{
                    }
                }
                if(arr[i]%2!=0 && arr[j] %2 !=0) {
                    if (arr[i]<arr[j])
                    {
                        int temp = arr[i];
                        arr[i]=arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        return arr;
    }
}
