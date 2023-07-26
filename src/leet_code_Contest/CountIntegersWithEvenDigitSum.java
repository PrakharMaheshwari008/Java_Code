package leet_code_Contest;

import Linked_List.LL_Insertion;

import java.util.Scanner;

public class CountIntegersWithEvenDigitSum {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(countEven(input));
    }
    public static int countEven(int num) {

        int result = 0;
        int store1 = 0;
        int store = 0;
        int store2 = 0;
//        int siz
        for(int i = 1; i<=num ; i++) {
             // System.out.print(i+" ");
                store1 = i % 10;

                store = i/10;

                store2 = store1 + store;
                if (store2 % 2 == 0) {
                result++;
                        }
        }
        return result;

    }
}
