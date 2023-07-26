package Recursion_Hoga;

import java.util.Scanner;

public class print_n_to_1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(" n to 1");
        count(n);
        System.out.println("1 to n");
        System.out.println(count1(n-1));

    }

    private static void count(int n)
    {
        if (n==0)
        {
            System.out.println(0);
            return;
        }
        else {
            System.out.println(n);
            count(n-1);
        }
    }
    private static int count1(int n)
    {
        if (n==0)
        {
            System.out.println(n);
//            return n;

        }
        else {
            return count1(n-1);


        }
        return n;
    }
}
