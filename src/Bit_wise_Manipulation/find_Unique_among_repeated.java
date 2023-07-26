package Bit_wise_Manipulation;

public class find_Unique_among_repeated {
    public static void main(String[] args) {
        int[] arr = {2,3,4,3,4,2,6};
        System.out.println(find_unique(arr));
     }
    private static int find_unique(int[] arr){
        int unique = 0;

        for (int n : arr)
        {
            unique^=n;
        }
        return unique;
    }
}
