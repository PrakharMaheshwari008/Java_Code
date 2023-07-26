package GFG_Ques;

public class specail_palindrom_String {
    public static void main(String[] args) {
        String str;
        str = "abaa";
        String str2 = "bb";

        for (int i = 0; i < str2.length();i++){
            char ch1 = str2.charAt(i);

            for (int j = 0 ;j <str.length();j++)
            {
                if (str.charAt(j) == ch1){
                    char ch2 = str2.charAt(i);
                    char sub = str.charAt(j);
                    str.replace(sub,ch2);
                }
            }
        }
        System.out.println(str);
    }
}
