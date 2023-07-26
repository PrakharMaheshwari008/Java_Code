package leet_code_Contest;
import java.util.HashMap;
import java.util.Scanner;

public class Biweekly_decodE_the_massege {
    public static void main(String[] args) {
        String messege = "";
        String key = "";
        System.out.println(decodeMessage(key,messege));
    }
    public static String decodeMessage(String key, String message) {
        HashMap<String, String> str = new HashMap<>();
//        StringBuilder sb =new StringBuilder();
        String st = "";
        Scanner sc = new Scanner(System.in);
        key = sc.nextLine();
        message = sc.nextLine();
        for (int i = 0; i < 26; i++) {
            str.put(key,message);
        }
        for (int i = 0 ; i< message.length();i++)
        {
            for(int j = 0; j < message.length();j++ )

                if (key.charAt(i) == message.charAt(j))
                {
                    st+=message.charAt(i);
                }
    }
        return key;

    }
}
