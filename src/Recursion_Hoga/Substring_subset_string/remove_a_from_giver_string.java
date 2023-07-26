package Recursion_Hoga.Substring_subset_string;

import java.util.function.Supplier;

public class remove_a_from_giver_string {
    public static void main(String[] args) {
        skips_Alpha("","baccadac");
        System.out.println(skip_Alpha_string("paopojaoapa"));
        System.out.println(skipApple_Str("apdsdapaappleafm"));
        System.out.println(skipappNotApple("apdappsdapaappleafm"));
    }

    // return void method
    static void skips_Alpha(String processed, String unprocess)
    {
        if (unprocess.isEmpty()) {
            System.out.println(processed);
            return;
        }
        char ch = unprocess.charAt(0);

        if(ch == 'a')
        {
            skips_Alpha(processed,unprocess.substring(1));
        }
        else {
            skips_Alpha(processed +ch ,unprocess.substring(1));
        }
//        return string method;

    }
    public static String skip_Alpha_string(String unprocess1)
    {
        if (unprocess1.isEmpty()) {
            return "";
        }
        char ch = unprocess1.charAt(0);
        if (ch == 'a')
        {
            return skip_Alpha_string(unprocess1.substring(1));
        }
        else {
            return ch+ skip_Alpha_string(unprocess1.substring(1));
        }
    }


//     Now New Ques: is Remove the entire string Like apple:

    static String skipApple_Str(String unprocess)
    {
        if (unprocess.isEmpty())
        {
            return "";
        }
        if (unprocess.startsWith("apple"))
        {
           return skipApple_Str(unprocess.substring(5));
        }
        else {
           return unprocess.charAt(0) + skipApple_Str(unprocess.substring(1));
        }
    }
    static String skipappNotApple(String unprocess)
    {
        if (unprocess.isEmpty())
        {
            return "";
        }
        if (unprocess.startsWith("app") && !unprocess.startsWith("apple"))
        {
            return skipappNotApple(unprocess.substring(3));
        }
        else {
            return unprocess.charAt(0) + skipappNotApple(unprocess.substring(1));
        }
    }

}
