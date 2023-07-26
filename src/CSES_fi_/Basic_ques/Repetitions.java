package CSES_fi_.Basic_ques;

public class Repetitions {
    public static void main(String[] args) {
        String str = "AAATTGGGGGGTCC";
        System.out.println(max_repetition(str));
    }
    public static int max_repetition(String str) {
        int[] arr = new int[5];
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'A') {
                arr[1] +=1;
            }
            else if (str.charAt(i) == 'C') {
                arr[2] +=1;
            }
            else if (str.charAt(i) == 'G') {
                arr[3] +=1;
            } else if (str.charAt(i) == 'T') {
                arr[4] += 1;
            }
            }
        return max(arr);
        }


        public static int max(int[] arr)
        {
            int max  = arr[0] ;
            for (int i = 0 ;i < arr.length;i++)
            {
                if (arr[i] > max)
                {
                    max = arr[i];
                }
            }
            return max;
        }
}
