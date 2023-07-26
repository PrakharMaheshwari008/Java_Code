package leet_code_Contest;

public class one_zero_converted {
    public static void main(String[] args) {
        String s ="001011";
        System.out.println(rep(s));
    }
    public static int rep(String str){
      String str_new = "";
      int i = 0;
      int c = 0;
        StringBuilder strBuilder = new StringBuilder(str);
        for(i =0 ;i< str.length()-1;i++){
          if (strBuilder.charAt(i) == '0'){
              if (strBuilder.charAt(i+1) == '1'){
                  c++;
                  strBuilder.setCharAt(i,'1');
                  strBuilder.setCharAt(i+1,'0');
              }
          }
        }
        return c;
    }
    public static int secondsToRemoveOccurrences(String s) {
        int c =0;
        int j;
        for(int i = 0;i < s.length();i++){
            boolean check = false;
            for(j= 0 ;j < s.length()-1;j++){
                if(s.charAt(j) == '1'&& s.charAt(j+1) == '0'){
                    check = true;
                    swap(s.charAt(j),s.charAt(j+1));
                }
            }
            if(check){
                c++;
            }
            else{
                break;
            }
            j++;

        }
        return c;
    }
    public static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
