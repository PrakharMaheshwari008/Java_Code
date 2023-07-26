package Bit_wise_Manipulation;

public class _find_odd_even {
    public static void main(String[] args) {
        int n = 68;
        System.out.println(odd_even(n));
    }
    private static boolean odd_even(int n){
        return (n & 1) == 1;
    }
}
