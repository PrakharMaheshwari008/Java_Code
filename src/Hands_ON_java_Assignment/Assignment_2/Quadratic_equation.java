package Hands_ON_java_Assignment.Assignment_2;

import java.util.Scanner;

public class Quadratic_equation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextInt();
        double c = sc.nextInt();

        double a1 = Math.pow(b,2) - 4 * a * c;
        double res = 0;
        double res1 = 0;
        if (a1 > 0) {

            // two real and distinct roots
            res = (-b + Math.sqrt(a1)) / (2 * a);
            res1 = (-b - Math.sqrt(a1)) / (2 * a);

            System.out.println("First Root and Second Root"+res+" "+ res1);
        }

        // check if determinant is equal to 0
        else if (a1 == 0) {
            res = res1 = -b / (2 * a);

            System.out.println("First Root and Second Root"+res+" "+ res1);
        }

        // if determinant is less than zero
        else {
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-a1) / (2 * a);
            System.out.println("First Root and Second Root"+real+" + "+ imaginary  +"i");

        }
    }
}
