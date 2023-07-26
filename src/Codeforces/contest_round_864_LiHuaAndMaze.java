package Codeforces;

import java.util.Scanner;

public class contest_round_864_LiHuaAndMaze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc -- > 0){
            int row = sc.nextInt();
            int col = sc.nextInt();
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            System.out.println(Math.min(helper(row,col,x1,y1),helper(row,col,x2,y2)));
        }
    }
        public static int helper ( int row, int col, int x, int y){
            if ((x == 1 && y == 1) || (x == row && y == 1) || (x == 1 && y == col) || (x == row && y == col)) {
                return 2;
            }
            if (x == 1 || x == row || y == 1 || y == col) {
                return 3;
            }
            if (x >= 1 && x <= row && y >= 1 && y <= col) {
                return 4;
            }
            return 0;
        }
    }
