package Array;

import java.util.Scanner;

public class largest_value {
    public static void main(String[] args) {

        int arr[] = arr_input();
//        int value = largest(arr);
//        arr = greaterLesser(arr,5);
//        System.out.println(arr.toString());
//        System.out.println(value);

        System.out.println(greaterLesser(arr,5));
    }
    public static int[] arr_input()
    {
        Scanner sc = new Scanner(System.in);
        int  index = sc.nextInt();
        int[] arr = new int[index];

        for (int i = 0; i <index;i++)

        {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static int largest(int arr[]) {
//        int temp = 0; // OR
        //we would like to store the smallest value in the temp
//        through which we shall check with the next upcoming index ,
//        ie.. which one of largest and store in it.
//        Code for get smallest value
        int temp = Integer.MIN_VALUE;
        temp = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (temp < arr[i]) {

                temp = arr[i];
               }
        }
        return temp;
    }


    public static int[] greaterLesser(int[] A, int N){
        int arr[] = new int[N];
        for(int i = 1; i < A.length ; i++){
            A[i] = Math.abs(i - A[i]);
        }
        return A;
    }

    }