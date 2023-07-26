package leet_code_Contest;

import java.util.Arrays;

public class Virtual_2_Maximum_Number_of_Groups {
    public static void main(String[] args) {
        int[] arr = {10,6,12,7,3,5};
        System.out.println(maximumGroups(arr));
    }

    public static int maximumGroups(int[] grades) {

        Arrays.sort(grades);
        int n = grades.length-1;
        int i = 0;
        int count = 1;
        int j = n;
        int large = grades[n];
        int temp = large;
        while(i < j){

            if(grades[i] + grades[j] > temp) {
                count++;
                temp = grades[i] + grades[j];
                i++;
                j--;
            }
           else if (grades[i] + grades[j] <= large){
                i++;
            }
        }
        return count;
    }
}
