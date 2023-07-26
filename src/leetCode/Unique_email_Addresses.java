package leetCode;

import java.util.HashSet;
import java.util.Set;

public class Unique_email_Addresses {
    public static void main(String[] args) {
        String[] str = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};

        System.out.println(numUniqueEmails(str));
    }
//            public static void main(String[] args) {
//                String str = "India is my country";
//                str = (charRemoveAt(str, 7));
//            }
//
//            public static String charRemoveAt(String str, int p) {
//                return str.substring(0, p) + str.substring(p + 1);
//
//
////    public static void main(String[] args)
////    {
////        String MyString = "Hello World";
////        System.out.println("The string before removing character: " + MyString);
////        MyString = MyString.replace(" ", "");
////        System.out.println("The string after removing character: " + MyString);
//    }

    public static int numUniqueEmails(String[] emails) {
        Set<String> sanitization = new HashSet<>();
        for (String email :emails)
        {
            String updateEmail = getSantizeEmail(email);
            sanitization.add(updateEmail);
        }
        return sanitization.size();

    }

    private static String getSantizeEmail(String email) {
        String localName = "";
        int i = 0;
        while (i<email.length() && email.charAt(i) != '@')
        {
            if (email.charAt(i) == '.')
            {
                i++;
            }
            else if (email.charAt(i) == '+') {
                while (i < email.length() && email.charAt(i) != '@') {
                    i++;
                }
            }
            else {
                localName += email.charAt(i);
                i++;
            }
        }
        i++;
        String domain = "";
        while (i<email.length())
        {
//            System.out.println(i);
            domain += email.charAt(i);
            i++;
        }
        return localName + " @ "+ domain;
    }

}
