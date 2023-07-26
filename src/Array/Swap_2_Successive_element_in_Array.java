package Array;

import java.util.Scanner;

public class Swap_2_Successive_element_in_Array {
    public static void main(String[] args) {
        int array_value[] = arr_input();
        System.out.println("Input Complete");
        int swaping[] = swap(arr_input());
        System.out.println("swaping Complete");
        System.out.println(swaping);

//        int[] arr  = new int[]{2,1,9,3,10,15};
//        int temp = 0;
//        for (int i = 0 ; i < arr.length;i=1+2)
//        {
//
//            temp = arr[i];
//            arr[i] = arr[i+1];
//            arr[i+1] = temp;
//        }
//
//            for (int i = 0; i < arr.length; i++) {
//                System.out.println(arr[i]);
//            }

    }
    public static int[] arr_input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input");
        int  index = sc.nextInt();
        int[] arr = new int[index];
        System.out.println("Enter Array Element");
        for (int i = 0; i <index;i++)
        {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static int[] swap(int[] arr)
    {
        int temp = 0;
        for (int i = 0 ; i < arr.length;i=1+2)
        {

            temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        return arr;
    }
    public static int[] printing(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        return arr;
    }
}
