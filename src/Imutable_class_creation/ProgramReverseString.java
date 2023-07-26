package Imutable_class_creation;

public class ProgramReverseString {
    public static void main(String[] args) {
        String str = "ABCDE";

        for(int i = str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i)+" ");
        }
    }
}
