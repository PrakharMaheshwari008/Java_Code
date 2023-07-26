package Infy_Tq_pratice_Ques;

import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {
      print_Sol();


    }

    public static void print_Sol() {
        Scanner sc = new Scanner(System.in);
        int Index = sc.nextInt();
        int[] arr1 = new int[Index];
        int len = arr1.length;
        int sum = 0;
        for (int i = 0; i < len ; i++)
        {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0 ; i < len; i ++)
        {
//            while (i<len) {
            if (arr1[i] <= 8 && arr1[i]>=5){
                    System.out.println(arr1[i]);
                }
//            len--;

            if (arr1[i]>8 && arr1[i]<5){
                    sum = sum+arr1[i];
                System.out.println(sum);

                }
    }

}
}
