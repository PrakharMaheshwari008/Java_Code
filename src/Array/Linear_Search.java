package Array;

import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args) {
        int arr[] = Input_Array(5);
        System.out.println("Enter element to be search");
        Scanner sc = new Scanner(System.in);
        linear_search(arr,sc.nextInt());
    }
    public static int[] Input_Array(int index)
    {
        Scanner sc = new Scanner(System.in);
        int array = sc.nextInt();
        int[] arr = new int[index];
        for(int i = 0 ; i < index;i++)
        {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static int linear_search(int arr[], int element_to_be_search){
        for(int  i = 0 ; i <arr.length; i++)
        {
            if(arr[i] == element_to_be_search)
            {
                System.out.println("Data_Found:!!"+i);
                return i;


            }

        }
return -1;
    }
}
