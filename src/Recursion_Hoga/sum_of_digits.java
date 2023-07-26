package Recursion_Hoga;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class sum_of_digits {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        System.out.println(sum_of_digits(input));

        List<List<Integer>> arr = new ArrayList<List<Integer>>();
        hello(arr);

    }

    public static int sum_of_digits(int input) {
        if (input == 0) {
            return 0;
        }
        return sum_of_digits(input / 10) + input % 10;

    }

    public static void hello(List<List<Integer>> arr) {
        List<Integer> arrCol = new ArrayList<Integer>();
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arrCol.size(); j++) {
                int x = scn.nextInt();
                arrCol.add(j, x);
            }
            arr.add(i, arrCol);
        }
    }


}

