package leet_code_Contest;

public class Length_of_the_Longest_Alphabetical_Continuous_Substring {
    public static void main(String[] args) {
        System.out.println(longestContinuousSubstring("abcde"));
    }
    public static int longestContinuousSubstring(String s) {
        return longestContinuousSubstring2(s,0);

    }

    static int max = Integer.MIN_VALUE;
    static int count = 1;
    public static int longestContinuousSubstring2(String s,int idx) {

        if (idx == s.length()){
            return count;
        }


        if (idx+1!=s.length()){
            char ch1 = s.charAt(idx);
        char ch2 = s.charAt(idx+1);
        int ascii2 = (int) ch2;
            int ascii = (int) ch1;

            if (ascii+1 == ascii2){
                count++;
            }
            else {
                count = 0;
            }
            max =  Math.max(max,count);

        }

//        return idx;
        longestContinuousSubstring2(s,idx+1);
        return max;
    }
}
