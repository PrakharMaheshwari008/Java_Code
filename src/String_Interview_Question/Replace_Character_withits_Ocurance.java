package String_Interview_Question;

public class Replace_Character_withits_Ocurance {
    public static void main(String[] args) {
        String input = "deloitte";
        char charToReplace = 't';

        if (input.indexOf(charToReplace) == -1);{
            System.out.println("Given Character Not Available In Input String");
            System.exit(0);
        }
        int cnt = 1;
        for(int i=0;i<input.length();i++)
        {
            char ch = input.charAt(i);
            if (ch == charToReplace)
            {
                input = input.replaceFirst(String.valueOf(charToReplace),String.valueOf(cnt));
            }
        }

    }
}
