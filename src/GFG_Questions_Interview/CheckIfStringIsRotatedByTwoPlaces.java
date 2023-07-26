package GFG_Questions_Interview;

public class CheckIfStringIsRotatedByTwoPlaces {
    public static void main(String[] args) {
      String  a = "geeksforgeeks";
       String b = "geeksgeeksfor";
        System.out.println(isRotated(a,b));
    }
    public static boolean isRotated(String str1, String str2) {
        // Your code here
        String ans = str1.substring(2) + str1.substring(0,2);
        String ans2 = str1.substring(str1.length()-2)+ str1.substring(0,str1.length()-2);
            if(ans.equals(str2) == ans2.equals(str2)) return true;
            return false;
        }
    }
