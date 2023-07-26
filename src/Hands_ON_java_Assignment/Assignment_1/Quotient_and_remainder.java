package Hands_ON_java_Assignment.Assignment_1;

import java.util.Scanner;

public class Quotient_and_remainder {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();

        int quo = num/10;
        int rem = num%10;
        System.out.println("Quotient: "+quo +"\nRemainder : " + rem);

    }
}
