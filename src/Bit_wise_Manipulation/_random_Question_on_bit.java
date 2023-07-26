package Bit_wise_Manipulation;

//Space optimization using bit manipulations
//        There are many situations where we use integer values as index in array to see presence or absence, we can use bit manipulations to optimize space in such problems.
//        Let us consider below problem as an example.
//        Given two numbers say a and b, mark the multiples of 2 and 5 between a and b using less than O(|b – a|) space and output each of the multiples.
//        Note : We have to mark the multiples i.e save (key, value) pairs in memory such that each key either have value as 1 or 0 representing as multiple of 2 or 5 or not respectively.


//*********************************************************
//Approach 1 (Simple):
//        Hash the indices in an array from a to b and mark each of the indices as 1 or 0.
//        Space complexity : O(max(a, b))
//********************************************************
//Approach 2 (Better than simple):
//        Save memory, by translating a to 0th index and b to (b-a)th index.
//        Space complexity : O(|b-a|).


public class _random_Question_on_bit {
    public static void main(String[] args) {
//        this is the better approach with less space taken
        int a = 2;
        int b = 10;
        int optimize_size = Math.abs(b-a)+1;
        int[] arr = new int[optimize_size];
        for(int i  = a;i<=b;i++){
            if(i%2 == 0 || i%5 == 0){
                arr[i-a] = 1;
            }
        }
        for(int i  = a;i<=b;i++){
            if (arr[i-a] == 1){
                System.out.println(i);
            }
        }
    }

}
