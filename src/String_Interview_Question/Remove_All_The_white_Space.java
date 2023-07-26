package String_Interview_Question;

public class Remove_All_The_white_Space {
    public static void main(String[] args) {

//        \\s --> it's  a single white space...
        String str = "  j  a  va  s   ta   r   ";
        String str1 = str.replaceAll("\\s","");
        System.out.println(str1);
    }
}
