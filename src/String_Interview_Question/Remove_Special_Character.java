package String_Interview_Question;

public class Remove_Special_Character {
    public static void main(String[] args) {
//        "[^a-zA-Z0-9]" : get String with num
        String str = "$54@P#r%a#%kha@%%@25r";
        String removE_Sp_char = str.replaceAll("[^a-zA-Z]","");
        System.out.println(removE_Sp_char);
        String remove_Alpha_num = str.replaceAll("[a-zA-z0-9]","");
        System.out.println(remove_Alpha_num);
  }
}
