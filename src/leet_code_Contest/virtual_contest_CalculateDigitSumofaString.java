package leet_code_Contest;
//
//
//You are given a string s consisting of digits and an integer k.
//
//        A round can be completed if the length of s is greater than k. In one round, do the following:
//
//        Divide s into consecutive groups of size k such that the first k characters are in the first group, the next k characters are in the second group, and so on. Note that the size of the last group can be smaller than k.
//        Replace each group of s with a string representing the sum of all its digits. For example, "346" is replaced with "13" because 3 + 4 + 6 = 13.
//        Merge consecutive groups together to form a new string. If the length of the string is greater than k, repeat from step 1.
//        Return s after all rounds have been completed.

public class virtual_contest_CalculateDigitSumofaString {
    public static void main(String[] args) {
//      String str1 = "12345678";
//      char[] chars = str1.toCharArray();
//      int sum = 0;
//      int k = 2;
//
//        String self1  = "";
//        int j = 0;
//        String int_to_str = "";
//        for (int i = j;i<chars.length;i++) {
//            sum = 0 ;
//
//            for(j = 0 ; j < k;j++){
//                sum = sum + Integer.parseInt(String.valueOf(chars[i]));
//                int_to_str = Integer.toString(sum);
//            }
//            self1 = self1 + int_to_str;
//        }
//        System.out.println(self1);

        System.out.println(find_digit_of_sum("1111133233222",3));


    }
    public static String find_digit_of_sum(String str , int k)
    { String resultStr = str;
        while(resultStr.length()>k){
            String temp  = "";

            for(int i = 0 ;i<resultStr.length();i=i+k){
                String substring = resultStr.substring(i,Math.min(i+k,resultStr.length()));
                int sum = 0;
                for(int j = 0;j<substring.length();j++){
                    sum = sum + Integer.parseInt(substring.charAt(j)+"");
                }
                temp = temp + sum;
            }
            resultStr = temp;
        }
        return resultStr;
    }
}
