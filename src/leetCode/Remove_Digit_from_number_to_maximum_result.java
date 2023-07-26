package leetCode;

import java.util.ArrayList;
import java.util.Collections;

public class Remove_Digit_from_number_to_maximum_result {
    public static void main(String[] args) {
        System.out.println(find_digit_max("1231",'1'));
    }
    public static ArrayList find_digit_max(String str, char str1) {
//        char[] arr = str.toCharArray();
//        ArrayList<String> arrayList = new ArrayList<String>();
//        for (int i = 0 ; i < arr.length;i++)
//        {
//            StringBuilder ab = new StringBuilder();
//            for (int j = 1  ; j < arr.length-1;j++) {
//                if (arr[j] == str1) {
//                    arr[j] = arr[j + 1];
//                    ab.append(arr[j]);
//                }
//            }
//            arrayList.add(ab.toString());
//        }
////        List<Integer> list = new ArrayList<Integer>();
////        Integer max = Collections.max(list);
////        String listString = String.join((CharSequence) ", ", (CharSequence) list);
//
//        return arrayList;4
        int n;
        String s = str;
        char[] sr = s.toCharArray();
        n = s.length();
        String ans = "";
        for (int i = n; i >= 0; i--) {
            if (sr[i] == str1) {
//             ans = Collections.max(s.substring(0,i)+s.substring(i+1) ,ans)
            }

        }

//    }
        return null;
    }
}