package Hands_ON_java_Assignment.Assignment_2;

import java.util.Scanner;

public class Even_or_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        even_odd(num);
    }
    public static void even_odd(int num){
        if(num % 2 == 1){
            System.out.println(num + " is Odd");
        }
        else{
            System.out.println(num + " is Even");

        }

    }
}
