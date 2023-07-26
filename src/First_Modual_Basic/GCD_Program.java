package First_Modual_Basic;

import java.util.Scanner;

public class GCD_Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int First_number = sc.nextInt();
        int Second_number = sc.nextInt();
        int  gcd = 1;
        for(int i = 1 ; i< First_number && i<Second_number ; i++)
        {

            if(First_number%i == 0&& Second_number %i == 0)
            {
                 gcd = i;
            }
        }
        System.out.printf("GCD of  %d and %d is %d", First_number, Second_number, gcd);

    }
}
