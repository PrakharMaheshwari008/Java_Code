package Hands_ON_java_Assignment.Assignment_2;

import java.util.Scanner;

public class Swap_num {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Enter 2 Integer");
        System.out.println("Using 3rd variable method");
        System.out.println("before Swap : \n"+ "A = " + num1 + " B = " + num2);
        // Using 3rd variable method
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println( "After Swap : \n"+ "A = " + num1 + " B = " + num2);
        System.out.println();
        System.out.println("Enter 2 Integer Again");
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        System.out.println("Using without 3rd variable method");


        num3 = num4+num3;
        num4 = num3-num4;
        num3 = num3-num4;
        System.out.println( "After Swap : \n"+ "A = " + num3 + " B = " + num4);

    }
    }
