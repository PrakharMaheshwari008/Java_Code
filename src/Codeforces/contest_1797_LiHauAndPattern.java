package Codeforces;

import java.util.Scanner;

public class contest_1797_LiHauAndPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextInt();
        while (t--> 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[][] v = new int[n][n];
            for(int i = 0 ; i < n;i++){
                for(int j = 0; j < n;j++){
                    v[i][j] = sc.nextInt();
                }
            }
            int ans = 0;
            for (int i = 0 ; i < n;i++){
                for (int j = 0;j < n;j++){
                    if((v[i][j] ^ v[n-i-1][n-j-1]) == 1){
                        ans++;
                    }
                }
            }
            ans = ans/2;

            if (ans > k){
                System.out.println("No");
            }else if (n%2 != 0){
                System.out.println("Yes");
            }else if ((k - ans) % 2 == 0){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }

    }
}
