import java.util.ArrayList;

public class school_gfg_element_eql_index {
    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(valueEqualToIndex(arr,arr.length));
    }

   static ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        int idx= 1;
        ArrayList<Integer> arr1 = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == idx) {
                arr1.add(idx);
            }
            idx++;
        }
        return arr1;
    }
}
