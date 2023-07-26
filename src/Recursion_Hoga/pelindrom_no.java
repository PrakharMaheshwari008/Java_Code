package Recursion_Hoga;

import java.util.Scanner;

public class pelindrom_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        reverse(input);
        System.out.println(sum);
        System.out.println(palindrom(input));
    }

    public static boolean palindrom(int input)
    {
        if (sum == input)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
    static int sum;
    public static void reverse(int n)
    {
        if (n==0)
        {
            return;
        }
        int lastRem = n%10;
        sum = sum *10 + lastRem;
        reverse(n/10);
    }

}
