package CodeChef_Problems;

import java.math.BigInteger;
import java.util.Scanner;

public class Efficient_Pan_Linking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0) {
            long n = sc.nextLong();
            long pro = n/20;
            long num = pro * 20;
            long res = n - num;
            System.out.println(res);
        }
    }
}