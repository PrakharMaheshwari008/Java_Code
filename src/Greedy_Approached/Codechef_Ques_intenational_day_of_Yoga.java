package Greedy_Approached;

import java.util.Scanner;

public class Codechef_Ques_intenational_day_of_Yoga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lm = sc.nextInt();
        int bm = sc.nextInt();
        int no_of_hall = sc.nextInt();
        int hl = sc.nextInt();
        int hb = sc.nextInt();

        if(lm>hl){
            System.out.println(0);
            return;
        }
        if(bm>hb){
            System.out.println(0);
            return;
        }
        int tlm = hl/lm;
        int tbm = hb/bm;
        int total_no_met = tlm * tbm * no_of_hall;
        System.out.print(total_no_met);
    }
}
