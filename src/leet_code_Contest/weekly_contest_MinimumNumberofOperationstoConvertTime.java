package leet_code_Contest;

public class weekly_contest_MinimumNumberofOperationstoConvertTime {
    public static void main(String[] args) {
        String current = "02:30";
        int num = Integer.parseInt(current);
//        System.out.println(num);
        if (current.charAt(0)<current.charAt(1))
        {
            System.out.println(current.charAt(0));
            System.out.println("All Set");
            System.out.println(current.charAt(1));
        }
    }
}
