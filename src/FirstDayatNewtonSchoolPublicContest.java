import java.util.Scanner;

public class FirstDayatNewtonSchoolPublicContest {
    public static void main(String[] args) {
//        String inputStr = "ApPPle";
//        Boolean search = true;
//
//        int[] str_in = new int[inputStr.length()];
//        for(int i=0;i<inputStr.length();i++){
//            if(Character.isUpperCase(inputStr.charAt(i)) || Character.isLowerCase(inputStr.charAt(i))){
//                search = false;
//            }
//        }
//        if (search == true){
//            System.out.println("Gravity");
//        }
//        else {
//            System.out.println("Space");
//        }
        String input = "Apple";
        String input1 = "apple";
        Scanner sc = new Scanner(System.in);
        String input_user = sc.next();

        if(input.equals(input_user)){
            System.out.println("Gravity");
        }
        else if (input1.equals(input_user)){
            System.out.println("Gravity");
        }
        else{
            System.out.println("Space");
        }
    }
}