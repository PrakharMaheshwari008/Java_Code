package coding_ninja_contest_Ques;

public class make_it_Even {
    public static void main(String[] args) {
        int[] arr = {2,1,4,6};
        System.out.println(makeItEven(4,arr));
    }

    public static int makeItEven(int n, int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2 != 0) {
                count++;
                arr[i] = arr[i] + 1;
            }
        }
        return count;
    }
}