package GFG_Questions_Interview;
import java.util.HashSet;
import java.util.Scanner;
public class Ques_9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        int[] arr = new int[index];
        for (int i = 0 ; i < index;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(firstNonRepeating(arr,index));
    }
   static int firstNonRepeating(int arr[], int n)
    {
        HashSet<Integer> hset = new HashSet<>();
        int non_rept = 0;
        for (int i = 0 ;i < n ;i++){
            if (!hset.contains(arr[i])){
                non_rept = arr[i];
            }
            hset.add(arr[i]);
        }
        return non_rept;

    }
}
