package GFG_Questions_Interview;
import java.util.HashSet;
import java.util.Scanner;

public class key_pair {
    public static void main(String[] args) {
//       int N = 6, X = 16;
//       int[] Arr = {1, 4, 45, 6, 10, 8};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] Arr = new int[n];

        for (int i = 0 ;i < n;i++){
            Arr[i] = sc.nextInt();
        }
        System.out.println(hasArrayTwoCandidates(Arr,n,x));
    }
   static boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        // code here
        HashSet<Integer> hash = new HashSet<>();

        for(int num : arr){
            int temp =(x-num);
            if(hash.contains(temp)){
                return true;
            }else {
                hash.add(num);
            }
        }
        return false;

    }
}
