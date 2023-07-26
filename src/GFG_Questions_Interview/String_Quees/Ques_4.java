//package GFG_Questions_Interview.String_Quees;
//
//public class Ques_4 {
//    public static void main(String[] args) {
//        System.out.println(uncommon_String("geeksforgeeks","geeksquiz"));
//    }
//    public static String uncommon_String(String A, String B){
//        // size of the hash table
//        int MAX_CHAR = 26;
//        int present[] = new int[MAX_CHAR];
//        for (int i = 0; i < MAX_CHAR; i++)
//        {
//            present[i] = 0;
//        }
//
//        int l1 = A.length();
//        int l2 = B.length();
//
//        // for each character of str1, mark its
//        // presence as 1 in 'present[]'
//        for (int i = 0; i < l1; i++)
//        {
//            present[A.charAt(i) - 'a'] = 1;
//        }
//
//        // for each character of str2
//        for (int i = 0; i < l2; i++)
//        {
//
//            // if a character of str2 is also present
//            // in str1, then mark its presence as -1
//            if (present[B.charAt(i) - 'a'] == 1
//                    || present[B.charAt(i) - 'a'] == -1)
//            {
//                present[B.charAt(i) - 'a'] = -1;
//            }
//
//            // else mark its presence as 2
//            else
//            {
//                present[B.charAt(i) - 'a'] = 2;
//            }
//        }
//
//
//        String res = "";
//        // print all the uncommon characters
//        for (int i = 0; i < MAX_CHAR; i++)
//        {
//            if (present[i] == 1 || present[i] == 2)
//            {
//                res = (char) (i + 'a') + " ");
//            }
//        }
//        return res;
//    }
//
//
//}
