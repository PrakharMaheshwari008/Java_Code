package GFG_Questions_Interview;

public class Seconf_Larget_elem_Array_without_sorting_tapping_gfg {
    public static void main(String[] args) {
        int[] ar = {7,4,0,9};
        System.out.println(second_Sec_large(ar));
//        System.out.println(first_large(ar));
        System.out.println(trapping(ar, ar.length));
//        second_Sec_large(ar);
    }

        public static long trapping(int[] arr ,int n) {

        // Your code here
        long water = 0;
        int[] l_max = new int[n];
        int[] r_max = new int[n];

        l_max[0] = arr[0];

        for (int i = 1; i < n; i++) {
            l_max[i] = Math.max(arr[i], l_max[i - 1]);
        }

        r_max[n - 1] = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            r_max[i] = Math.max(arr[i], r_max[i + 1]);
        }

        for (int i = 1; i < n - 1; i++) {
            water += Math.min(l_max[i], r_max[i]) - arr[i];
        }
        return water;
    }
    public static int second_Sec_large(int[] arr)
    {
        int get_max = 1;
        int second = 0;
        for(int i = 0 ; i< arr.length;i++)
        {
            int getvalue = arr[i];
            if(get_max == 1)
            {
                get_max = getvalue;
                second = arr[1];
            }
            else {
                if (get_max < getvalue)
                {
                    second = get_max;
                    get_max = getvalue;

                }
                else if (second < getvalue && getvalue != get_max){
                    second = getvalue;
                }
                else {

                }
            }
        }
        return second;

    }
}
