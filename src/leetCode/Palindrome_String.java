package leetCode;

public class Palindrome_String {
    public static void main(String[] args) {
     String s =    "A man, a plan, a canal: Panama";
//     s.toLowerCase();

        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int i = 0;
        int j = s.length()-1;
        while(i!=j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }

        }
        return true;
    }
}
