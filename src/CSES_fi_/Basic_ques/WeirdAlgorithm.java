package CSES_fi_.Basic_ques;

import java.util.Scanner;

public class WeirdAlgorithm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        weird(n);

    }
    public static void weird(long n)
    {
//        Loop Approach *****************
//       while (n >=1) {
//           if (n==1){
//               System.out.println(1);
//               return;
//           }
//           if (n % 2 == 0) {
//               System.out.println(n);
//               n = n / 2;
//           }
//           if (n % 2 != 0 && n!=1) {
//               System.out.println(n);
//               n = n * 3 + 1;
//           }
//       }

//        Recursive Approach *****************


        if (n==1){
            System.out.print(1);
            return;
        }
        if (n%2==1 && n !=1)
        {
            System.out.print(n+" ");
            weird(n*3+1);
        }
        if (n%2 ==0)
        {
            System.out.print(n+" ");
            weird(n/2);
        }
    }
}
