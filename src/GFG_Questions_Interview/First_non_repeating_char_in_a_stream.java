package GFG_Questions_Interview;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class First_non_repeating_char_in_a_stream {
    public static void main(String[] args) {
        String str = "hhrqcvsvszpsjammdr";
        System.out.println(hashtag(str));
    }

    private static String hashtag_Ques(String A){
        int[] a = new int[26];
        int n=A.length();
        String str = "";
        Queue<Character> que = new LinkedList<>();

        for(int i=0;i<n;i++){
            char ch = A.charAt(i);
            int val = ch - 'a';
            a[val]++;

            if(a[val] <= 1)
                que.add(ch);
            else
                que.remove(ch);

            if(que.isEmpty())
                str += '#';
            else
                str += que.peek();
        }
        return str;
    }

    private static String hashtag(String str){
        int stage = 1;
        StringBuilder ans = new StringBuilder();
        HashSet<Character>  hash = new HashSet<>();
        for(int i = 0 ; i < str.length();i++) {
            if (hash.contains(str.charAt(i))){

//                hash.add(str.charAt(i));
//                hash.remove(str.charAt(i));
                hash.add('#');
                ans.append('#');
                stage = 1;
            }
            else {
                if (stage == 1){
                    hash.add(str.charAt(i));
                    ans.append(str.charAt(i));
                    stage = 0;
                }
                else if (stage == 0){

                    ans.append(ans.charAt(i-1));
//                    stage = 1;
                }
            }
        }

        return String.valueOf(ans);
    }
}
