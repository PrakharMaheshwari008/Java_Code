package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Find_The_unique_value_among_Dupilicate {
    public static void main(String[] args) {
//        int[] arr = input_array();
        int[] arr = {2,2,3,4,4,4};
        System.out.println(unique_value(arr));
    }

//    public static int[] input_array() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the Index");
//        int index = sc.nextInt();
//        int[] array = new int[index];
//        for (int i = 0; i < index; i++) {
//            array[i] = sc.nextInt();
//        }
//        return array;
//    }

    public static ArrayList unique_value(int[] array) {
        int temp = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            int j ;
            for (j = i; j < array.length; j++) {
                if (i != j) {
                    if (array[i] == array[j]) {
                      arrayList.add(array[j]);
                      break;
                    }
                }
            }
//            if (j == array.length)
//            {
//                return arrayList;
//            }
    }


//    return Integer.MAX_VALUE;
        return arrayList;
    }
}