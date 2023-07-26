package Array;

import java.util.Scanner;

public class Printing_Array {
    public static void main(String[] args) {
        int taking_input[] = array_input();
        printing_array(taking_input );
    }
    public static int[] array_input()
    {
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        int[] a = new int[index];
        for (int i = 0; i < index; i++)
        {
            a[i] = sc.nextInt();
        }
        return a;
    }
    public static void printing_array(int a[])
    {
        int get_index = a.length;
        for (int j : a) {
            System.out.print(j + " ");
        }
        for(int i = 0 ; i < get_index ; i++)
        {
            System.out.print(a[i]+" ");
        }
    }

}
