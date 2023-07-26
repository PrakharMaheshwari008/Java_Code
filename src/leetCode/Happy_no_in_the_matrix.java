package leetCode;

public class Happy_no_in_the_matrix {
    public static void main(String[] args) {
        int[][] arr = { { 3,7,8}, { 9,11,13 } ,{15,16,17}};
        System.out.println(happy_num(arr));
    }

    public static int happy_num(int[][] arr)
    {
        int result = 0;
        int min = arr[0][0];
        int max = arr[0][0];
        int start = 0;
        int end = 0;
        for (int i = 0;i<arr.length;i++) {

            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                    start = i;
                    end = j;
                }

            }
            for (int k = end ; k<arr.length;k++) {
                for (int j = start; j < arr.length; j++) {
                    if (arr[j][k] > max) {
                        max = arr[j][k];
                    }
                }
                if (max == min) {
                    result = max;
                    break;
                }
                break;
            }
        }

        

        return result;
    }
}
