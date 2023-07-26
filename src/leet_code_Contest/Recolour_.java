package leet_code_Contest;

public class Recolour_ {
    public static void main(String[] args) {
        String s = "BWWWBB";
        System.out.println(minimumRecolors(s,6));
    }
    public static int minimumRecolors(String blocks, int k) {
        int max = 0;
        for(int i =0 ;i <= blocks.length()-k;i++){
            int count =0;
            for(int j = i ;j < k+i;j++){
                if(blocks.charAt(j)=='B'){
                    count++;
                }
            }
            max = Math.max(max,count);
        }
        return k-max;
    }
}
