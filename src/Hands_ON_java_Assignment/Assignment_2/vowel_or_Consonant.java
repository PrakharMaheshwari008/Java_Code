package Hands_ON_java_Assignment.Assignment_2;

import java.util.Scanner;

public class vowel_or_Consonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Character ch = sc.next().charAt(0);
        if (ch =='a' || ch =='e' ||ch =='i' ||ch =='o' ||ch =='u' ){
            System.out.println(ch +" is a vowel");
        }
        else {
            System.out.println(ch + " is a Consonant ");
        }
    }
}
