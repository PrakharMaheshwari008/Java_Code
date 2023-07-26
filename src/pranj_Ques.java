import java.util.Scanner;

public class pranj_Ques {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please Enter 1  or 0");

            int index = sc.nextInt();
        for(int i =0 ; true ;i++) {
            if (index == 1 ){
                System.out.println("Enter marks:");
                int mark = sc.nextInt();
                if (mark ==0){
                    break;
                }
                if (mark >= 90){
                    System.out.println("This is Good");
                }
                else if(mark >= 60){
                    System.out.println("This is also well");
                }
                else {
                    System.out.println("This is good as well");
                }
            }
            if (index ==0){
                break;
            }
        }
    }
}
