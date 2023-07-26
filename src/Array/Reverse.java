package Array;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int index = sc.nextInt();
        int[] arr = new int[index];

        for(int i = 0 ; i < index ;i++){
            arr[i] = sc.nextInt();
        }

        for(int i = index-1; i>= 0 ; i--){
            System.out.print(arr[i]+" ");
        }
    }
}
