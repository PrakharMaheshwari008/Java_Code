import java.util.Arrays;
import java.util.Scanner;

public class rough {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        int[] arr = new int[index];

        for (int i = 0 ; i < arr.length-1;i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        for (int i= 0; i < arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
