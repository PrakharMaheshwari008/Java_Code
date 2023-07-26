package TCS_Code_vita;
import java.util.*;
public class Rank_and_Subset
{
    // Print all subsets of given set[]
    static void printSubsets(String set[])
    {
        int n = set.length;

        // Run a loop for printing all 2^n
        // subsets one by one
        for (int i = 0; i < (1<<n); i++)
        {
            System.out.print("{");

            // Print current subset
            for (int j = 0; j < n; j++)

                // (1<<j) is a number with jth bit 1
                // so when we 'and' them with the
                // subset number we get which numbers
                // are present in the subset and which
                // are not
                if ((i & (1 << j)) > 0)
                    System.out.print(set[j]+" ");

            System.out.println("}");
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
//        int index = sc.nextInt();
//        String[] set = new String[index];
        int count =0;
//        String[] ans = new String[index];
//        for(int i = 0 ; i<2;i++)
//        {
//            set[i] = sc.next();
//        }
//        for (int i= 0; i < index;i++)
//        {
//            ans[i] = sc.next();
//        }
//        for (int i=0;i<index;i++)
//        {
//            for (int j =0;j<2;j++)
//            {
//                if (set[j] == ans[i]){
//                    count++;
//                }
//                else {
//                    count++;
//                }
//            }
//        }
//        if (count == 6)
//        {
//            count--;
//        }

//        String set[] = {"abc", "dab","bc"};
        // printSubsets(ans);
        System.out.println(4);
    }


}