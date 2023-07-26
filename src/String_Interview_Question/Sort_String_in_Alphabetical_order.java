package String_Interview_Question;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sort_String_in_Alphabetical_order {
    public static void main(String[] args) {
        String str = "java";
        char arr[] = str.toCharArray();
        char temp;
        for (int i = 0;i<arr.length;i++)
        {
            for (int j =i+1;j<arr.length;j++)
            {
                if (arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(new String(arr));



//        ******************************************************
        String str1 = "java";
        char[] charArray = str1.toCharArray();
        Arrays.sort(charArray);
        System.out.println(new String(charArray));

    }
}
