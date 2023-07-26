package HackerRank;

import java.util.Scanner;

public class diagonal_Differnce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        int[][] arr = new int[index][index];
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0;i< index;i++){
            for (int j = 0 ; j<index;j++)
            {
                arr[i][j] = sc.nextInt();

            }

        }
         for (int i = 0;i< index;i++){
            for (int j = 0 ; j<index;j++) {

                if (i==j) {
                    sum1+=arr[i][j];
                }
                if (i+j==index-1)
                {
                    sum2+=arr[i][j];
                }
            }

        }
        System.out.println(Math.abs(sum1-sum2));
    }
}
